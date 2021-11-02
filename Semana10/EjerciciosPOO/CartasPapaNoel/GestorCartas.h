#include <iostream>
#include <vector> 
#include <algorithm> 
using namespace std; 

class CartaPapaNoel{
public:
    int tam;
    int edad; 
    string nombre;
    vector<string> regalos;
    CartaPapaNoel(string carta);
    string toString();
};

class Gestor{

    vector<CartaPapaNoel*> cartas; 
    int numeroCartas;
    long bytesUsados; 

public:
    Gestor();
    int ingresaCarta(CartaPapaNoel* carta);
    void borrarCarta(int num); 
    void OrdenarPorEdad(); 
    string toString();
};