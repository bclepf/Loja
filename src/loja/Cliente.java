
package loja;

/**
 Feito por: 
 * Bernardo Alexander Prado Clepf
 * Jhonatan Oliveira Landim Costa
 * Kayky de Castro Manso Ribeiro
 * Gustavo Bueno de Oliveira
 * Gabriel Braga de Sá
  */
public class Cliente {
    private int id;
    private Pessoa Pessoa;
    private Endereco Endereco;
    private Telefone Telefone;
    void Cliente(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return Pessoa;
    }

    public void setPessoa(Pessoa Pessoa) {
        this.Pessoa = Pessoa;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }

    public Telefone getTelefone() {
        return Telefone;
    }

    public void setTelefone(Telefone Telefone) {
        this.Telefone = Telefone;
    }
    
}
