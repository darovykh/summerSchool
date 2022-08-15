package buem.darovykh.summerschool.controller.api;

import buem.darovykh.summerschool.model.Item;
import buem.darovykh.summerschool.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/items")
@RestController
public class ItemRestController {

    @Autowired
    IItemService service;

    @RequestMapping("/")
    public List<Item> showAll() {
        return service.getAll();
    }
}
