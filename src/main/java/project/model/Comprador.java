package project.model;

import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity

public class Comprador implements Serializable {

    @Id
    private String CPF;


    private String Nome;
    //Será PK

    @OneToOne
    private Endereco End;

    protected Comprador(){}

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Endereco getEnd() {
        return End;
    }

    public void setEnd(Endereco end) {
        End = end;
    }
}
