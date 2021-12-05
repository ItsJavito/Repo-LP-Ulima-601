grammar log;
// gramatica libre de sintaxes
@parser::header{
    import java.util.HashMap;
}

@parser::members{
    HashMap<String , Integer> map_w = new HashMap<>();
    Integer cantidad = 0;
    String s_max = "";
    Integer i_max = 0;
}

root: sentencia* EOF
{
    System.out.println("********************");
    System.out.println("REPORTE DE EVENTOS *");
    System.out.println("********************");
    System.out.println("Cantidad de palabras totales : " + cantidad);
    System.out.println("Palabra más repetida : " + s_max);
};
sentencia: NUMBER SISTEMA DESC NIVEL END
{
    String descripcion = $DESC.text;
    //hay comillas iniciales y finales por eso es que hay que quitarlas
    String cadena = descripcion.substring(1, descripcion.length() - 2);
    String[] palabras = cadena.split(" ");

    cantidad += palabras.length;

    for(int i = 0; i < palabras.length; i++)
    {
        map_w.put(palabras[i], map_w.getOrDefault(palabras[i] , 0) + 1);
        int valor = map_w.get(palabras[i]);
        if(valor > i_max)
        {
            i_max = valor;
            s_max = palabras[i];
        }
    }
};
// gramatica regular

NUMBER : '0' | [1-9][0-9]*;
SISTEMA: 'SISVEN' | 'SISCONT' | 'SISRRHH';
NIVEL : 'CRITICAL' | 'INFO' | 'WARNING';
DESC: '"'[a-zA-z0-9 ]*'"';
END : '\n';

//ignorados
IGNORED_CHARS : [ \t\r] -> skip;