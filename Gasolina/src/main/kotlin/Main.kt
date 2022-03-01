
    fun main(args: Array<String>) {

        println("Qual o tipo de combustível? \n A - álcool / G - gasolina")
        val combus: String = leia.nextLine()
        println("Qual a quantia?")
        val litro: Int = leia.nextInt()

        if (combus == "A" && litro < 20) {
            println("Total a pagar: " + litro * 3.30 / 0.03)
        } else if (combus === "A" && litro > 20) {
            println("Total a pagar: " + litro * 3.50 / 0.05)
        } else if (combus === "G" && litro < 20) {
            println("Total a pagar: " + litro * 3.50 / 0.04)
        } else {
            println("Total a pagar: " + litro * 3.50 / 0.06)
        }
    }
}