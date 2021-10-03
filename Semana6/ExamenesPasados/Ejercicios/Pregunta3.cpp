#include <iostream>

int main(){

    //Se pide el ingreso de el exponente
    int n; std::cin>> n;

    //creamos el arreglo que será devuelto
    int* ar = new int[n+1]; 
    ar[0] = 1;

    for(int expo = 1; expo <= n ; expo++){
        int numAnterior = 1, aux; 
        for(int i = 1; i < expo; i++){
            aux = ar[i]; //guardamos la variable antes de que la cambiemos
            ar[i] += numAnterior; // hacemos la suma con el numero anterior 
            numAnterior = aux; //el numero que guardamos en el aux lo asignamos a numAnterior
            /*
            1 
            1 1 
            1 2 1

            Usamos el numAnterior para sumar el 1 con el 2 y dps asignamos a numAnterior 
            el valor de 2 para sumarlo con el 1. 

            1 3 3 1
            */
        }
        ar[expo] = 1; 
    }

    /*
        El algoritmo de arriba soporta ingreso de numeros mayores a 10. 
    */
    for(int i = 0; i <= n; i++){
        std::cout << ar[i] << " ";
    }

    return 0;
}