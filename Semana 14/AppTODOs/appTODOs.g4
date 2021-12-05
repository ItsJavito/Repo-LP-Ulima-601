grammar appTODOs;

@parser::members{
    int casaCount = 0;
    int casaRealizadas = 0;
    int uniCount = 0;
    int uniRealizadas = 0;
}

// s1 : Gramatica libre de contexto
root : tarea+ EOF
{
    System.out.println("Ratio cumplimiento CASA: " + (casaRealizadas*1.0f/casaCount));
    System.out.println("Ratio cumplimiento UNIVERSIDAD: " + (uniRealizadas*1.0f/uniCount));
};
tarea: indicador TAREA tipo FIN_TAREA
{
    if($tipo.type.equals("UNIVERSIDAD")){
        uniCount++;
        if($indicador.ind == 1){
            uniRealizadas++;
        }
    }
    else{
        casaCount++;
        if($indicador.ind == 1){
            casaRealizadas++;
        }
    }
};
indicador returns [Integer ind]:
TODO_REALIZADO
 { $ind = 1; }
 |
TODO_NO_REALIZADO
{ $ind = 0 ;};

tipo returns [String type]:
KM_UNIVERSIDAD {
    $type = "UNIVERSIDAD";
} | KM_CASA{
    $type = "CASA";
};

//s2 : gramatica regular
//palabras clave
KM_CASA : 'CASA';
KM_UNIVERSIDAD: 'UNIVERSIDAD';

//simbolos especiales

FIN_TAREA : ';';
TODO_REALIZADO : '1';
TODO_NO_REALIZADO : '0';

// litereal

TAREA : '"'[a-zA-z0-9 ]*'"';
IGNORED_CHARACTERS : [ \n\r\t] -> skip;