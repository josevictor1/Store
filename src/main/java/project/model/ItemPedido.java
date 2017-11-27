package project.model;

import project.model.Pedido;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ItemPedido implements Serializable {

    @EmbeddedId
    private ItemPedidoId id;

    private int qtd;

    public ItemPedido() {
    }

    public ItemPedido(int qtd) {
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

}
