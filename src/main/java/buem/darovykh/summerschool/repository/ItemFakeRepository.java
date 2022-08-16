package buem.darovykh.summerschool.repository;

import buem.darovykh.summerschool.model.Item;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class ItemFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private List<Item> items = new ArrayList<>(
            Arrays.asList(
                    new Item("1", "item1", "descr 1", now, now),
                    new Item("2", "item2", "descr 2", now, now),
                    new Item("3", "item3", "descr 3", now, now),
                    new Item("4", "item4", "descr 4", now, now),
                    new Item("5", "item5", "descr 5", now, now)
            ));

    public List<Item> findAll(){
        return this.items;
    }

    public Item findById(String id) {
        return this.items.stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Item update(Item item) {
        this.deleteById(item.getId());
        item.setUpdatedAt(LocalDateTime.now());
        this.items.add(item);
        return  item;
    }

    public void deleteById(String id) {
        Item item = this.findById(id);
        this.items.remove(item);
    }

    public Item save(Item item) {
        LocalDateTime saveAt = LocalDateTime.now();
        item.setId(UUID.randomUUID().toString());
        item.setCreatedAt(saveAt);
        item.setUpdatedAt(saveAt);
        this.items.add(item);
        return item;
    }
}
