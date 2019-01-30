

object Objet1 {
  def Rectangulo(a: Double, l: Double): Double ={
    a*l
  }
  def Triangulo(a: Double, l: Double): Double ={
    (a*l)/2
  }
  def Circulo(Pi: Double, Radio: Double): Double ={
    Math.pow(Radio, 2)*Pi
  }
  def Menu(){
    var x=0;
    do{
      println("Selecciona una Opcion"+"\n1)Area del Rectangulo"+"\n2)Area del TRiangulo"+"\n3)Area del Circulo"+"\n4)Salir")
      x=readInt
      if(x==1){
        println("Ingresa la Altura")
        val altura = readDouble
        println("Ingresa el Largo")
        val largo= readDouble
        println("Resultado: "+Rectangulo(altura, largo))
      }else if(x==2){
        println("Ingresa la Altura")
        val altura =readDouble
        println("Ingresa el Largo")
        val largo= readDouble
        println("Resultado: "+Triangulo(altura, largo))
      }else if(x==3){
        println("Ingresa PI")
        val PI = readDouble
        println("Ingresa el Radio")
        val Radio= readDouble
        println("Resultado: "+Circulo(PI, Radio))
      }
    }while(x!=4)
  }
def main(args: Array[String]): Unit = {
     Menu
  }//end the main
}