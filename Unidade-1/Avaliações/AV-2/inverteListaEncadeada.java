//A inversão da ordem dos valores de uma lista encadeada deve ser feita de forma diferente da inversão de uma lista sequencial, para que mantenha complexidade de tempo computacional Θ(N). Uma forma de conseguir um algoritmo com essa complexidade é simplesmente permutando as referências para nodos anterior e sucessor de cada nodo.
//
//Algoritmo inverte:
//
//Para cada nodo da lista faça
//Permute referências para nodos sucessor e antecessor
//O método inverte da sua lista encadeada deve ter esta assinatura:
//
//void inverte() {
//    // algoritmo para inverter
//}
//IMPORTANTE:
//
//A implementação do seu método inverte NÃO pode usar as operações obtem, substitui e similares da lista encadeada !!! Isso reduziria muito a eficiência do algoritmo. Também não é permitido usar qualquer outra estrutura de dados para ajudar !