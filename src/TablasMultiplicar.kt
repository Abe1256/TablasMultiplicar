import java.util.Random
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val random = Random()

    println("¡Bienvenido! Vamos a practicar las tablas de multiplicar")

    var correctAnswers = 0
    var totalQuestions = 5 //Numero de preguntas que se realizarán en la sesión

    //Ciclo que hace las preguntas
    for (i in 1..totalQuestions) {
        // Elegir dos números aleatorios entre 1 y 12
        val num1 = random.nextInt(12) + 1
        val num2 = random.nextInt(12) + 1

        //Hacemos la pregunta
        println("¿Cuánto es $num1 x $num2?")

        //Leemos la respuesta del usuario
        val userAnswer = scanner.nextInt()

        //Comprobamos que la respuesta sea correcta
        if (userAnswer == num1 * num2) {
            println("¡Correcto!")
            correctAnswers++
        } else {
            println("No es correcto. La respuesta correcta era ${num1 * num2}")
        }
    }

    // Mostrar la puntuacion final
    println("Has acertado $correctAnswers de $totalQuestions preguntas.")
    if (correctAnswers == totalQuestions) {
        println("¡Excelente! ¡Sigue así!")
    } else {
        println("Sigue practicando, ¡tú puedes!")
    }
}
