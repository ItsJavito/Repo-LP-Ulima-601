#include <iostream>
using namespace std;

class HistoriaUsuario{
public:
    int codigo;
    string nombre;
    int complejidad;
    bool completada;
    HistoriaUsuario* siguienteHistoria;

    HistoriaUsuario(int codigo, string nombre, int complejidad);
    void printHistoria();
};

class Sprint{
public:
    int numero;
    int cantidad;
    HistoriaUsuario* primeraHistoria;
    Sprint* siguienteSprint;

    Sprint(int numero);
    void agregarHistoria(int codigo, string nombre , int complejidad);
    void sacarHistoria(int codigo);
    void printSprint();
};

class Proyecto{
public:
    int cantidad;
    Sprint* primerSprint;

    Proyecto();
    void agregarHistoria(int codigo, string nombre, int complejidad , int n_sprint);
    bool moverHistoria(int codigo, Sprint* src , Sprint* dst);
    void addSprint(Sprint* newSprint);
    void printProyecto();
};