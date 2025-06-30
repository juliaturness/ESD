//Como estudado, o algoritmo merge sort ordena uma sequência da seguinte forma:
//
//algoritmo merge_sort
//Entradas: sequencia (arranjo a ser ordenado), pos1, pos2 (posições inicial e final da subsequência a ser ordenada)
//
//se pos2 - pos1 > 1 então
//        meio = pos1 + (pos2 - pos1)/2
//// ordena as sublistas (primeira metade e segunda metade)
//merge_sort(sequencia, pos1, meio)
//merge_sort(sequencia, meio, pos2)
//
//// mescla as sublistas
//merge(sequencia, pos1, meio, pos2)
//fim se
//Esse algoritmo pode ser levemente melhorado se usar o bubble sort para ordenar sublistas com tamanho menor que um certo limiar. Por exemplo, se uma sublista tiver comprimento menor ou igual a 8, ela pode ser ordenada com bubble sort ao invés de continuar o merge sort.
//
//Modifique sua implementação do merge sort em sua ListaSequencial para implementar essa melhoria, supondo que o limiar para uso do bubble sort seja 8. O teste do funcionamento do seu ordenamento pode ser feito com o teste da LiistaSequencial: