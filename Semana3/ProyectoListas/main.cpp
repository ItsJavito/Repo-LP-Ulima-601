#include <iostream>

struct Alumno{
    std::string codigo;
    std::string nombre;
    float nota;
    Alumno* siguienteAlumno;
    Alumno* anteriorAlumno; 
};

struct Seccion{
    std::string numero; 
    Alumno* primerAlumno;
};

void crearAlumno(Seccion* seccion, std::string codigo, std::string nombre){
    //[601]
    //  |
    //[A1] -> null
    Alumno* alumno = new Alumno();
    alumno->codigo = codigo;
    alumno->nombre = nombre;
    alumno->nota = 0.0f;
    alumno->siguienteAlumno = nullptr;
    if(seccion->primerAlumno == nullptr){
        //caso en que no haya alumnos en seccion
        seccion->primerAlumno = alumno; 
    }
    else{
        //caso en que haya alumnos
        Alumno* pAlumno = nullptr;
        pAlumno = seccion->primerAlumno;
        while(pAlumno->siguienteAlumno != nullptr){
            pAlumno = pAlumno->siguienteAlumno;
        }
        pAlumno->siguienteAlumno = alumno; 
    }
}

Alumno* buscar(Seccion* seccion, std::string codigo){
    Alumno* pAlumno = seccion->primerAlumno;
    while(pAlumno != nullptr){
        pAlumno = pAlumno ->siguienteAlumno;
        if(pAlumno->codigo == codigo){
            //encontre al alumno
            return pAlumno;
        }
    }
    return nullptr;
}

void eliminarAlumno(Seccion* seccion, std::string codigo){
    Alumno* pAlumno = seccion->primerAlumno;
    Alumno* pAlumnoAnterior = nullptr;
    while(pAlumno != nullptr){

        if(pAlumno->codigo == codigo){
            //encontre al alumno que buscaba para eliminar
            if(pAlumnoAnterior == nullptr){
                //estamos en el primer elemento
                seccion->primerAlumno = pAlumno->siguienteAlumno;
                delete pAlumno; //liberamos el espacio
            }
            else{
                //estamos en cualquier elemento menos el primero 
                pAlumnoAnterior->siguienteAlumno = pAlumno->siguienteAlumno;
                delete pAlumno;
            }
            break;
        }
        pAlumnoAnterior = pAlumno;
        pAlumno = pAlumno->siguienteAlumno;
    }
}

void imprimirAlumno(Alumno* alumno){
    std::cout << alumno->codigo << "\t" 
    << alumno->nombre << "\t" 
    << alumno->nota << std::endl; 
}
void imprimirseccion(Seccion* seccion){
    Alumno* pAlumno = seccion->primerAlumno;
    while(pAlumno != nullptr){
        imprimirAlumno(pAlumno);
        pAlumno = pAlumno->siguienteAlumno;
    }
}

int main(){
    //implementar listas enlazadas
    //[601]
    //  |
    // [A1] -> [A2] -> [A3] -> null

    Seccion* seccion = new Seccion();
    seccion->numero = "601";
    seccion->primerAlumno = nullptr; 
    crearAlumno(seccion, "20192323" , "Melany");
    crearAlumno(seccion, "20193333" , "Flavio");
    crearAlumno(seccion, "20194444" , "Mauricio");
    imprimirseccion(seccion);
    std::cout << std ::endl;
    eliminarAlumno(seccion, "20194444");
    imprimirseccion(seccion);
    return 0;
}