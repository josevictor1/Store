package project.PersistRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    Pedido findById(int id);

}
