package loja;

import java.util.ArrayList;

/**
 Feito por: 
 * Bernardo Alexander Prado Clepf
 * Jhonatan Oliveira Landim Costa
 * Kayky de Castro Manso Ribeiro
 * Gustavo Bueno de Oliveira
 * Gabriel Braga de Sá
  */
public class Pedido {
    private String dataDeCriacao;
    private String status;
    private Cliente Cliente;
    private ArrayList<Produto> itens = new ArrayList<>();
     
   public void addItem(Produto produto, int quantidade) {
       PedidoItem item = new PedidoItem(produto, quantidade);
       this.itens.add(item);
}

    public PedidoItem removeItem(Produto produto, int quantidade) {
        PedidoItem item = new PedidoItem(produto, 2);
        if (this.itens.contains(item)) {
            this.itens.remove(item);
        }
        return item;
    }

    public double calculaValorTotal() {
        double valorTotal = 0.0;
        for (Produto produto : this.itens) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Pedido(String dataDeCriacao, String status) {
        this.dataDeCriacao = dataDeCriacao;
        this.status = status;
    }
}