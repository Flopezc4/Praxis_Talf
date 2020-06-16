grammar Simple1;
program: consultasimple | creandotablanueva |consultaselect ;
////probandocommit//
///CONSULTA 1///
consultasimple: SELECT TODO FROM table(COMA table)* PUNTOCOMA
				{System.out.println("Consultando");};

///CONSULTA 2///
/*consultadelete: DELETE FROM table(COMA table)* PUNTOCOMA;
consultadeletecondicion: DELETE FROM table(COMA table)* WHERE ID ASSIGN ID PUNTOCOMA;*/

//cond: DONDE ID DONDE;

///CONSULTA 3///
consultaselect: SELECT columna(COMA columna)* 
		  FROM table(COMA table)* 
		  WHERE condition((COMA condition)(AND condition)* (OR condition)* )* PUNTOCOMA
		  {System.out.println("Consultando");};

table: ID | COMA | ID;
columna: ID | COMA | ID;	
condition: ID ASSIGN ID | COMA AND OR| ID ASSIGN ID;


///CONSULTA 4///
creandotablanueva: CREATE TABLE ID PAR_OPEN atributos PAR_CLOSE PUNTOCOMA
			{System.out.println("Consultando");};
			

tipo: INT | var ;
columnaa: ID;
var: VARCHAR PAR_OPEN NUM PAR_CLOSE;
atributos: columnaa tipo(COMA columnaa tipo)*;
 
SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
ASSIGN: '=';
NUM: [0-9]+;
COMA: ',';
PUNTOCOMA: ';';
AND: 'AND';
OR: 'OR';
TODO: '*';

CREATE: 'CREATE';
TABLE: 'TABLE';
PAR_OPEN: '(';
PAR_CLOSE: ')';

DELETE: 'DELETE';

INT: 'INT';
VARCHAR: 'VARCHAR';


GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';  
ID: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;
