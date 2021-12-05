grammar EjemploInterprete;

@parser::header{
    import java.util.HashMap;
}

@parser::members{
    HashMap<String , Integer> simbolos = new HashMap<>();
    Integer operando = 0;
}

/*
Funcionalidades del lenguaje:
  - Manejo de variables:
  a) Declaracion de variables
  b) asignación de valores a variables
  c) contener un valor almacenado en una variable
  - Manejo de expresiones
  a) expresiones artiméticas
  5 + 3 -> 8

  b) expresiones lógicas (x)
  c) expresiones de comparación
*/

//seccion 1 : Gramatica libre de contexto (analisis sintactica)
root: PROGRAM VARIABLE_NAME block ;
block: BLOCK_INIT sentencia* BLOCK_CLOSE ;
sentencia: sentencia_declaracion | sentencia_asignacion | sentencia_visualizacion ;
sentencia_declaracion: VAR VARIABLE_NAME END_STATEMENT
    {
        simbolos.put($VARIABLE_NAME.text, 0);
    };
sentencia_asignacion : VARIABLE_NAME ASSIGMENT_OPERATOR valor_asignacion END_STATEMENT
    {
        simbolos.put($VARIABLE_NAME.text , $valor_asignacion.valor);
    };
sentencia_visualizacion: PRINT VARIABLE_NAME END_STATEMENT
    {
        Integer valor = simbolos.get($VARIABLE_NAME.text);
        System.out.println("Valor: " + valor);
    };

valor_asignacion returns [Integer valor]:
    NUMBER
        {
            $valor = Integer.parseInt($NUMBER.text);
        }
    |
    expresion
        {
            $valor = $expresion.resultado;
        };
expresion returns [Integer resultado]:
    NUMBER
        {
            operando = Integer.parseInt($NUMBER.text);
        }
    ARITHMETIC_OPERATOR NUMBER
    {
        String tipoOperacion = $ARITHMETIC_OPERATOR.text;

        Integer operando2 = Integer.parseInt($NUMBER.text);

        if(tipoOperacion.equals("+")){
            $resultado = operando + operando2;
        }else if(tipoOperacion.equals("-")){
            $resultado = operando - operando2;
        }
        else if (tipoOperacion.equals("*")){
            $resultado = operando * operando2;
        }
        else{
            $resultado = operando / operando2;
        }


    };

//seccion 2:  Gramatica regular (analisis lexico)

PROGRAM: 'programa';
VAR : 'variable' ;
PRINT: 'mostrar';

//simbolos especiales
BLOCK_INIT : '{' ;
BLOCK_CLOSE : '}';
END_STATEMENT : ';';
ASSIGMENT_OPERATOR: '=';
ARITHMETIC_OPERATOR : '+' | '-' | '*' | '/';

// identificadores

VARIABLE_NAME : [a-zA-Z_][a-zA-z0-9_]*;

//literales
NUMBER: '0' | [1-9][0-9]*;

//caracteres a ser ignorados
IGNORED_CHARACTERES : [ \t\n\r]+ -> skip;
