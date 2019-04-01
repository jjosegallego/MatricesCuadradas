//Objeto que implementa varios metodos para la validacion de las entradas que el usuario ha digitado

object EntradaTeclado {
  
  def inputArray(input:String) = { //separa filas de la matriz principal
     val resultado = input.split(",")
     if( resultado.length <= 1 ){ //dimensiones minimas para operar
       Graficador.presntarError3()
     }else{
       if(!validarIdentidad(resultado)){
         Graficador.presntarError1()
       }else if(!validarMatrizCuadrada(resultado)){
        Graficador.presentarError2()
       }else{
         Graficador.presentaMatriz(resultado)
         Matriz.maximoCuadrado(resultado.toList)
       }  
     }
  }
  
  
  def validarIdentidad(filas: Array[String]):Boolean = { //valida que todas las entradas sean 0 y 1
    var validator = false  
    for(fila <- filas)
      for(entrada <- fila)
        if(entrada == '0' || entrada == '1' ){
          validator = true
        }else{
          validator = false
        }
    return validator   
  }
  
  
  def validarMatrizCuadrada(filas: Array[String]):Boolean = {
    var validator = false
    var longitud = filas(0).length()
    for(fila <- filas)
      if(fila.length() != longitud){
        validator=false 
       }else{
         validator=true
       }
    return validator
    
  }
  
  
  
}