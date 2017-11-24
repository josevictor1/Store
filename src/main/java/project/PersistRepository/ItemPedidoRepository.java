package project.PersistRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
