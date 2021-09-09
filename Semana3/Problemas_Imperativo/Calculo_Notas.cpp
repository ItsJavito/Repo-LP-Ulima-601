#include <iostream>

enum Tipo {TA, EP, EF};

struct Nota{
    int valor;
    Tipo tipo;
    Nota* siguienteNota;
};
struct Alumno{
    std::string codigo;
    std::string carrera;
    Alumno* siguienteAlumno;
    Nota* notas; 
};
struct Seccion
{
    int numero;
    std::string curso;
    Alumno* alumnos = nullptr;
};

void registrar_alumno(Seccion* sec, std::string codigo, std::string carrera){
    Alumno* alum = new Alumno();
    alum->codigo = codigo; 
    alum->carrera = carrera; 
    alum->siguienteAlumno = nullptr;

    if(sec->alumnos == nullptr){
        sec->alumnos = alum;
    }else{
        Alumno* pAlum = sec->alumnos;
        while(pAlum->siguienteAlumno != nullptr){
            pAlum = pAlum->siguienteAlumno;
        }
        pAlum->siguienteAlumno = alum;
    }
}

void registrar_nota(Seccion* sec, std::string codigo ,int nota, Tipo tipo){
    Alumno* pAlum = sec->alumnos;
    Nota* alumNota = new Nota();
    alumNota->tipo = tipo;
    alumNota->valor = nota; 
    alumNota->siguienteNota = nullptr;
    
    while(pAlum != nullptr){
        if(pAlum->codigo == codigo){
            if(pAlum->notas == nullptr){
                pAlum->notas = alumNota;
            }
            else{
                Nota* pNota = pAlum->notas;
                while(pNota->siguienteNota != nullptr){
                    pNota = pNota->siguienteNota;
                }
                pNota->siguienteNota = alumNota;
            }
        }
    }
}

float calcular_promedio(Seccion* sec){
    float prom = 0.0f; int cont = 0;
    Alumno* pAlum = sec->alumnos;
    while(pAlum != nullptr){
        float promAlum = 0.0f;
        cont++;
        Nota* pNota = pAlum->notas;
        while(pNota != nullptr){
            if(pNota->tipo == Tipo::TA) promAlum += pNota->valor*3;
            else if(pNota->tipo == Tipo::EP) promAlum += pNota->valor*3;
            else if(pNota->tipo == Tipo::EF) promAlum += pNota->valor*4;
        }
        promAlum = promAlum / 10;
        prom += promAlum; 
        pAlum = pAlum->siguienteAlumno;
    }
    return prom / cont;
}

int main(){

    return 0;
}