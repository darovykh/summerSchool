package buem.darovykh.summerschool.controller.api;

import buem.darovykh.summerschool.model.Branch;
import buem.darovykh.summerschool.service.branch.interfaces.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/branches/")
@RestController
public class BranchRestController {
    @Autowired
    private IBranchService service;

    @GetMapping("")
    public List<Branch> showAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public Branch showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Branch insertOne(@RequestBody Branch branch){
        return service.create(branch);
    }
    @PutMapping()
    public Branch updateOne(@RequestBody Branch branch){
        return service.update(branch);
    }
}
