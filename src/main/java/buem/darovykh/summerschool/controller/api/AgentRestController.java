package buem.darovykh.summerschool.controller.api;

import buem.darovykh.summerschool.model.Agent;
import buem.darovykh.summerschool.service.agent.interfaces.IAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/agents/")
@RestController
public class AgentRestController {

    @Autowired
    IAgentService service;

    @GetMapping("")
    public List<Agent> showAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public Agent showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Agent insertOne(@RequestBody Agent agent){
        return service.create(agent);
    }
    @PutMapping()
    public Agent updateOne(@RequestBody Agent agent){
        return service.update(agent);
    }
}
