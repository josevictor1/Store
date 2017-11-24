package project.controller;
import org.springframework.validation.BindingResult;
import project.model.Pedido;
import org.springframework.web.bind.annotation.*;
import project.model.State;


import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;




public class PedidoController {


    private final List<Pedido> pedidos = new ArrayList<Pedido>();


    /**
     * Metodo para retornar todos os pedidoros
     */

    @RequestMapping(value = "/pedidos", method = GET)
    public List<Pedido> comprador(){
        return pedidos;
    }


    /**
     * @param id (obrigatorio)
     * @return retonar todos os pedidos por id
     */
    @RequestMapping(value="/pedido/{id}",method = GET)
    public List<Pedido> Pedido(@PathVariable("id") int id){

        List<Pedido> returnpedidos = new ArrayList<Pedido>();

        for(Pedido pedido:pedidos)
        {
            /**
             * Testa se a cor e a marca é igual as passadas na URL
             * se for salva na lista de pedidoros a serem retornados
             */
            if(pedido.getId() == id){
                returnpedidos.add(pedido);
            }
        }

        return returnpedidos;
    }

    @RequestMapping(value="/addPedido", method = POST)
    public String addPedido(@RequestBody Pedido Pedido, BindingResult result){

        if (result.hasErrors()) {
            return "error";
        }

        pedidos.add(Pedido);
        return "OK";
    }


    @RequestMapping(value = "/removePedido/{id}", method = DELETE)
    public String removePedido(@PathVariable int id)
    {
        int i;
        for(i=0;i < pedidos.size();i++)
        {
            if(pedidos.get(i).getId() == id){
                pedidos.remove(i);
                break;
            }
        }

        if(i==pedidos.size())
            return "Not exist";

        return "OK removed";
    }

    @RequestMapping(value = "/changePedido/{id}", method = PUT)
    public String changePedido(@PathVariable int id, @RequestParam(value="state", required = false) String state)
    {
        int i;
        for(i = 0 ;i < pedidos.size(); i++)
        {
            if(pedidos.get(i).getId() == id) {
                changestatus(pedidos.get(i),state);
                break;
            }
        }

        if(i==pedidos.size())
            return "Not exist";

        return "OK changed";
    }

    public void changestatus(Pedido pedido, String state){
        if(state == null) {
            if (pedido.getState() == State.INICIADO) {
                pedido.setState(State.PENDENTE);
            }
            if (pedido.getState() == State.PENDENTE) {
                pedido.setState(State.FINALIZADO);
            }
        }

        else if(pedido.getState() == State.INICIADO && state.toUpperCase().equals(State.PENDENTE)){
            pedido.setState(State.PENDENTE);
        }

        else if(pedido.getState() == State.PENDENTE){
            if(state.toUpperCase().equals(State.CANCELADO)){
                pedido.setState(State.CANCELADO);
            }
            else if(state.toUpperCase().equals(State.CANCELADO)){
                pedido.setState(State.CANCELADO);
            }

        }


    }
}
