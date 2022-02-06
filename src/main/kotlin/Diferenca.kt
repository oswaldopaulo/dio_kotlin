/*
#kotlin
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 */

package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val a = 1
    val b = 9
    val c = 5
    val d = 6
    val diferenca = (a*b) - (c*d)

    println("DIFERENCA = " + diferenca)  //escreva o seu código nos espaços em branco
}