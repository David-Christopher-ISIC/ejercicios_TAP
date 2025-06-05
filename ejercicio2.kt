fun main(argumento: Array<String>) {
    print ("Ingrese el numero a calcular factorial: ")
    val num =  readln().toInt()
    var x = 1
    var resultado = 1
    while (x <= num) {
        resultado = x * resultado
        x = x+1
    }
    print ("El factorial de "+num+" es: "+resultado)
}