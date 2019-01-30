

object Objet5 {
  def mes(){
    println("Ingresa el numero del Mes que desee")
    val mes = readInt
    
    if(mes==2){
      println("El mes tiene 28 dias")
    }else if(mes==4|| mes==6|| mes==9|| mes==11){
      println("El mes tiene 30 dias")
    }else
      println("El mes tiene 31 dias")
  }//end the mes
  
  def main(args: Array[String]): Unit =  {
    mes
  }//end the main
}