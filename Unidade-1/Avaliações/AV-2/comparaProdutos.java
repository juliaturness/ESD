//Um inventário de produtos é armazenado em um arquivo com este formato:
//
//codigo_numerico,nome do produto,quantidade
//Alguns exemplos de produtos nesse inventário são:
//
//        123,cadeira,10
//        5209,mesa,10
//        8866,chave allen 3/8,2
//Escreva um programa que verifica se dois arquivos de inventário possuem exatamente os mesmos produtos (use o código numérico para identificá-los). Note que os produtos em cada arquivo podem estar em ordem diferente, porém o que interessa é saber se o conjunto de produtos existentes em um arquivo é idêntico ao de outro arquivo. As quantidades não devem ser consideradas nessa comparação.
//
//Os nomes dos arquivos são informados por meio de argumentos de linha de comando.
//
//Se os arquivo contiverem os mesmos conjuntos de produtos, seu programa deve mostrar os nomes dos produtos (de acordo com arquivo 1) na console ordenados alfabeticamente. Caso contrário ele nada deve apresentar. Por exemplo, se os arquivos contiverem estes produtos:
//
//Arquivo 1:
//
//        123,cadeira,10
//        5209,mesa,10
//        8866,chave allen 3/8,2
//Arquivo 2:
//
//        5209,mesa,10
//        8866,chave-allen 3/8,2
//        123,cadeira,10
//        ... o programa deve mostrar o seguinte:
//
//cadeira
//chave allen 3/8
//mesa
//DICA: o problema é mais fácil de resolver se você definir uma classe para armazenar os dados de cada produto, e essa classe implementar a interface Comparable.