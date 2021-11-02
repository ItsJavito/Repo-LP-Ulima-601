#include <iostream>
#include <assert.h>
#include "pila.h"
using namespace std;

void testPilas(Pila* pila){
    pila->apilar(1);
    pila->apilar(5);
    pila->apilar(2);
    pila->apilar(9);

    cout << pila->toString() << endl;

    //probar el servir

    int numeroDeVuelto = pila->servir();

    cout << pila->toString() << endl;

    assert(numeroDeVuelto == 9); 
    // probar el buscar
    assert(pila->buscar(1) == true);
    assert(pila->buscar(9) == false); 
}

int main(int argc , char* argv[])
{
    string parametros = string(argv[1]);
    Pila* pila = nullptr; 

    if(parametros == "array"){
        pila = new ArrayPila();
    }
    else if(parametros == "le"){
        pila = new LEPila();
    }
    testPilas(pila); 
    return 0;
}