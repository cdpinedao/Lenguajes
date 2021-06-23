grammar MiLenguaje;

inicio: (funcion|estructura)* funcion_principal (funcion|estructura)*;

funcion: 'funcion' ('entero' | 'real' | 'caracter' |  'cadena' |'booleano'|ID) ID '(' (','| 'entero' | 'real' | 'caracter' |  'cadena' |'booleano' | ID)* ')' 'hacer' (comentario | caracter | cadena |seleccionar | hacer_mientras | mientras | para | leer | booleano | entero| real | imprimir | cond_si | declarar_instancia | instanciar | asignacion)* 'retornar'(Num | ID | OPS | ',' )* ';' 'fin_funcion';
funcion_principal  : 'funcion_principal' (comentario | caracter | cadena |seleccionar | hacer_mientras | mientras | para | leer | booleano | entero| real | imprimir | cond_si | declarar_instancia | instanciar | asignacion)* 'fin_principal' ;
estructura :  'estructura' ID  (entero | real | caracter | cadena | booleano | imprimir | declarar_instancia | instanciar | asignacion)* 'fin_estructura' ;

entero: 'entero' (ID | ID '=' Num) (',' (ID | ID '=' Num))* ';';
real: 'real' (ID | ID '=' Num) (',' (ID | ID '=' Num))* ';'; // a falta de info se toma en cuenta que un real siempre debe tener valores flotantes
caracter: 'caracter' (ID | ID '=' '\'' ID '\'' | ID '=' '\'' '\'' |ID '=' '\'' '_' '\'' ) (','(ID | ID '=' '\'' ID '\''| ID '=' '\'' '\''|ID '=' '\'' '_' '\''))*';';
asignacion: (ID '=' ((Num | ID | 'verdadero' | 'falso') | ((Num|ID) OPS (Num|ID))*| ID'('(ID|Num|',')*')')) ';';
declarar_instancia: (ID ID ';');
instanciar: (ID '.' ID ('.'ID)*) '=' (ID|Num) ';';
comentario: COMENTARIO_MULTIPLE | COMENTARIO_SENCILLO;
llamar_funcion: ID '(' (ID|Num|','|ID|Num)*')'';';

cadena: 'cadena' (ID | ID '=' STRING) (','(ID | ID '=' STRING))*';'; //reconoce cadenas vacias
booleano: 'booleano' (ID | ID '=' ('falso'|'verdadero'))(','(ID | ID '=' ('falso'|'verdadero')))*';';

leer: 'leer' '(' ID ')' ';';
imprimir: 'imprimir' '(' (Num | ID | STRING | '(' | ')' | OPS)* (',' (Num | ID | STRING | '(' | ')' | OPS)*)*')'';';
cond_si: 'si' '(' ((ID|Num) (IGAULDADES|OPS) (ID|Num|'verdadero' | 'falso') | IGAULDADES (ID|Num|'(') | '(' | ')')*')' 'entonces' (ID | Num | asignacion | entero | real | caracter | cadena | booleano | leer | booleano | imprimir | cond_si)* ('fin_si' | 'si_no' (ID | Num | asignacion | entero | real | caracter | cadena | booleano | leer | booleano | imprimir | cond_si)* 'fin_si') ;
mientras: 'mientras' '(' ((ID|Num) (IGAULDADES|OPS) (ID|Num|'verdadero' | 'falso') | IGAULDADES (ID|Num|'(') | '(' | ')')*')' 'hacer' (ID | Num | asignacion | entero | real | caracter | cadena | booleano | leer | booleano | imprimir | cond_si)* 'fin_mientras';
para: 'para' '(' (entero|asignacion) ((ID|Num) (IGAULDADES|OPS) (ID|Num| 'verdadero' | 'falso') | IGAULDADES (ID|Num|'(') | '(' | ')')* ';' (ID|Num) ')' 'hacer' (ID | Num | asignacion | entero | real | caracter | cadena | booleano | leer | booleano | imprimir | cond_si)* 'fin_para';
hacer_mientras: 'hacer' (ID | Num | asignacion | entero | real | caracter | cadena | booleano | leer | booleano | imprimir | cond_si | seleccionar)* 'mientras' ((ID|Num) (IGAULDADES|OPS) (ID|Num) | IGAULDADES (ID|Num|'(') | '(' | ')')* ';';
seleccionar: 'seleccionar' '(' ID ')' 'entre' (('caso'(ID|Num)|'defecto')':' (ID | Num | asignacion | entero | real | caracter | cadena | booleano | leer | booleano | imprimir | cond_si | seleccionar | llamar_funcion |'romper;')* )* 'fin_seleccionar';

COMENTARIO_MULTIPLE: '/*' .*? '*/' -> skip;
COMENTARIO_SENCILLO: '//' ~[\r\n]* -> skip;
ID :    [a-zA-Z_]+([a-zA-Z0-9_.]+)* ; //no empieza por numeros
Num: [0-9.]+;
BOOLE: 'falso'|'verdadero';
OPS:'+'|'-'|'*'|'/'|'%'|'.'|'=';
IGAULDADES: '=='|'<='|'>='|'<'|'>'|'&&'|'||'|'!=';
TOKENS: '&'|'|'|'!'|':'|',';
ESP : [ \t\r\n]+ -> skip ;
STRING : '"' ~('\r' | '\n' | '"')* '"' ;

