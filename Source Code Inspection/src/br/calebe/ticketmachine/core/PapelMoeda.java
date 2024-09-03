package br.calebe.ticketmachine.core;

/**
 *
 * @author Matheus Afonso Leite da Silva (10409312) & Renan Nunes dos Santos (10409432)
 */
public class PapelMoeda {

    protected int valor; // Comissão - Modificador de acesso incorreto
    protected int quantidade; // Comissão - Modificador de acesso incorreto

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
