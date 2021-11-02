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

class Cola
{
public: 
    Cola();
    ~Cola();
    virtual bool buscar(int elemento);
    virtual int servir();
    virtual void encolar(int elemento);
    virtual string toString();
};

class LECola : public Cola
{
    //atributo de instancia
    Elemento* primerElemento; 
    Elemento* ultimoElemento; 

public: 
    LECola();
    ~LECola();
    bool buscar(int elemento) override;
    int servir() override;
    void encolar(int elemento) override; 
    string toString() override;
};

class ArrayCola : public Cola
{
    int longitud;
    int* arreglo; 
public: 
    ArrayCola();
    ~ArrayCola();
    bool buscar(int elemento) override;
    int servir() override;
    void encolar(int elemento) override; 
    string toString() override;
}; 