#include <iostream>

struct lista{
    int num;
    lista* next = nullptr; 
};

lista* solve(lista* PrimerPuntero, int pos){
    int cont = 0;
    //si la posicion es un negativo retornamos nullptr
    if(pos < 0) return nullptr; 

    lista* temp = PrimerPuntero;
    lista* ant  = nullptr; 

    while(temp != nullptr && cont < pos){
        cont++;
        ant = temp; 
        temp = temp->next;
    }

    //si es el primer elemento
    if(ant == nullptr) return temp->next;

    //se ha recorrido toda la lista
    if(temp == nullptr){
        //si la posición es mayor o igual al tamaño de la lista
        if(pos >= cont) return nullptr;
        //caso contrario al anterior le asignamos el valor de null para eliminar el último
        ant->next = nullptr;
        return PrimerPuntero;
    } 

    //si no es el primer elemento o el último entonces
    ant->next = temp->next;
    return PrimerPuntero;
}

void imprimir(lista* primer){

    if(primer == nullptr){
        std::cout << "Es nullpointer" << std::endl;
    }
    lista* temp = primer; 

    while(temp){
        std::cout << temp->num << " " ;
        temp = temp->next;
    }
    std::cout << std::endl;
}

int main(){
    
    lista* primer = new lista();
    lista* segundo = new lista();
    lista* tercero = new lista();

    primer->num = 2;
    primer->next = segundo;

    segundo->num = 4;
    segundo->next = tercero;

    tercero->num = 6;

    imprimir(solve(primer, 2));

    return 0;
}