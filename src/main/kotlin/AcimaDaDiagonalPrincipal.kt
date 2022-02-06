/*
#kotlin
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida,
calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima da diagonal principal da matriz,
conforme ilustrado abaixo (área verde).




Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média)
que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
 */

fun main(args: Array<String>) {
    var resultado = 0.0
    val T = readLine()!!.toUpperCase()
    val M = Array(12) { DoubleArray(12) }

    for (i in 0..11) {
        for (j in 0..11) {
            M[i][j] = readLine()!!.toDouble()
            if (j>i) resultado += M[i][j]
        }
    }

    if(T=="M") resultado /= 66.00
    println(resultado.format(1))
}

private fun Double.format(digits: Int) = "%.${digits}f"
    .format(this).replace(',','.')