#include <iostream>
#include "GestorCartas.h"
using namespace std;


int main()
{
    Gestor* g = new Gestor();
    g->ingresaCarta( new CartaPapaNoel("David,15,carrito de madera,yoyo,carro\0"));
    g->ingresaCarta( new CartaPapaNoel("Jorge,13,carrito de metal,yoyo,trompo\0"));
    g->ingresaCarta( new CartaPapaNoel("Juan,9 ,carrito de madera,yoyo,carro\0"));
    g->ingresaCarta( new CartaPapaNoel("Maria,100,libro ,audifonos,camion\0"));

    g->OrdenarPorEdad();
    cout << g->toString() << endl;
    return 0;
}