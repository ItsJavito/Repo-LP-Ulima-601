#include "persona.h"

//Metodo de instancia constructor
Persona::Persona(string nombre, bool programador, string lp, Perro* mascota){
    this->nombre = nombre;
    this->programador = programador;
    this->lp = lp;
    this->mascota = mascota; 
    Persona::cantidadInstancias++;
}
// Metodo de instancia destructor
Persona::~Persona()
{
    delete this->mascota; 
    Persona::cantidadInstancias--; 
}

//metodo
void Persona::saludar(){
    cout << "hola" << endl; 
}

void Persona::llegarCasa(){
    mascota->saludar("Hola"); //Se envia mensaje de Persona -> Perro
}

void Persona::aumentarCantidadInstancias()
{
    //De un metodo de clase no se puede utilizar un atributo de instancia
    //nombre = "Nombre Ejemplo";
    cantidadInstancias++;    
}

int Persona::cantidadInstancias = 0;