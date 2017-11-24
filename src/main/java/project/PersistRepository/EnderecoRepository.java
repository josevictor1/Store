package project.PersistRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
