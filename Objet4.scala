

object Objet4 {
  def pantalones(Cantidad: Int){
   if(Cantidad<5)
     println("Cantidad a Pagar es: "+Cantidad*356.82)
     else if(Cantidad>=5 || Cantidad<12){
       val pago = Cantidad*356.82
       println("Cantidad a Pagar es: "+(pago-(pago*.15)))
     }else if(Cantidad>=12){
       val pago = Cantidad*356.82
       println("Cantidad a Pagar es: "+(pago-(pago*.3)))
     }
       
 }
 
 def main(args: Array[String]): Unit =  {
   println("Ingresa la cantidad de Pantalones que desea llevar")
   val x = readInt
     pantalones(x)
   //1784.1
  }//end the main
}