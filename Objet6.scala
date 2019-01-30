

object Objet6 {
  def datos(){
    println("Solicitud de Banco")
    val nombre = readLine("Cual es su nombre?")
    val historia = readLine("Como es su historia Crediticia? Buena (B) o Mala (M)")
    println("Cual es la cantidad que solicita?")
    val prestamo = readDouble()
    println("Cual es su salario Anual?")
    val salario = readDouble()
    println("Cual es el valor de sus propiedades?")
    val propiedad = readDouble()
    
    var puntos = solicitarPrestamo(historia, salario, propiedad, prestamo)
    
    if(puntos >= 6){
      println("Sr/Sra. " + nombre + " Su solicitud ha sido Aceptada")
      println("Cantidad de Puntos: " + puntos)
    }
    else{
      println("Sr/Sra. " + nombre + " Su solicitud ha sido Rechazada")
      println("Cantidad de Puntos: " + puntos)
    }
  }
  def solicitarPrestamo(historia:String, salario:Double, propiedad:Double, prestamo:Double):Int = {
    var puntos = 0
    var prestamoAl50 = prestamo -(prestamo * 0.5)
    var prestamoAl25 = prestamo -(prestamo * 0.25)
    var prestamoAl10 = prestamo -(prestamo * 0.1)
    
    if(historia == "B"){
      if(salario >= prestamoAl50){
          puntos = puntos + 5
          if(propiedad >= (prestamo*2))
            puntos = puntos + 5
          else if(propiedad == prestamo && propiedad <= (prestamo*2))
            puntos = puntos + 3
      }
      if(salario >= prestamoAl25 && salario < prestamoAl50){
          puntos = puntos + 3
          if(propiedad >= (prestamo*2))
            puntos = puntos + 5
          else if(propiedad == prestamo && propiedad <= (prestamo*2))
            puntos = puntos + 3
      }
      if(salario >= prestamoAl10 && salario < prestamoAl25){
          puntos = puntos + 1
          if(propiedad >= (prestamo*2))
            puntos = puntos + 5
          else if(propiedad == prestamo && propiedad <= (prestamo*2))
            puntos = puntos + 3
      }    
    }
    else
      puntos = 0
      
    puntos
  }
  
  def main(args: Array[String]): Unit = {
        datos
  }
}