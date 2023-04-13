
package loja;

/**
 Feito por: 
 * Bernardo Alexander Prado Clepf
 * Jhonatan Oliveira Landim Costa
 * Kayky de Castro Manso Ribeiro
 * Gustavo Bueno de Oliveira
 * Gabriel Braga de Sá
  */
public class Endereco {
    private String rua;
    private String numero;
    private Cidade Cidade;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cidade getCidade() {
        return Cidade;
    }

    public void setCidade(Cidade Cidade) {
        this.Cidade = Cidade;
    }
    
void Endereco(String rua, String numero){
    this.rua = rua;
    this.numero = numero;
}

}
