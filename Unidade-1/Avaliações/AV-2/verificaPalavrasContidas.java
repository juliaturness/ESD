//Escreva um programa que verifique se todas as palavras de um arquivo existem em outro arquivo (independente da ordem em que aparecem). Quer dizer, se as palavras do primeiro arquivo for representado pelo conjunto S1 e as do segundo arquivo pelo conjunto S2, seu programa deve verificar se:
//
//subset
//
//Note que isso não é o mesmo que verificar se S1 = S2 !!!
//
//Essa verificação deve ser eficiente, e sua complexidade de tempo computacional deve ser menor que O(n2). De fato, ela pode ser feita com complexidade O(n log n) ... basta organizar as palavras em uma sequência conveniente (e com isso poder usar um algoritmo de busca rápido) !
//
//Os nomes dos arquivos são informados por meio de argumentos de linha de comando.
//
//Se todas as palavras do primeiro arquivo existirem no segundo arquivo, seu programa deve mostrar a palavra VERDADEIRO na tela. Caso contrário, ele deve apresentar FALSO.
//
//O seguinte projeto gradle contém um teste para seu programa. Se quiser utilizá-lo (RECOMENDADO), descompacte-o e abra-o com o IntelliJ IDEA:
//
//ComparaArquivos.tar.xz
//Implemente seu pograma a partir da classe Main.java (do contrário o teste não funcionará). Para testar seu programa, acesse a task Verification->test no painel do Gradle, como mostrado neste video:
//
//Tocar Vídeo
//IMPORTANTE
//Você deve usar as suas estruturas de dados para resolver este exercício. Lembre que será avaliado:
//
//A escolha das estruturas de dados para resolver o problema
//O uso eficiente e adequado dessas estruturas de dados
//O resultado cumprir o que foi pedido no enunciadoa