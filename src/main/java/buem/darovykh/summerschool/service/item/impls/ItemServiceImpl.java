package buem.darovykh.summerschool.service.item.impls;

import buem.darovykh.summerschool.model.Item;
import buem.darovykh.summerschool.repository.ItemFakeRepository;
import buem.darovykh.summerschool.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {

    @Autowired
    private ItemFakeRepository repository;

    @Override
    public Item create(Item item) {
        return repository.save(item);
    }

    @Override
    public Item get(String id) {
        return repository.findById(id);
    }

    @Override
    public Item update(Item item) {
        return repository.update(item);
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
