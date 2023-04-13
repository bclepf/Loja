
package loja;
import java.util.ArrayList;
import java.util.List;
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
    private List<Produto> itens = new ArrayList<>();
    private Cliente Cliente;

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

    public void additens(Produto produto) {
        this.itens.add(produto);
    }

    public Produto removeitens(Produto produto) {
        int index = this.itens.indexOf(produto);
        if (index != -1) {
            return this.itens.remove(index);
        }
        return null;
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
}