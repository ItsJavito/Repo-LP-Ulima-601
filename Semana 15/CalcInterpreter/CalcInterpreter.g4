grammar CalcInterpreter;
@parser::header{
    import java.util.HashMap;
}

@parser::members{
    HashMap<String , Integer> vars = new HashMap<>();
    Integer operando = 0;
}

//seccion 1 : gramática libre de contexto

root : sentencia* EOF;
sentencia : sentencia_print | sentencia_calc;
sentencia_print : INIT PRINT VARIABLE END
{
    Integer valor = vars.get($VARIABLE.text);
    System.out.println("el valor de " + $VARIABLE.text + " es " + valor);
};
sentencia_calc : INIT asignacion (operacion)* END
{
    vars.put($asignacion.v_name, operando);
    operando = 0;
};
asignacion returns [String v_name]: VARIABLE NUMBER
{
    $v_name = $VARIABLE.text;
    operando = Integer.parseInt($NUMBER.text);
};
operacion : NUMBER ARITHMETIC_OPERATOR
{
    String ope = $ARITHMETIC_OPERATOR.text;
    Integer numero = Integer.parseInt($NUMBER.text);
    if(ope.equals("+")){
        operando += numero;
    }
    else if(ope.equals("-")){
        operando -= numero;
    }
    else if(ope.equals("*")){
        operando *= numero;
    }
    else {
        operando /= numero;
    }
};

// seccion 2: gramatica regular

PRINT: 'mostrar';

//SIMBOLOS ESPECIALES

INIT: '(';
END: ')';
ARITHMETIC_OPERATOR : '+' | '-' | '*' | '/';

// identificador

VARIABLE : [a-zA-Z_][a-zA-z0-9_]*;

//literales

NUMBER : '0' | [1-9][0-9]*;

//ignorar

IGNORED_CHARACTERES : [ \t\n\r]+ -> skip;