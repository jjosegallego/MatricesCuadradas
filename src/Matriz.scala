//Objeto encargado de definir metodos para la operacion (submatriz y area) de la matriz principal

import scala.collection.mutable.ArrayBuffer
import scala.math.{max}

object Matriz {
  
  
  def maximoCuadrado(lista: List[String]) = {
    
    val matriz=lista.toArray
    var unosConsecutivos, sumatorias = new ArrayBuffer[Int]()
    var submatriz = new ArrayBuffer[String]()
    var secuencia,cuenta,menorSecuencia,area,posicion = 0
    
    //Se contabilizan los '1' consecutivos de cada elemento de la lista
    for(fila <- matriz){ 
      unosConsecutivos += contadorUnos(fila)  
    }
    menorSecuencia = menorCantidadUnos(unosConsecutivos)(0)
    posicion = menorCantidadUnos(unosConsecutivos)(1)
    
    //Rutina para crear una submatriz de acuerdo a la menor secuencia de 1 identificados
    var topeInferior = matriz(posicion).indexOf(crearSubVector(menorSecuencia).toString())
    var topeSuperior = topeInferior.toInt+menorSecuencia
    for(fila <- matriz){
      submatriz += fila.slice(topeInferior.toInt, topeSuperior)
    }
    
    //Rutina para determinar si la submatriz generada es cuadrada
    for(fila <- submatriz){
      sumatorias += sumatoriaFila(fila)
    }
    for(numero <- sumatorias){
       if(numero == menorSecuencia){
         cuenta = cuenta+1
       }
    }
   
    //Rutina para calcular y presentar el area
    area = calculoArea(cuenta, menorSecuencia)
    Graficador.presentarArea(area)   
  }
  
  
  def contadorUnos(fila:String):Int = { //se cuentan los unos consecutivos de cada fila de la matriz principal
    var contador = 0;
    var resultado = 0;
    for(entrada <- fila)  
      if(entrada == '0'){
        contador = 0;
      }else{
        contador = contador+1
        resultado = resultado.max(contador);
      }
    if(resultado == 1){
      resultado = 0
    }
    return resultado   
  }
  
  def menorCantidadUnos (vector: ArrayBuffer[Int]):Array[Int] = { // define la menor secuencia de '1' y la posición que esta ocupa en la fila
    var menor = 500 
    var contador,posicion = 0
    var resultado = new Array[Int](2)
    for(i <- vector){
      if(i < menor && i != 0){
        menor = i
        posicion = contador
      }
      contador = contador+1
    }
    resultado(0) = menor
    resultado(1) = posicion
    
    return resultado
  }
   
  def crearSubVector (numero:Int):StringBuilder = { //se establece la secuencia de 1 que definirá la base de la submatriz
    val vector = StringBuilder.newBuilder
    for (i <- 1 to numero) {
       vector.append('1')
    }
    return vector
  }
  
  def sumatoriaFila(fila:String):Int ={ //se obtienen las sumas de los indice de cada fila de la submatriz
     var contador=0;
     for(entrada <- fila)  {
       contador=contador+entrada.toInt - 48
     }
     return contador
  }
  
  def calculoArea(total:Int, menor:Int):Int ={ // se calcula el area de la submatriz
    val lado=menor
    var area=0;
    if(total >= menor){
      area = lado*lado
    }else{
      area= (lado-1)*(lado-1)
    }
    return area
  } 
}