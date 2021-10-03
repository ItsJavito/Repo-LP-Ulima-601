#include <iostream>

struct Celda
{
 int col;
 int valor = 0;
 Celda* siguienteCelda = nullptr;
};

struct Fila
{
 int numero;
 int cantCeldas = 0;
 Fila* siguienteFila = nullptr;
 Celda* primeraCelda = nullptr;
 Celda* ultimaCelda = nullptr;
};

struct Hoja
{
 Fila* primeraFila = nullptr;
 std::string nombre;
 int numFilas=0;
 int numColumnas=0;
};

void imprimirFila(Fila* fila){
    Celda* temp = fila->primeraCelda;
    while(temp != nullptr){
        std::cout << temp->valor << " ";
        temp = temp->siguienteCelda;
    }
    std::cout << std::endl;
}

Fila* crearFila(int cantCol){
    Fila* fila = new Fila();

    Celda* temp = new Celda();
    Celda* ult; 

    for(int i = 0; i < cantCol; i++){
        //en la primera iteración
        if(i == 0){
            fila->primeraCelda = temp;
            ult = temp; 
            continue;
        }
        temp->siguienteCelda = new Celda();
        temp = temp->siguienteCelda;
        ult = temp; 
    } 
    fila->ultimaCelda = ult;
    return fila; 
}

void agregarFila(Hoja* hoja){

    hoja->numFilas++;
    //si no tiene primera fila
    if(hoja->primeraFila == nullptr){
        Fila* fila = crearFila(hoja->numColumnas);
        hoja->primeraFila = fila;
        return; 
    }
    //en otro caso vamos hasta el penultimo elemnto de la lista 
    Fila* temp = hoja->primeraFila;
    while(temp->siguienteFila != nullptr){
        temp = temp->siguienteFila;
    }
    temp->siguienteFila = crearFila(hoja->numColumnas);
}

void imprimirHoja(Hoja* hoja){
    Fila* temp = hoja->primeraFila;

    while(temp != nullptr){
        imprimirFila(temp);
        temp = temp->siguienteFila;
    }
}

int main(){

    Hoja* hoja = new Hoja();
    hoja->numColumnas = 5;

    agregarFila(hoja);
    agregarFila(hoja);
    agregarFila(hoja);

    hoja->primeraFila->siguienteFila->ultimaCelda->valor = 2; 
    hoja->primeraFila->ultimaCelda->valor = 1; 

    imprimirHoja(hoja);

    return 0; 
}