fun main(){
    val log = Logica()

    val numSec = (1..100).random()
    var num : Int?
    var contador: Int = 0

    var valido : Boolean
    var intento : Boolean

    do{
        do{
            do{
                num = log.leerCantidad("Introduce un número: ")
            }while(num == null)
            valido = log.comprobarNumero(num)
        }while(!valido)
        intento = log.intento(num, numSec)
        contador = contador + 1
    }while(!intento)

    println("Acertaste el número en $contador intentos")



}