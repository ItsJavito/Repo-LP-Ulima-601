grammar FlujoCaja;
// Seccion 1 : Gramatica libre de contexto

@parser::members{
    int montoCaja = 0;
}

root: apertura operacion* EOF
    {
        System.out.println("\n\nEl monto final es : " + montoCaja);
    };
apertura : MONTO FIN_SENTENCIA
    {
        montoCaja = Integer.parseInt($MONTO.text);
    };
operacion : MONTO operador FIN_SENTENCIA
    {
        if($operador.op.equals('+')){
            montoCaja += Integer.parseInt($MONTO.text);
        }
        else
        {
            montoCaja -= Integer.parseInt($MONTO.text);
        }
    };
operador returns [String op]:
    OPERADOR_RESTA
        {
            $op = "-";
        }
    |
    OPERADOR_SUMA
        {
            $op = "+";
        };


// Seccion 2: Gramatica regular

// Simbolos especiales
OPERADOR_SUMA : '+';
OPERADOR_RESTA : '-';
FIN_SENTENCIA : '\n';

// literales
MONTO : '0' | [1-9][0-9]*;
IGNORED_CHARS : [ \t\r] -> skip;
