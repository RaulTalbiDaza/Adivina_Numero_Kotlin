class Logica{
    fun intento(num : Int, numSec : Int) : Boolean{
        if (numSec > num){
            println("El número secreto es mayor")
        }
        if (numSec < num){
            println("El número secreto es menor")
        }
        if (numSec == num){
            println("!Enhorabuena¡ Adivinaste el número secreto")
            return true
        }
        return false
    }

    fun comprobarNumero(num : Int?) : Boolean{
        if (num !in 1..100){
            println("El número debe estar entre 1 y 100")
            return false
        }
        return true
    }

    fun leerCantidad(mensaje: String): Int? {
        print(mensaje)
        val entrada = readLine()?.trim()?.replace(',', '.')
        val numero = entrada?.toIntOrNull()
        if (numero == null) {
            println("Error: entrada de datos incorrecta.")
        }

        return numero
    }


}

