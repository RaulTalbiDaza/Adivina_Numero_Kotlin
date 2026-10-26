fun main(){
    val log = Logica()

    val numSec : Int = (1..100).random()
    var num : Int?
    var contador: Int = 0
    var valido : Boolean
    var intento : Boolean

    // Do-while grande para ver si el usuario adivinó el número

    do{

        // Do-while mediano para comprobar si el número introducido está entre 1 y 100

        do{

            // Do-while pequeño para comprobar si el número introducido es un entero

            do{
                num = log.leerCantidad("Introduce un número: ")
            }while(num == null)
            valido = log.comprobarNumero(num)
        }while(!valido)
        intento = log.intento(num, numSec)

        // Aumento del contador de intentos

        contador = contador + 1
    }while(!intento)

    // Mensaje final mostrando el número de intentos

    println("Acertaste el número en $contador intentos")



}