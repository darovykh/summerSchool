package buem.darovykh.summerschool.service.agent.impls;

import buem.darovykh.summerschool.model.Agent;
import buem.darovykh.summerschool.repository.item.AgentMongoRepository;
import buem.darovykh.summerschool.service.agent.interfaces.IAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AgentServiceImpl implements IAgentService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Agent> agents = new ArrayList<>(
            Arrays.asList(
                    new Agent("1", "agent1", "descr 1", now, now, "Sara","Johns",
                            "-", "UK, London, Baker str., 221b", "0954458622", 30000),
                    new Agent("2", "agent2", "descr 2", now, now, "Tonald","Drump",
                            "-", "1421A 28th St, North Bergen, NJ 07047, USA", "06678164883", 30000),
                    new Agent("3", "agent3", "descr 3", now, now, "Vasil","Chemresh",
                            "Tarasovich", "Ukraine, Kyiv, Stepana Bandery str., 16, 31",
                            "0951063430", 30000),
                    new Agent("4", "agent4", "descr 4", now, now, "Richard","Brendson",
                            "-", "UK, Birmingham, 14 Denby Cl", "01482264852", 30000),
                    new Agent("5", "agent5", "descr 5", now, now, "Patricia","Kaas",
                            "-", "France, Parish, 19 Rue Octave Feuillet", "498732194861", 30000)
            ));

    @Autowired
    AgentMongoRepository repository;

    /*@PostConstruct
   void init(){
       repository.saveAll(agents);
   }*/

    @Override
    public Agent create(Agent agent) {
        LocalDateTime now = LocalDateTime.now();
        agent.setCreatedAt(now);
        agent.setUpdatedAt(now);
        return repository.save(agent);
    }

    @Override
    public Agent get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public Agent update(Agent agent) {
        agent.setUpdatedAt(LocalDateTime.now());
        return repository.save(agent);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Agent> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Agent> saveAll(List<Agent> agents) {
        return repository.saveAll(agents);
    }
}
