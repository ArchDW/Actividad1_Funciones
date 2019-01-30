

object Objet2 {
  def promedio(Calificacion:Double): Double ={
    Calificacion/5
  }
  def calif(){
    var x=0
    var cal=0.0
    while(x!=5){
      println("Ingresa Calificacion "+(x+1))
      cal = cal + readDouble
      x=x+1
      }
    var prom = promedio(cal)
    if(prom>89){
      println("El promedio es: "+prom+ " Exelente")
    }else if(prom>79){
      println("El promedio es: "+prom+ " Bien")
    }else if(prom>69){
      println("El promedio es: "+prom+ " Regular")
    }else
      println("El promedio es: "+prom+ " Terrible")
    
  }
  def main(args: Array[String]): Unit = {
     calif
  }//end the main
}