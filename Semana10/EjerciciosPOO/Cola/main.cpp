#include <iostream>
#include "cola.h"
using namespace std;

void testCola(Cola* cola){
    cola->encolar(1);
    cola->encolar(2);
    cola->encolar(3);
    cola->encolar(5);
    cola->encolar(4);
    cola->encolar(9);
    cola->encolar(10);
    cola->encolar(13);

    cout << "COLA " << endl; 
    cout << cola->toString() << endl;

    cout << "Servir : " << endl; 
    cout << cola->servir() << endl;
    cout << cola->servir() << endl;
    cout << cola->servir() << endl;

    cout << "COLA" << endl; 
    cout << cola->toString() << endl; 
}

int main(int argc, char* argv[]){

    string argu = argv[1];
    Cola* cola = nullptr;
    
    if(argu == "le"){
        cola = new LECola();
    }
    else if (argu == "Array"){
        cola = new ArrayCola();
    }
    testCola(cola);
    
    return 0; 
}