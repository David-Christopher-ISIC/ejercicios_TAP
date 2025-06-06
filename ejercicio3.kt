fun main() {
    while (true) {
        print("Introduce un número para verificar si es primo: ")
        val num = readLine()?.toIntOrNull() ?: continue

        var i = 2
        while (i < num) {
            if (num % i == 0) {
                println("$num no es un número primo")
                break
            }
            i++
        }

        if (i == num) {
            println("$num es un número primo")
        }
    }
}