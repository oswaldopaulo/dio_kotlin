fun main(args: Array<String>) {

    val T = readLine()!!.toInt()
    for (i in 1..T) {

        val v = readLine()!!.split(" ").map { it.toInt() }

        val R1 = v[0]
        val R2 = v[1]

        println(R1 + R2)

    }
}