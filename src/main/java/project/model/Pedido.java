package project.model;


import javax.persistence.*;
import java.util.List;


@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column
    private int comprador;

    @Column
    private int vendedor;

    @OneToMany
    private List<ItemPedido> itens;

    @Enumerated(EnumType.STRING)
    private State state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    protected Pedido()
    {
        state = State.INICIADO;
    }

    public int getComprador() {
        return comprador;
    }

    public void setComprador(int  comprador) {
        this.comprador = comprador;
    }

    public int  getVendedor() {
        return vendedor;
    }

    public void setVendedor(int  vendedor) {
        this.vendedor = vendedor;
    }

    List<ItemPedido> getItems() {
        return itens;
    }

    public void setItems( List<ItemPedido> itens) {
        this.itens = itens;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
