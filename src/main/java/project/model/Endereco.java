package project.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {

    //Será entidade fraca

    @PrimaryKeyJoinColumn
    @Id
    @OneToOne
    @JoinColumn
    private  Comprador comprador;

    private String Logradouro;

    private int numero;

    private String complemento;

    private String bairro;

    private String cidade;

    protected Endereco(){}

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
