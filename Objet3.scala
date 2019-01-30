

object Objet3 {
  def MasaCorporal(Peso: Double, Altura: Double): Double ={
    Peso/ Math.pow(Altura, 2)
  }
  def indice(){
    println("Ingresa tu Peso en Kg")
    val peso = readDouble
    println("Ingresa tu Altura en Metros")
    val altura= readDouble
    val IMC = MasaCorporal(peso, altura)
    print("Tu Masa Corporal es de "+ IMC)
    if(IMC<16)
      println("Criterio de ingreso en hospital")
      else if(IMC==16)
        println(" infrapeso")
       else if(IMC==17|| IMC==18)
        println(" bajo peso")
       else if(IMC>18|| IMC<=25)
        println(" peso normal (saludable)")
       else if(IMC>25|| IMC<=30)
        println(" sobrepeso (obesidad de grado I)")
       else if(IMC>30|| IMC<=35)
        println(" sobrepeso crónico (obesidad de grado II)")
       else if(IMC>35|| IMC<=40)
        println(" obesidad premórbida (obesidad de grado III)")
       else if(IMC>40)
        println(" obesidad mórbida (obesidad de grado IV)")
  }
  def main(args: Array[String]): Unit = {
    indice()
  }//end the main
}