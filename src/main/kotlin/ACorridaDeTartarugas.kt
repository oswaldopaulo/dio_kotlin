import java.io.EOFException

fun main(args: Array<String>) {

    while (true) {

        try {

            val L = readLine()!!.toInt()

            //val v = readLine()!!.split(" ").run {     {      () } }


            val Vi = readLine()!!.split(" ").map { it.toInt() }


            //val max: Int = Vi.max() ?: 0
            val max: Int = Vi.maxOrNull() ?: 0
            when (max) {
                in 0..9 -> println(1)
                in 10..19 -> println(2)
                else -> println(3)

            }

        } catch (f: KotlinNullPointerException) {
            break
        }
        //  } catch (n : ) {
        //      break
        //   } catch (e :) {
        //        break
        //   }
    }
}