#pragma once 
#include <iostream>

using namespace std;

class Elemento
{
public:
    int valor;
    Elemento* siguienteElemento;
    Elemento(int valor); 
    string toString();
};

class Pila
{
public: 
    Pila();
    ~Pila();
    virtual bool buscar(int elemento);
    virtual int servir();
    virtual void apilar(int elemento);
    virtual string toString();
};


class LEPila : public Pila
{
    //atributo de instancia
    Elemento* primerElemento; 

public: 
    LEPila();
    ~LEPila();
    bool buscar(int elemento) override;
    int servir() override;
    void apilar(int elemento) override; 
    string toString() override;
};

class ArrayPila : public Pila
{
    int longitud;
    int* arreglo; 
public: 
    ArrayPila();
    ~ArrayPila();
    bool buscar(int elemento) override;
    int servir() override;
    void apilar(int elemento) override; 
    string toString() override;
}; 