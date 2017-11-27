package project.model;



import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ItemPedido implements Serializable {



    private int qtd;

    @Id
    @ManyToOne
    @JoinColumn
    private Item item;

    @Id
    @ManyToOne
    @JoinColumn
    private Pedido pedido;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
