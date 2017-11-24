package project.PersistRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Comprador;

public interface CompradorRepository extends JpaRepository<Comprador, Long> {

    Comprador findOneCpf(String cpf);

}
