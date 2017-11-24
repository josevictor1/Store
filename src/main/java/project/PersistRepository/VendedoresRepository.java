package project.PersistRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Vendedor;

public interface VendedoresRepository extends JpaRepository<Vendedor, Long> {

    Vendedor findOneByCnpj(String cnpj);

}
