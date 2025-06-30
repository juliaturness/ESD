//Para converter um número X para uma base b, um algoritmo como este pode ser usado:
//
//Divida X por b
//Faça com que o quociente seja o novo valor de X, e armazene o resto
//Se quociente > 0, repita desde passo 1
//Mostre os restos em ordem contrária da que foram armazenados
//        Por exemplo, para converter 1073 para base 5:
//
//        1073 = 214 * 5 + 3
//        214 = 42 * 5 + 4
//        42 = 8 * 5 + 2
//        8 = 1 * 5 + 3
//        1 = 0 * 5 + 1
//Assim, 1073 na base 5 é "13243"
//
//Escreva um programa que implemente essa conversão e, para isso, use uma das estruturas de dados estudadas para ajudar (use-a para armazenar os restos obtidos a cada iteração do algoritmo). Para simplificar, suponha que a base b seja um número entre 1 e 10 (inclusive).
//
//O número a ser convertido e a base devem ser fornecidos no primeiro e segundo argumentos de linha de comando, respectivamente.
//
//Lembre que será avaliado:
//
//A escolha das estruturas de dados
//O uso eficiente e adequado dessas estruturas de dados
//O resultado cumprir o que foi pedido no enunciado