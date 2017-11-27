package project.model;

import javax.persistence.*;

import javax.persistence.Column;

import java.io.Serializable;

@Entity
@Table(name = "comprador")
public class Comprador implements Serializable {

    @Id
    @Column(name="cpf_comprador")
    private String cpf;


    private String Nome;
    //Será PK

    @Embedded
    private Endereco End;

    protected Comprador(){}

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String CPF) {
        this.cpf = CPF;
    }

    public Endereco getEnd() {
        return End;
    }

    public void setEnd(Endereco end) {
        End = end;
    }
}
