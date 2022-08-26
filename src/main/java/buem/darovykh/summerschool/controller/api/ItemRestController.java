package buem.darovykh.summerschool.controller.api;

import buem.darovykh.summerschool.model.Item;
import buem.darovykh.summerschool.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/items/")
@RestController
@CrossOrigin
public class ItemRestController {

    @Autowired
    IItemService service;

    @GetMapping("")
    public List<Item> showAll() {
        return service.getAll();
    }

    @PostMapping("/all")
    public List<Item> saveAll(@RequestBody List<Item> items){
        return service.saveAll(items);
    }

    @GetMapping("{id}")
    public Item showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Item insertOne(@RequestBody Item item){
        return service.create(item);
    }
    @PutMapping()
    public Item updateOne(@RequestBody Item item){
        return service.update(item);
    }
}
