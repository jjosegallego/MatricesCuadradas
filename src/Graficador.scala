//Objeto encargado de presentar la información al usuario

object Graficador {
  
  def presentaMatriz(filas: Array[String]) = {
    println(" \n La matriz ingresada fué: \n")
    for(fila <- filas)
      println("  "+fila) 
  }
  
  def presntarError1() = {
     println(" \n Error de Entradas: Recuerde solo ingresar matrices cuyos elementos sean 1 y 0. Sin incluir caracteres especiales como comillas")
  }
  
  def presentarError2() = {
     println(" \n Error de Entradas: Para esta versión del programa, la matriz ingresada debe ser cuadrada y/o no deben dejarse espacios vacios entre filas ")
  }
  
  def presntarError3() = {
     println(" \n Error de Entradas: Para esta versión del programa solo se aceptan matrices y esta ingresando un vector, rectifique por favor")
  }
  
  def presentarArea(area:Int) = {
    println("\n *****************************************")
    println(" El área de la suub-matriz cuadrada es: "+ area +" U^2")
    
  }
  
}