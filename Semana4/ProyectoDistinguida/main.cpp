#include <iostream>

struct Letra;

struct Palabra
{
    int longitud; 
    std::string cadena;
    Letra* primeraLetra; 
};

struct Letra
{
    char valor; 
    Letra* siguienteLetra; 
};

Palabra* crearPalabra(std::string palabra){

    int longitudPalabra = palabra.length();

    Palabra* nuevaPalabra = new Palabra();
    nuevaPalabra->longitud = longitudPalabra;
    nuevaPalabra->cadena = palabra;

    Letra* pLetraAnterior = nullptr;

    for(int i = 0; i < longitudPalabra ; i++)
    {
        if(i == 0){
            //Primera Letra 
            Letra* letra = new Letra();
            letra->valor = palabra.at(i);
            letra->siguienteLetra = nullptr;

            nuevaPalabra->primeraLetra = letra;
            pLetraAnterior= letra;
        }
        else{
            Letra* letra = new Letra();
            letra->valor = palabra.at(i);
            letra->siguienteLetra = nullptr;
            pLetraAnterior->siguienteLetra = letra;
            pLetraAnterior = letra;
        }
    }
    return nuevaPalabra;
}

Letra* obtenerLetra(Palabra* palabra, int pos){
    Letra* pLetra = palabra->primeraLetra;
    int cont = 0;
    while(pLetra != nullptr){
        if(cont == pos) return pLetra;
        pLetra = pLetra->siguienteLetra;
        cont++;
    }
    return nullptr;
}

bool esPalindroma(Palabra* palabra){
    // r e c o n o c e r
    int tam = palabra->longitud;

    for(int i = 0; i < tam / 2; i++){
        Letra* pLetraIzquierda = obtenerLetra(palabra, i);
        Letra* pLetraDerecha = obtenerLetra(palabra, tam - 1 - i);

        if(pLetraIzquierda->valor != pLetraDerecha->valor)
            return false;
    }
    return true; 
}

Palabra* quitarLetra(Palabra* palabra , int pos){
    //Clonamos la plaabra
    Palabra* nuevaPalabra = crearPalabra(palabra->cadena);
    Letra* pLetra = nuevaPalabra->primeraLetra;
    Letra* pLetraAnterior = nullptr;
    int cont = 0;

    while(pLetra != nullptr){
        if(cont == pos){
            if(pLetraAnterior == nullptr){
                //es primera letra
                nuevaPalabra->primeraLetra = pLetra->siguienteLetra;
            }else{
                pLetraAnterior->siguienteLetra = pLetra->siguienteLetra;
            }
            nuevaPalabra->longitud--;
            delete pLetra;
            break;
        }
        cont++;
        pLetraAnterior = pLetra;
        pLetra = pLetra->siguienteLetra;
    }
    return nuevaPalabra;
}

bool esDPalindroma(Palabra* palabra){
    Palabra* nuevaPalabra = quitarLetra(palabra, palabra->longitud - 1);
    return esPalindroma(nuevaPalabra);
}
bool esIPalindroma(Palabra* palabra){
    Palabra* nuevaPalabra = quitarLetra(palabra, 0);
    return esPalindroma(nuevaPalabra);
}

int main(){
    //obtenemos una palabra del usuario
    std::string palabra;
    std::cin >> palabra;

    Palabra* palabraCreada = crearPalabra(palabra);
    bool palindroma = esPalindroma(palabraCreada);
    bool dPalindroma = esDPalindroma(palabraCreada);
    bool iPalindroma = esIPalindroma(palabraCreada);

    if(!palindroma && !dPalindroma && !iPalindroma){
        //Caso no sea distinguida
        std::cout << "La palabra NO ES distinguida" << std::endl;
    }
    else{
        //Es distinguida
        std::cout << "La palabra ES \"distinguida\" por que es:" << std::endl;
        if(palindroma) std::cout << "Palindroma" << std::endl;
        if(dPalindroma) std::cout << "d-Palindroma" << std::endl;
        if(iPalindroma) std::cout << "i-Palindroma" << std::endl;
    }

    return 0;
}