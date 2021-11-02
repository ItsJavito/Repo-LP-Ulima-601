#include <iostream>
#include "persona.h"
#include "perro.h"
using namespace std; 

int main(){
/*     Persona persona1; // No usual de instanciar objetos
    Persona* persona2 = new Persona(); // OK 
    persona2->programador = true ;
    persona2->lp = "Matematicas";
    persona2->nombre = ""; 
    persona2->saludar(); 

    Persona* persona3 = new Persona();
    persona3->programador = false; */

    Perro* perro = new Perro("Firulais");

    Persona* persona2 = new Persona("Alan Turing", true , "Matematicas" , perro);
    persona2->saludar();
    persona2->llegarCasa();

    cout << perro->nombre << endl;; //error

    cout << "Cantidad de instancias " << Persona::cantidadInstancias << endl;

    return 0;
}