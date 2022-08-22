package buem.darovykh.summerschool.service.agent.impls;

import buem.darovykh.summerschool.model.Agent;
import buem.darovykh.summerschool.repository.AgentFakeRepository;
import buem.darovykh.summerschool.service.agent.interfaces.IAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentServiceImpl implements IAgentService {

    @Autowired
    private AgentFakeRepository repository;

    @Override
    public Agent create(Agent agent) {
        return repository.save(agent);
    }

    @Override
    public Agent get(String id) {
        return repository.findById(id);
    }

    @Override
    public Agent update(Agent agent) {
        return repository.update(agent);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Agent> getAll() {
        return repository.findAll();
    }
}