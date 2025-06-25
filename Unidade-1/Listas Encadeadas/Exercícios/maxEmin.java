//Estenda sua Lista com duas novas operações:
//
//maximo(): retorna o maior valor contido na lista
//minimo(): retorna o menor valor contido na lista
//Se sua lista estiver vazia, a chamada desses métodos deve resultar em uma exceção RunTimeException.
//
//Você pode testar sua implementação com este teste de unidade (coloque-o na pasta test/ do seu projeto gradle):
//
//TestMaxMinLista.java: teste de unidade das operações maximo e minimo
//Dicas:
//
//Para valores possam ser comparados usando o método compareTo, o valor sobre o qual se chama esse método deve implementar a interface Comparable. Na sua implementação de maximo e minimo, isso pode ser feito assim:
//// algo é um valor contido em algum nodo da lista
//Comparable valor = (Comparable) algo;
//O valor passado como parâmetro no método compareTo não precisa ser Comparable:
//// algo: um valor obtido de um nodo qualquer
//        if (valor.compareTo(algo) == 0) {
//        System.out.println("iguais !!");
//}
//O valor a ser retornado pelos métodos maximo e minimo deve ser do tipo genérico T da lista. Por exemplo, ao final de maximo para retornar o maior valor:
//// maior: variável que contém o maior valor da lista
//        return (T)maior;
package esd.Exercícios;

public class maxEmin {
}
