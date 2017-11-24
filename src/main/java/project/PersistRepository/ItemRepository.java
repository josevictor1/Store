package project.PersistRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {


    Item findOneById(int id);

}
