#include "GestorCartas.h"

using namespace std; 
const int MAX_CARTAS = 1'000'000;
const long MAX_MEMORIA = 100'000'000;

CartaPapaNoel::CartaPapaNoel(string carta){
    this->tam = carta.size();
    int cont = 0; 
    string temp = "";
    for(int i = 0 ; i < this->tam && this->tam <= 100; i++){
        if(carta[i] == ','){
            if(cont == 0) this->nombre = temp;
            else if(cont == 1) this->edad = stoi(temp);
            else{
                if(regalos.size() < 3){
                    regalos.push_back(temp);
                }
                else break; 
            }
            temp = "";
            cont++;
            continue; 
        }
        temp += carta[i];
        // si falta todavia un regalo y esta al final
        if(i == carta.size() - 1){
            regalos.push_back(temp);
        }
    }
}

string CartaPapaNoel::toString(){
    string res = "";
    res += "< Nombre = " + this->nombre + ">\n"; 
    res += "< Edad = " + to_string(this->edad) + ">\n";
    res += "< Tamanio Carta = " + to_string(this->tam) + " bytes >\n";
    res += "< Regalos = ";
    for(int i = 0; i < this->regalos.size(); i++){
        res += this->regalos[i];
        if(i < this->regalos.size() - 1)
            res += ", ";
    }
    res += ">\n";
    return res; 
}

Gestor::Gestor(){
    numeroCartas = 0;
    bytesUsados = 0; 
    cartas.clear();
}

int Gestor::ingresaCarta(CartaPapaNoel* carta){
    if(this->bytesUsados + carta->tam < MAX_MEMORIA
       && this->numeroCartas + 1 < MAX_CARTAS)
    {
        cartas.push_back(carta);
        this->numeroCartas++;
        bytesUsados += carta->tam; 
        return 1;
    }
    return 0;
}
void Gestor::borrarCarta(int num){
    if(num >= 0 && num < this->cartas.size()){
        this->bytesUsados -= this->cartas[num]->tam;
        this->numeroCartas--;
        delete this->cartas[num];
        this->cartas.erase(cartas.begin() + num);
    }
}
void Gestor::OrdenarPorEdad(){
    
    // hacer un algoritmo burbuja o cualquier otro algoritmo de ordenamiento

    /* bubble sort 
    for(int i = 0; i < this->numeroCartas - 1; i++){
        for(int j = 0 ; j < this->numeroCartas - i - 1 ; i++ ){
            if(this->cartas[j]->edad > this->cartas[j+1]->edad)
                swap(this->cartas[j],this->cartas[j+1]);
        }
    }
    */

    //usando funciones lambda para ordenar
    sort(this->cartas.begin() , this->cartas.end() , [] (const CartaPapaNoel* a , const CartaPapaNoel* b)
    {
        return a->edad < b->edad;
    });
}

string Gestor::toString(){
    string res = "";

    res += "< numeroCartas = " + to_string(numeroCartas) + "> \n";
    res += "< bytesUsados = " + to_string(bytesUsados) + " > \n\n";
    for(auto &c: cartas){
        res += c->toString() + '\n';
    }
    return res; 
}