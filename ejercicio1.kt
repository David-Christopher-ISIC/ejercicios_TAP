fun main (argumento: Array<String>) {
    print("Ingrese su edad: ")
    var edad = readln().toInt()
    var x = 1
    while (edad < 18) {
        println ("Acceso denegado")
        print ("Ingrese su edad: ")
        edad = readln().toInt()
    }
    print ("Acceso permitido")
}