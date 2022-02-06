/*
#kotlin
Desafios
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
 */

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    for (i in 2.rangeTo(N).step(2)) println(i) // insira o valor correto
}