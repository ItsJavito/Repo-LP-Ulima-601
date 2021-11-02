#pragma once
#include "perro.h"
#include <iostream>
using namespace std; 

class Persona
{
    /*
    * - Propiedades de clase: Es una propiedad que se queda en la clase, cuando se pone static por ejemplo.
    * - Propiedades de instancia/objeto: Podemos acceder a ellos mediante una instancia
     */
public: 
    //atributos
    string nombre; 
    bool programador;
    string lp;  
    Perro* mascota; 
    //Propiedad de clase
    static int cantidadInstancias; 

    Persona(string nombre, bool programador, string lp, Perro* mascota);
    ~Persona();
    void saludar();
    void llegarCasa();
    static void aumentarCantidadInstancias();

};