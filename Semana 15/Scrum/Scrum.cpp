#include "scrum.h"

HistoriaUsuario::HistoriaUsuario(int codigo, string nombre, int complejidad){
    this->codigo = codigo;
    this->nombre = nombre;
    this->complejidad = complejidad;
    this->completada = false;
    this->siguienteHistoria = nullptr;
}

void HistoriaUsuario::printHistoria(){
    cout << "\t< " << "Historia: " << this->codigo << " />" << endl;
}

// ---- Sprint--------

Sprint::Sprint(int numero){
    this->numero = numero;
    this->cantidad = 0;
    this->primeraHistoria = nullptr;
    this->siguienteSprint = nullptr;
}
void Sprint::agregarHistoria(int codigo, string nombre , int complejidad){
    HistoriaUsuario* new_h = new HistoriaUsuario(codigo, nombre, complejidad);
    HistoriaUsuario* temp = this->primeraHistoria;
    if(temp == nullptr){
        this->primeraHistoria = new_h;
    }
    else{
        while(temp->siguienteHistoria != nullptr){
            temp = temp->siguienteHistoria;
        }
        temp->siguienteHistoria = new_h;
    }
    this->cantidad++;
}
void Sprint::sacarHistoria(int codigo){
    HistoriaUsuario* temp = this->primeraHistoria;
    HistoriaUsuario* ant = nullptr;

    while(temp != nullptr){
        if(temp->codigo == codigo){
            if(ant == nullptr){
                this->primeraHistoria = this->primeraHistoria->siguienteHistoria;
                delete temp;
            }
            else{
                ant->siguienteHistoria = temp->siguienteHistoria;
                delete temp;  
            }
            break; 
        }
        ant = temp;
        temp = temp->siguienteHistoria;
    }
    this->cantidad--;
}
void Sprint::printSprint(){
    HistoriaUsuario* temp = this->primeraHistoria;
    cout << "< " << "Sprint: " << this->numero << " />" << endl;
    while(temp != nullptr){
        temp->printHistoria();
        temp = temp->siguienteHistoria;
    }
}

//-----Proyecto-------------

Proyecto::Proyecto(){
    this->cantidad = 0;
    this->primerSprint = nullptr;
}

void Proyecto::agregarHistoria(int codigo, string nombre, int complejidad , int n_sprint){
    Sprint* temp = this->primerSprint;
    while(temp != nullptr){
        if(temp->numero == n_sprint){
            temp->agregarHistoria(codigo, nombre, complejidad);
        }
        temp = temp->siguienteSprint;
    }
}

bool Proyecto::moverHistoria(int codigo, Sprint* src , Sprint* dst){
    HistoriaUsuario* temp = src->primeraHistoria;
    while(temp != nullptr){
        if(temp->codigo == codigo){
            dst->agregarHistoria(temp->codigo, temp->nombre, temp->complejidad);
            src->sacarHistoria(codigo);
            return true; 
        }
        temp = temp->siguienteHistoria;
    }
    return false; 
}

void Proyecto::addSprint(Sprint* newSprint){
    Sprint* temp = this->primerSprint;
    if(temp == nullptr){
        this->primerSprint = newSprint;
    }
    else{
        while(temp->siguienteSprint != nullptr){
            temp = temp->siguienteSprint;
        }
        temp->siguienteSprint = newSprint;
    }
}

void Proyecto::printProyecto(){
    Sprint* temp = this->primerSprint;
    while(temp != nullptr){
        temp->printSprint();
        temp = temp->siguienteSprint;
    }
}