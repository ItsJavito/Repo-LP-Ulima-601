#include "cola.h"
#include <string> 
using namespace std;

// ------------- COLA ----------------
Cola::Cola(){}
Cola::~Cola(){}
bool Cola::buscar(int elemento){ return true ;}
int Cola::servir(){return -1; }
void Cola::encolar(int elemento){}
string Cola::toString(){ return "";}

//-----------LEPCOLA------------------

Elemento::Elemento(int valor){
    this->valor = valor;
    this->siguienteElemento = nullptr; 
}

string Elemento::toString(){
    return to_string(valor);
}

LECola::LECola(){
    this->primerElemento = nullptr;
    this->ultimoElemento = nullptr;
}

LECola::~LECola(){
    Elemento* elemento = this->primerElemento;
    while(elemento != nullptr){
        Elemento* temp = elemento;
        elemento = elemento->siguienteElemento;
        delete temp; 
    }
}
bool LECola::buscar(int elemento){
    Elemento* elem = this->primerElemento;
    while(elem != nullptr){
        if(elem->valor == elemento)
            return true;
        elem = elem->siguienteElemento;
    }
    return false;
}
int LECola::servir(){
    if(this->primerElemento == nullptr){
        cout << "NO HAY ELEMENTOS" << endl; 
        return -1;
    }
    int valor = this->primerElemento->valor;
    Elemento* temp = this->primerElemento;
    this->primerElemento = this->primerElemento->siguienteElemento;
    delete temp; 
    return valor;
}
void LECola::encolar(int elemento) {
    Elemento* nuevoElemento = new Elemento(elemento);
    if(this->primerElemento == nullptr){
        this->primerElemento = nuevoElemento;
        this->ultimoElemento = nuevoElemento;
    }else{
        this->ultimoElemento->siguienteElemento = nuevoElemento;
        this->ultimoElemento = nuevoElemento;
    }
}
string LECola::toString(){
    string res = "";
    Elemento* temp = this->primerElemento;
    while(temp != nullptr){
        res += temp->toString()+ " ";
        temp = temp->siguienteElemento;
    }
    return res; 
}

//--------ARRAYCOLA --------- 

ArrayCola::ArrayCola(){
    this->longitud = 0;
    this->arreglo = nullptr; 
}
ArrayCola::~ArrayCola(){
    delete [] arreglo; 
}
bool ArrayCola::buscar(int elemento){
    for(int i = 0; i < this->longitud ; i++){
        if(this->arreglo[i] == elemento)
            return true; 
    }
    return false; 
}

int ArrayCola::servir(){
    if(this->arreglo == nullptr){
        return -1;
    }
    int valor = this->arreglo[0];
    int* nuevoArreglo = new int[--this->longitud];
    for(int i = 0; i < this->longitud; i++){
        nuevoArreglo[i] = this->arreglo[i+1]; 
    }
    delete [] this->arreglo;
    this->arreglo = nuevoArreglo;
    return valor; 
}
void ArrayCola::encolar(int elemento){
    int* nuevoArreglo = new int[++this->longitud];
    if(arreglo == nullptr){
        nuevoArreglo[this->longitud-1] = elemento;
        arreglo = nuevoArreglo;
        return; 
    }
    nuevoArreglo[this->longitud-1] = elemento;
    for(int i = 0; i < longitud - 1; i++){
        nuevoArreglo[i] = this->arreglo[i];
    }
    delete[] this->arreglo;
    this->arreglo = nuevoArreglo;
}
string ArrayCola::toString(){
    string res = "";
    for(int i = 0; i < this->longitud; i++){
        res += to_string(this->arreglo[i]) + " ";
    }
    return res; 
}
