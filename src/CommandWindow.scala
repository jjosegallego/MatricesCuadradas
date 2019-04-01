//Objeto encargado de recibir los datos de la matriz por teclado

object CommandWindow {
  
  def main(args: Array[String]): Unit = {
  
      print("\n")
      println("***BIENVENIDO A MATRIX***")
      print("\n")
      print(" Ingrese por favor la matriz de calculo, SEPARANDO cada fila por coma (,): ")
      val linea = scala.io.StdIn.readLine()
      
     EntradaTeclado.inputArray(linea)
   
  }
  
}