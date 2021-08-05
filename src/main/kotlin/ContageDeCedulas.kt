
fun main(    ) {

    val notas: IntArray = intArrayOf(100,50,20,10,5,2,1)
    var valor =  readLine()!!.toInt()

    println(valor)
    notas.forEach {
        println("${(valor / it).toInt()} nota(s) de R$ ${it.toInt()},00")
        valor  %= it;
    }
}