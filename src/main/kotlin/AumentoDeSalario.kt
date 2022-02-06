/*
#kotlin
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:


Salário	Percentual de Reajuste
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, que pode ser maior ou igual a zero, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.
 */

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val salario = input.nextDouble()

    val reajuste = when {
        salario > 2000 -> 4
        salario > 1200.01 -> 7
        salario > 800.01 -> 10
        salario > 400.01 -> 12
        else -> 15
    }.toDouble()

    //escreva o seu código nos espaços em branco
    val valorReajuste = salario * (reajuste/100).toDouble()
    val novoSalario = salario + valorReajuste



    System.out.printf("Novo salario: %.2f\n", novoSalario)
    System.out.printf("Reajuste ganho: %.2f\n", valorReajuste)
    System.out.printf("Em percentual: %.0f %%\n", reajuste)
}