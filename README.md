# Matrix 
Programa en SCALA para determinar sub-matrices cuadradas de una matriz principal

## Funcionamiento:
 1. Al ejecutar el programa, el usuario podrá ingresar una matriz compuesta de '1' y '0' de su preferencia por consola. <br/>
  **Nota:** Se debe tener en cuenta que la matriz ingresada se ingresa por filas separadas por coma (,) sin incluir comillas
![image](https://drive.google.com/uc?export=view&id=1I_zBugzP85xm5RR5hCWiQVObH_kNdNe0)
 2. Una vez ingresada la matriz, el software calculará la sub-matriz cuadrada de '1' mas grande que se pueda obtener y entregará en pantalla el resultado del área de esta.
![image](https://drive.google.com/uc?export=view&id=1vZh7PtiUyQMAmArG3EoRmju1bi_xFUjw)
 3. El algaritmo de cálculo es el siguiente:<br/>
 
    **A.** Se encuentra la maxima secuencia de '1' presente en alguna de las filas de la matriz<br/>
    
    **B.** A partir de la posición de la secuencia en la matriz principal se crea una sub-matriz<br/>
    
    **C.** Se analiza que la submatriz creada contenga la cantidad de '1' requerida para ser cuadrada, adaptando la submatriz si es necesario (si se encuentran '0' se reduce la matriz)<br/>
    
    **D.** Finalmente se calcula el área de la matriz como (lado*lado)<br/>
