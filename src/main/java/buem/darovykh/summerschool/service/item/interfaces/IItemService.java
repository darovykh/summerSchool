package buem.darovykh.summerschool.service.item.interfaces;

import buem.darovykh.summerschool.model.Item;

import java.util.List;

public interface IItemService {
    Item create(Item item);
    Item get(String id);
    Item update(Item item);
    void delete(String id);
    List<Item> getAll();
}
