package esd;


import java.util.Random;

public class ListaSequencialSimples <T> {

    T[] area;
    int len = 0;
    int fim = 0;
    final int defcap = 8;

    @SuppressWarnings("unchecked")
    public ListaSequencialSimples() {
        area = (T[])new Object[defcap];
    }

    @SuppressWarnings("unchecked")
    void expande(int len) {
        // isto será usado quando for necessário expandir a capacidade da lista
        T[] newArea = (T[]) new Object[len];
        for (int i =0; i < len; i++) {
            newArea[i] = area[i];
        }
        area = newArea;
    }

    public void expande() {
        // expande a capacidade da lista: nova capacidade deve ser o dobro da atual
        expande(2*area.length);
    }

    public boolean esta_vazia() {
        return len == 0;
    }

    public int capacidade() {
        return area.length;
    }

    public void adiciona(T elemento) {
        if (len == area.length){
            expande();
        }
        area[len] = elemento;
        len ++;

    }

    public void remove(int indice) {
        // remove um valor da posição indicada pelo parâmetro "indice"
        // move para essa posição o valor que está no final da lista
        // disparar uma exceção IndexOutOfBoundsException caso posição seja inválida
        if (indice < 0 || indice >= len) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
        for (int i = indice; i < len - 1; i++) {
            area[i] = area[i + 1]; // shift à esquerda
        }
        area[len - 1] = null;
        len--;
    }

    public int procura(T valor) {
        // retorna um inteiro que representa aposição onde valor foi encontrado pela primeira vez (contando do início da lista)
        // retorna -1 se não o encontrar !,
        for (int i =0; i<len; i++){
            if (valor != null && valor.equals(area[i])){
                return i;
            }
        }
        return -1;
    }

    public T obtem(int indice) {
        // retorna o valor armazenado na posição indica pelo parâmetro "indice"
        // disparar uma exceção IndexOutOfBoundsException caso posição seja inválida
        if(indice < 0 || indice >= len){
            throw new IndexOutOfBoundsException("Índice Invalido:"+ indice);
        }
        return area[indice];
    }

    public void substitui(int indice, T valor) {
        // armazena o valor na posição indicada por "indice", substituindo o valor lá armazenado atualmente
        // disparar uma exceção IndexOutOfBoundsException caso posição seja inválida
        if(indice < 0 || indice >= len){
            throw new IndexOutOfBoundsException("Índice Invalido:"+ indice);
        }
        area[indice] = valor;
    }

    public int comprimento() {
        // retorna um inteiro que representa o comprimento da lista (quantos valores estão armazenados)
        return len;
    }

    public void limpa() {
        // esvazia a lista
        for (int i = 0; i < len; i++) {
            area[i] = null;
        }

        len = 0;
    }

    public void embaralha() {
        if (len > 1) {

            Random gerador = new Random();

            for (int i = len - 1; i > 0; i--) {
                int j = gerador.nextInt(i + 1);
                T temp = area[i];
                area[i] = area[j];
                area[j] = temp;
            }
        }
    }

}