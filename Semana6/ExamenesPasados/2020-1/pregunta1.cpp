#include <iostream>

struct Posicion
{
 int fila;
 int columna;
 int valor;
 Posicion* SiguienteFila = nullptr;
 Posicion* SiguientePos = nullptr; 
};

void imprimirFila(Posicion* pos){
    Posicion* temp = pos;
    while(temp != nullptr){
        std::cout << temp->valor << " "; 
        temp = temp->SiguientePos;
    }
    std::cout << std::endl;
}

void imprimirMatriz(Posicion* pos){
    Posicion* temp = pos;
    while(temp != nullptr){
        imprimirFila(temp);
        temp = temp->SiguienteFila;
    }
}

Posicion* construirMatrizIdentidad(int n){
    Posicion* res = new Posicion();

    Posicion* temp = res; 

    for(int i = 0; i < n; i++){

        Posicion* tempf = temp; 
        for(int j = 0; j < n ; j++)
        {
            tempf->columna = j;
            tempf->fila = i;
            if(i == j) tempf->valor =1;

            //hasta la penultima iteración
            if(j < n-1) tempf->SiguientePos = new Posicion();
            tempf = tempf->SiguientePos; 
        }
        //hasta la penultima iteracion
        if(i < n-1) temp->SiguienteFila = new Posicion(); 
        temp = temp->SiguienteFila;
    }
    return res; 
}

int main(){
    imprimirMatriz(construirMatrizIdentidad(6));
    return 0;
}