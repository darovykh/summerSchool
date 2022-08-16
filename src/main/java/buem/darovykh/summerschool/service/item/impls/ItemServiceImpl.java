package buem.darovykh.summerschool.service.item.impls;

import buem.darovykh.summerschool.model.Item;
import buem.darovykh.summerschool.repository.item.ItemFakeRepository;
import buem.darovykh.summerschool.repository.item.ItemMongoRepository;
import buem.darovykh.summerschool.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {

    private LocalDateTime now = LocalDateTime.now();
    private List<Item> items = new ArrayList<>(
            Arrays.asList(
                    new Item("1", "item1", "descr 1", now, now),
                    new Item("2", "item2", "descr 2", now, now),
                    new Item("3", "item3", "descr 3", now, now),
                    new Item("4", "item4", "descr 4", now, now),
                    new Item("5", "item5", "descr 5", now, now)
            ));

    @Autowired
    ItemMongoRepository repository;

/*    @PostConstruct
    void init(){
        repository.saveAll(items);
    }*/

    @Override
    public Item create(Item item) {
        item.setCreatedAt(LocalDateTime.now());
        return repository.save(item);
    }

    @Override
    public Item get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public Item update(Item item) {
        item.setUpdatedAt(LocalDateTime.now());
        return repository.save(item);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Item> getAll() {
        return repository.findAll();
    }
}
