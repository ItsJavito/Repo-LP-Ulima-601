#include <iostream>
#include "restaurante.h"
using namespace std; 

int main(){

    Restaurante* resL = new RestauranteLuisitos("Luisitos" , "Av. Brasil");
    resL->add_plato(new Plato("Cebiche","10"));
    resL->add_plato(new Plato("Carapulcra","40"));
    resL->add_plato(new Plato("Parrilla","30"));
    resL->generar_reporte_ventas();

    cout << endl; 

    Restaurante* resP = new RestaurantePapitos("Papitos" , "Av. Brasil");
    resP->add_plato(new Plato("Cebiche","10"));
    resP->add_plato(new Plato("Carapulcra","40"));
    resP->add_plato(new Plato("Parrilla","30"));
    resP->generar_reporte_ventas();

    return 0;
}