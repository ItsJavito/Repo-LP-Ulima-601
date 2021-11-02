#include <iostream>
using namespace std; 

class Perro{
public: 
    string nombre; 
    Perro(string nombre){
        this->nombre = nombre;
    }
};

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

    //Metodo de instancia constructor
    Persona(string nombre, bool programador, string lp, Perro* mascota){
        this->nombre = nombre;
        this->programador = programador;
        this->lp = lp;
        this->mascota = mascota; 
        Persona::cantidadInstancias++;
    }
    // Metodo de instancia destructor
    ~Persona()
    {
        delete this->mascota; 
        Persona::cantidadInstancias--; 
    }

    //metodo
    void saludar(){
        cout << "hola" << endl; 
    }


    static void aumentarCantidadInstancias()
    {
        //De un metodo de clase no se puede utilizar un atributo de instancia
        //nombre = "Nombre Ejemplo";
        cantidadInstancias++;    
    }
};

int Persona::cantidadInstancias = 0;

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


    cout << perro->nombre << endl;; //error

    cout << "Cantidad de instancias " << Persona::cantidadInstancias << endl;

    return 0;
}