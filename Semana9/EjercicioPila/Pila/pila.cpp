#include "pila.h"
#include <string>

Pila::Pila(){}
Pila::~Pila(){}
bool Pila::buscar(int elemento){ return true ;}
int Pila::servir(){return -1; }
void Pila::apilar(int elemento){}
string Pila::toString(){ return "";}



// -----------------LEPILA ----------------------
Elemento::Elemento(int valor){
    this->valor = valor;
    this->siguienteElemento = nullptr; 
}

string Elemento::toString(){
    return to_string(valor); 
}

LEPila::LEPila(){
    this->primerElemento = nullptr; 
}

LEPila::~LEPila(){
    Elemento* pElemento = this->primerElemento;

    while(pElemento != nullptr){
        Elemento* elementoABorrar = pElemento;
        pElemento = pElemento->siguienteElemento;
        delete elementoABorrar;
    }
}
bool LEPila::buscar(int elemento){
    Elemento* pElemento = this->primerElemento;
    while(pElemento != nullptr){
        if(pElemento->valor == elemento){
            return true;
        }
        pElemento = pElemento->siguienteElemento;
    }
    return false; 
}
int LEPila::servir(){
    if(this->primerElemento == nullptr){
        return -1;
    }
    else{
        Elemento* elementoADesapilar = this->primerElemento;
        this->primerElemento = this->primerElemento->siguienteElemento;
        int valorADevolver = elementoADesapilar->valor;
        delete elementoADesapilar;
        return valorADevolver;
    }
}
void LEPila::apilar(int elemento){
    Elemento* nuevoElemento = new Elemento(elemento);
    if(this->primerElemento == nullptr){
        this->primerElemento = nuevoElemento;
    }
    else{
        nuevoElemento->siguienteElemento = this->primerElemento;
        this->primerElemento = nuevoElemento;
    }
}
string LEPila::toString(){
    Elemento* pElemento  = this->primerElemento;
    string respuesta = "[ ";

    while(pElemento != nullptr){
        string cadElemento = pElemento->toString();
        if(pElemento->siguienteElemento == nullptr)
        {
            //Nos encontramos en el ultimo elemento
            respuesta += cadElemento;
        }
        else{
            respuesta += cadElemento + " , "; 
        }
        pElemento = pElemento->siguienteElemento;
    }
    respuesta += " ]";
    return respuesta; 
}

//-------------------------ArrayPila----------------------------
ArrayPila::ArrayPila(){
    longitud = 0;
    arreglo = nullptr; 
}
ArrayPila::~ArrayPila(){
    delete [] arreglo; 
}

bool ArrayPila::buscar(int elemento){
    for(int i = 0; i < this->longitud ; i++){
        if(elemento == this->arreglo[i]) return true; 
    }
    return false; 
}
int ArrayPila::servir(){
    if(arreglo == nullptr){
        return -1; 
    }

    int respuesta = this->arreglo[this->longitud - 1]; 
    int * nuevoArreglo = new int[--this->longitud];
    for(int i = 0 ; i < this->longitud ; i++){
        nuevoArreglo[i] = this->arreglo[i];
    }

    delete[] this->arreglo;
    this->arreglo = nuevoArreglo;

    return respuesta; 
}

void ArrayPila::apilar(int elemento){
    /*
        1. Creo el nuevo arreglo con longitud + 1
        2. Transferencia de datos del antiguo al nuevo
        3. Agrego el nuevo valor al final
        4. Liberar el espacio del arreglo antiguo
    */

    // 1. Crear el nuevo arreglo
    int* nuevoArreglo = new int[++longitud]; 
    if(arreglo == nullptr){
        nuevoArreglo[0] = elemento; 
        arreglo = nuevoArreglo;
        return; 
    }
    // 2. Transferencia de datos
    for(int i = 0; i < longitud-1 ; i++){
        nuevoArreglo[i] = this->arreglo[i];
    }
    
    // 3. Agrego el nuevo valor al final
    nuevoArreglo[longitud - 1] = elemento;

    // 4. Liberar el espcacio del arreglo
    delete[] this->arreglo;
    this->arreglo = nuevoArreglo; 
}
    
string ArrayPila::toString(){
    string respuesta = "[ ";
    for(int i = 0;  i < longitud ; i++){
        if(i == longitud - 1){
            respuesta += to_string(this->arreglo[i]);
        }else{
            respuesta += to_string(this->arreglo[i]) + ", "; 
        }
    }
    respuesta += " ]";
    return respuesta; 
}