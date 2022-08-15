package buem.darovykh.summerschool.repository;

import buem.darovykh.summerschool.model.Item;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class ItemFakeRepository {
    private List<Item> items = List.of(
            new Item("1", "item1", "descr 1", LocalDateTime.now(), LocalDateTime.now()),
            new Item("2", "item2", "descr 2", LocalDateTime.now(), LocalDateTime.now()),
            new Item("3", "item3", "descr 3", LocalDateTime.now(), LocalDateTime.now()),
            new Item("4", "item4", "descr 4", LocalDateTime.now(), LocalDateTime.now()),
            new Item("5", "item5", "descr 5", LocalDateTime.now(), LocalDateTime.now())
    );

    public List<Item> findAll(){
        return this.items;
    }

    public Item findById(String id) {
        return null;
    }

    public Item update(Item item) {
        return null;
    }

    public void deleteById(String id) {
    }

    public Item save(Item item) {
        return null;
    }
}
