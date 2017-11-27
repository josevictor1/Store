package project.PersistRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Comprador;

public interface CompradorRepository extends JpaRepository<Comprador, String> {

    Comprador findByCpf(String cpf);

}
