package project.PersistRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    Pedido findById(int id);

}
