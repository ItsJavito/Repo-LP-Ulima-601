#include "scrum.h"
using namespace std; 

int main(){

    Proyecto* p1 = new Proyecto();

    Sprint* s1 = new Sprint(123);
    Sprint* s2 = new Sprint(124);
    Sprint* s3 = new Sprint(125);
    
    p1->addSprint(s1);
    p1->addSprint(s2);
    p1->addSprint(s3);

    p1->agregarHistoria(111 , "Hola" , 12 , 123);
    p1->agregarHistoria(222 , "Hola" , 12 , 123);
    p1->agregarHistoria(333 , "Hola" , 12 , 123);

    p1->agregarHistoria(111 , "Hola" , 12 , 124);
    p1->agregarHistoria(222 , "Hola" , 12 , 124);

    p1->agregarHistoria(111 , "Hola" , 12 , 125);
    p1->agregarHistoria(222 , "Hola" , 12 , 125);

    p1->printProyecto();

    p1->moverHistoria(333 , s1 , s2);
    s1->sacarHistoria(111);
    
    cout << endl; 

    p1->printProyecto();
}