#include <iostream>

enum DiaSemana{
    Domingo, Lunes, Mates, Miercoles, Jueves, Viernes, Sabado //No poner tildes
};

int main(){
    DiaSemana diasSemana; // 0: domingo, 1: Lunes, 2:Martes, ..., 6: Sabado

    //...

    diasSemana = Domingo;

    if(diasSemana == Domingo || diasSemana == Sabado){
        //Es no laborable
    }
}