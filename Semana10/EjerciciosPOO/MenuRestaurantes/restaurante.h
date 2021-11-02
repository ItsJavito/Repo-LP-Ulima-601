#include <iostream>
using namespace std; 

class Plato{
    string nombre;
    float ventas;
public:
    Plato* siguientePlato;
    Plato(string nombre, string ventas);
    string get_nombre();
    float get_ventas();
    string to_string();
};

class Restaurante{

protected:
    Plato* primerPlato; 
    string nombre;
    string direccion;
    int ventas;
    
public:
    Restaurante(string nombre, string direccion);
    ~Restaurante();
    void add_plato(Plato* plato);
    Plato* get_plato(int i);
    //retorna el puntero al primer plato
    Plato* get_platos();
    void mostrar_platos();
    virtual float calcular_ventas_totales();
    virtual void generar_reporte_ventas();
};

class RestaurantePapitos : public Restaurante{
public:
    RestaurantePapitos(string nombre, string direccion);
    float calcular_ventas_totales() override; 
    void generar_reporte_ventas() override;
};

//dolares 3.2
class RestauranteLuisitos: public Restaurante{
public:
    RestauranteLuisitos(string nombre, string direccion);
    float calcular_ventas_totales() override; 
    void generar_reporte_ventas() override;
};

