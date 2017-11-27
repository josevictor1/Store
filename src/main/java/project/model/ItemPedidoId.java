package project.model;

import project.model.Item;
import project.model.Pedido;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ItemPedidoId implements Serializable{

    @ManyToOne
    @JoinColumn
    private Item item;

    @ManyToOne
    @JoinColumn
    private Pedido pedido;

    public ItemPedidoId(){

    }


    public ItemPedidoId(Item item, Pedido pedido)
    {
        this.item = item;

        this.pedido = pedido;
    }



}
