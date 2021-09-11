#include <iostream>

enum Simbolo{nada, cruz, circulo};

struct Casilla{
    Simbolo simbolo;
    Casilla* casillaDerecha = nullptr;
    Casilla* casillaInferior = nullptr;
};

Casilla* armarTablero(int tam){
    //Primera Casilla top-left
    Casilla* root = new Casilla();
    root->simbolo = nada;
    Casilla* temp = root;
    //Filas
    for(int it = 1; it <= tam; it++){
        //Columnas
        //N -> N -> N-> Nullptr
        Casilla* tempj = temp; 
        for(int j = 1; j < tam; j++){
            Casilla* nextDer = new Casilla();
            nextDer->simbolo = nada;
            tempj->casillaDerecha = nextDer;
            tempj = tempj->casillaDerecha;
        }
        /*
        N -> N -> N-> Nullptr
        |
        N -> N -> N -> Nullptr
        |
        N -> N -> N -> nullptr
        */
        if(it < tam){
            Casilla* nextInf = new Casilla();
            nextInf->simbolo = nada;
            temp->casillaInferior = nextInf;
            temp = temp->casillaInferior;
        }
    }
    return root;
}

//suponiendo que la posicion izquierda arriba es (1,1) y abajo derecha es (tam , tam)
void colocarSimbolo(Casilla* tablero, int posFila, int posCol, Simbolo simbolo){
    Casilla* temp = tablero;
    for(int it = 1; it < posFila; it++){
        temp = temp->casillaInferior;
        if(temp == nullptr){
            std::cout << "No se puede acceder a esa posición" << std::endl;
            return;
        }
    }
    for(int it = 1; it < posCol; it++){
        temp = temp->casillaDerecha;
        if(temp == nullptr){
            std::cout << "No se puede acceder a esa posición" << std::endl;
            return;            
        }
    }
    if(temp->simbolo == nada)temp->simbolo = simbolo;
    else std::cout << "Este espacio ya esta ocupado" << std::endl;
}
void pintarPorSimbolo(Simbolo simbolo){
    std::string s;
    if(simbolo == nada) s = "N";
    else if(simbolo == cruz) s = "X";
    else if(simbolo == circulo) s = "O";
    std::cout << s << " ";
}

void pintar(Casilla* tablero){
    Casilla* temp = tablero;
    //Filas
    while(temp != nullptr){
        //Columnas
        Casilla* tempj = temp; 
        while(tempj != nullptr){
            pintarPorSimbolo(tempj->simbolo);
            tempj = tempj->casillaDerecha;
        }
        std::cout << std::endl;
        temp = temp->casillaInferior;
    }
}

Casilla* obtenerCasilla(Casilla* tablero, int fila, int columna){
    Casilla* temp = tablero;
    for(int it = 1; it < fila; it++){
        temp = temp->casillaInferior;
        if(temp == nullptr){
            std::cout << "No se puede acceder a esa posición" << std::endl;
            return nullptr;
        }
    }
    for(int it = 1; it < columna; it++){
        temp = temp->casillaDerecha;
        if(temp == nullptr){
            std::cout << "No se puede acceder a esa posición" << std::endl;
            return nullptr;            
        }
    }
    return temp;
}

bool obtenerGanador(Casilla* tablero, int tam, Simbolo simbolo){
    //Horizontalmente 
    int cont = 0;
    Casilla* temp = tablero;
    for(int it = 1; it <= tam; it++){
        cont = 0;
        Casilla* tempj = temp;
        for(int j = 1; j <= tam; j++){
            if(tempj->simbolo != simbolo) break;
            cont++;
            tempj = tempj->casillaDerecha;
        }
        if(cont == tam) return true;
        temp = temp->casillaInferior;
    }

    //diagonal top-Left -- bottom-right
    temp = tablero;
    cont = 0;
    for(int it = 1; it <= tam; it++){
        Casilla* tempj = temp;
        for(int j = 1; j < it; j++){
            tempj = tempj->casillaDerecha;
        }
        if(tempj->simbolo == simbolo) cont++;
        temp = temp->casillaInferior;
    }
    if(cont == tam) return true;

    // diagonal top-right -- bottom left
    temp = tablero;
    cont = 0;
    for(int it = 1; it <= tam; it++){
        Casilla* tempj = temp;
        for(int j = 1; j < tam - it + 1; j++){
            tempj = tempj->casillaDerecha;
        }
        if(tempj->simbolo == simbolo) cont++;
        temp = temp->casillaInferior;
    }
    if(cont == tam) return true;

    //Verticalmente
    cont = 0;
    for(int i = 1; i <= tam; i++){
        for(int j = 1; j <= tam; j++){
            Casilla* temp = obtenerCasilla(tablero, j, i);
            if(temp->simbolo == simbolo) cont++;
        }
        if(cont == tam) return true;
    }
    return false;
}

int main(){
    Casilla* tablero = armarTablero(3);
    colocarSimbolo(tablero, 1,3,cruz);
    colocarSimbolo(tablero, 2,2,cruz);
    colocarSimbolo(tablero, 2,2,cruz);
    pintar(tablero);
    if(obtenerGanador(tablero, 3, cruz)) std::cout << "Si";
    else std::cout << "NO" ;
    return 0;
}