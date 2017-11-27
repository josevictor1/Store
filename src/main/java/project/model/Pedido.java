package project.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="pedido")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_pedido")
    private int id;

    @ManyToOne
    private Comprador comprador;

    @ManyToOne
    private Vendedor vendedor;

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

    public Pedido()
    {
        state = State.INICIADO;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador  comprador) {
        this.comprador = comprador;
    }

    public Vendedor  getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor  vendedor) {
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
