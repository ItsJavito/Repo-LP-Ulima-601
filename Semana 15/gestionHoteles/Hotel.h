#include <iostream>
using namespace std;

class Habitacion{
public: 
    int numero;
    bool ocupado;
    string nombre_huesped;
    Habitacion* siguiente_h;
    Habitacion(int numero);
    void imprimirHabitacion();
};

class Hotel{
public: 
    int cantLibres;
    int cantOcupadas;
    Habitacion* primer_h;
    Hotel();
    void agregarHabitacion(int numero);
    void eliminarHabitacion(int numero);
    bool checkinHuesped(int numero, string huesped);
    bool checkoutHuesped(string huesped);
    void mostrarHabitaciones();
};  