#include "Hotel.h"

//-------clase habitacion --------
Habitacion::Habitacion(int numero){
    this->numero = numero;
    this->nombre_huesped = "";
    this->siguiente_h = nullptr;
    this->ocupado = false; 
}

void Habitacion::imprimirHabitacion(){
    cout << "Habitacion " << this->numero << " : " 
    << (this->ocupado ? "Ocupado" : "Desocupado" ) << endl;     
}

//-----HOTEL ------------

Hotel::Hotel(){
    this->cantLibres = 0;
    this->cantOcupadas = 0;
    this->primer_h = nullptr;
}

void Hotel::agregarHabitacion(int numero){
    Habitacion* new_hab = new Habitacion(numero);
    if(this->primer_h == nullptr){
        this->primer_h = new_hab;
    }
    else{
        Habitacion* temp = this->primer_h;
        Habitacion* ant = nullptr;
        while(temp != nullptr && temp->numero < numero){
            ant = temp; 
            temp = temp->siguiente_h;
        }
        if(ant == nullptr){
            this->primer_h = new_hab;
            this->primer_h->siguiente_h = temp;
        }else{
            ant->siguiente_h = new_hab;
            new_hab->siguiente_h = temp;
        }
    }
    this->cantLibres++;
}

void Hotel::eliminarHabitacion(int numero){
    Habitacion* temp = this->primer_h;
    Habitacion* ant = nullptr;

    while(temp != nullptr){
        if(temp->numero == numero){
            //si es el primero
            if(ant == nullptr){
                this->primer_h = this->primer_h->siguiente_h;
            }else{
                ant->siguiente_h = temp->siguiente_h;
                delete temp;
            }
            this->cantLibres--;
            return;
        }
    }
}

bool Hotel::checkinHuesped(int numero, string huesped){
    Habitacion* temp = this->primer_h;
    while(temp != nullptr){
        if(temp->numero == numero && !temp->ocupado){
            temp->nombre_huesped = huesped;
            temp->ocupado = true;
            this->cantLibres--;
            this->cantOcupadas++;
            return true;
        }
        temp = temp->siguiente_h;
    }
    return false; 
}

bool Hotel::checkoutHuesped(string huesped){
    Habitacion* temp = this->primer_h;
    while(temp != nullptr){
        if(temp->nombre_huesped == huesped){
            //si marca como ocupado
            if(temp->ocupado){
                temp->ocupado = false;
                temp->nombre_huesped = "";
                this->cantOcupadas--;
                this->cantLibres++;
                return true; 
            }else{
                return false; 
            }
        }

        temp = temp->siguiente_h;
    }
    return false; 
}

void Hotel::mostrarHabitaciones(){
    Habitacion* temp = this->primer_h;
    int cont = 0;
    while(temp != nullptr){
        temp->imprimirHabitacion();
        if(temp->ocupado){
            cont++;
        }
        temp = temp->siguiente_h;
    }
    float ratio = 1.0f*cont / (this->cantLibres + this->cantOcupadas);
    cout << "Ratio de ocupacion: " << ratio << endl;
}