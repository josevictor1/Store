package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import project.PersistRepository.PedidoRepository;
import project.model.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/")
    public List<Pedido> pedido(){

        return (List<Pedido>) pedidoRepository.findAll();

    }


    /**
     * @param id (obrigatorio)
     * @return retonar todos pedidos por id
     */
    @GetMapping("/{id}")
    public Pedido pedido(@PathVariable("id") int id){

        List<Pedido> dbPedidos = (List<Pedido>) pedidoRepository.findAll();

        for(Pedido aux: dbPedidos)
        {
            if(aux.getId() == id){
                return aux;
            }
        }

        return null;
    }

    @PostMapping
    public String addPedido(@RequestBody Pedido pedido, BindingResult result){

        if (result.hasErrors()) {
            return "error";
        }

        pedidoRepository.save(pedido);

        return "Salvo com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String removePedido(@PathVariable int id )
    {
        Pedido pedido = pedidoRepository.findById(id);

        if(pedido == null)
            return "Nada removido!";

        pedidoRepository.delete(pedido);

        return "Removido com sucesso!";
    }
/*
    @RequestMapping(value = "/changePedido/{id}", method = PUT)
    public String changePedido(@RequestBody Pedido pedido, @PathVariable int id)
    {
        int i;
        for(i = 0; i < pedidos.size() ;i++)
        {
            if(pedidos.get(i).getId() == id) {
                changePedidoHelp(pedido,pedidos.get(i));
                break;
            }
        }
        if(i==pedidos.size())
            return "Not exist";
        return "OK changed";
    }
*/

}