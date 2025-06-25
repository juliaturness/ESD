////Uma necessidade em alguns programas é embaralhar um conjunto de valores (isso se chama também de randomizar). Por exemplo, o treinamento de redes neurais artificiais funciona melhor se o conjunto de dados para treinamento for embaralhado a cada rodada. Por isso, pode ser útil um algoritmo que embaralhe uma sequência.
////
////Existe mais de um algoritmo conhecido para realizar o embaralhamento de um vetor. Um deles é o algoritmo de Sattolo, que funciona da seguinte maneira:
////
////// embaralha o vetor v, sendo n o comprimento desse vetor
////para i de n-1 até 1 faça
////j <- número inteiro aleatório tal que 0 <= j <= i-1
////faz a permuta de v[j] e v[i]
////Implemente um método para embaralhar sua lista sequencial, o qual deve possuir esta assinatura:
////
////void embaralha() {
////    // instruções do algoritmo
////}
////Para demonstrar o correto funcionamento desse método, escreva um programa crie uma ou mais listas sequenciais, e as embaralhe, mostrando na tela o resultado.
////
////        DICA:
////
////Para sortear um número inteiro, use um gerador de números aleatórios:
////
////// cria um gerador de números aleatórios ... basta criar um único gerador !
////Random gerador = new Random();
////
////// gera um número inteiro com valor no intervalo [2, 10)
////// Após a linha a seguir, a variável x terá um valor 2 <= x < 10
////int x = gerador.nextInt(2, 10)
////
////// gera um número no intervalo [0, 5)
//int y = gerador.nextInt(0, 5);
package esd.Exercícios;

public class embaralha {
}
