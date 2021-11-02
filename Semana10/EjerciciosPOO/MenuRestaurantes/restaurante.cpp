#include <iostream>
#include <iomanip>
#include "restaurante.h"
//------PLATO------
Plato::Plato(string nombre, string ventas){
    this->nombre = nombre;
    this->ventas = stoi(ventas);
    this->siguientePlato = nullptr; 
}

string Plato::get_nombre(){
    return this->nombre;
}

float Plato::get_ventas(){
    return this->ventas;
}

string Plato::to_string(){
    return this->nombre + "( "+ std::to_string((int) this->get_ventas()) + " )";
}

//----------Restaurante---------
Restaurante::Restaurante(string nombre, string direccion){
    this->primerPlato = nullptr;
    this->nombre = nombre;
    this->direccion = direccion;
    this->ventas = 0;
}
Restaurante::~Restaurante(){
    Plato* plato = this->primerPlato;
    while(plato != nullptr){
        Plato* temp = plato;
        plato = plato->siguientePlato;
        delete temp; 
    }
}

void Restaurante::add_plato(Plato* plato){
    if(this->primerPlato == nullptr){
        this->primerPlato = plato;
        this->ventas += plato->get_ventas();
        return;  
    }
    plato->siguientePlato = this->primerPlato;
    this->primerPlato = plato; 
}
Plato* Restaurante::get_plato(int i){
    int cont = 0;
    Plato* plato = this->primerPlato;
    while(plato != nullptr){
        if(cont == i){
            return plato; 
        }
        plato = plato->siguientePlato;
        cont++;
    }
    return nullptr;
}
//retorna el puntero al primer plato
Plato* Restaurante::get_platos(){
    return this->primerPlato;
}

void Restaurante::mostrar_platos(){
    Plato* plato = this->primerPlato;
    while(plato != nullptr){
        cout << plato->to_string() << endl; 
        plato = plato->siguientePlato;
    }
}

float Restaurante::calcular_ventas_totales(){return 0.0f;}
void Restaurante::generar_reporte_ventas(){};

//------ RestaurantePapitos--------

RestaurantePapitos::RestaurantePapitos(string nombre, string direccion) 
: Restaurante(nombre, direccion){}

float RestaurantePapitos::calcular_ventas_totales(){
    Plato* plato = this->primerPlato;
    float sum = 0.0f;
    while(plato != nullptr){
        sum += plato->get_ventas() * 1.0f;
        plato = plato->siguientePlato;
    }
    this->ventas = sum; 
    return this->ventas; 
}
void RestaurantePapitos::generar_reporte_ventas(){
    cout << "REPORTE DE VENTAS" << endl
    << "*******************************" << endl
    << "Restaurante Restaurante Papitos" << endl
    << "*******************************" << endl
    << "Menu: " << endl;
    Plato* plato = this->primerPlato;
    int cont = 1;
    while(plato != nullptr){
        cout << to_string(cont++) + ". " + plato->to_string() << endl;
        plato = plato->siguientePlato;
    }
    cout << "Ventas Totales: " << setprecision(4) << this->calcular_ventas_totales() << endl ;
    cout << "------------------------------" << endl; 
}

RestauranteLuisitos::RestauranteLuisitos(string nombre, string direccion) 
: Restaurante(nombre, direccion){}

float RestauranteLuisitos::calcular_ventas_totales(){
    Plato* plato = this->primerPlato;
    float sum = 0.0f;
    while(plato != nullptr){
        sum += plato->get_ventas() * 3.2f;
        plato = plato->siguientePlato;
    }
    this->ventas = sum; 
    return this->ventas; 
}
void RestauranteLuisitos::generar_reporte_ventas(){
    cout << "REPORTE DE VENTAS" << endl
    << "*******************************" << endl
    << "Restaurante Restaurante Luisitos" << endl
    << "*******************************" << endl
    << "Menu: " << endl;
    Plato* plato = this->primerPlato;
    int cont = 1;
    while(plato != nullptr){
        cout << to_string(cont++) + ". " + plato->to_string() << endl;
        plato = plato->siguientePlato;
    }
    cout << "Ventas Totales: " << this->calcular_ventas_totales() << endl ;
    cout << "------------------------------" << endl; 
}

