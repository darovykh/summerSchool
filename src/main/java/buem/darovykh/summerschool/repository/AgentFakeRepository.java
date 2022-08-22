package buem.darovykh.summerschool.repository;

import buem.darovykh.summerschool.model.Agent;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class AgentFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private List<Agent> agents = new ArrayList<>(
            Arrays.asList(
                    new Agent("1", "agent1", "descr 1", now, now, "Sara","Johns",
                            null, "UK, London, Baker str., 221b", "0954458622"),
                    new Agent("2", "agent2", "descr 2", now, now, "Tonald","Drump",
                            null, "1421A 28th St, North Bergen, NJ 07047, USA", "06678164883"),
                    new Agent("3", "agent3", "descr 3", now, now, "Vasil","Chemresh",
                            "Tarasovich", "Ukraine, Kyiv, Stepana Bandery str., 16, 31",
                            "0951063430"),
                    new Agent("4", "agent4", "descr 4", now, now, "Richard","Brendson",
                            null, "UK, Birmingham, 14 Denby Cl", "01482264852"),
                    new Agent("5", "agent5", "descr 5", now, now, "Patricia","Kaas",
                            null, "France, Parish, 19 Rue Octave Feuillet", "498732194861")
            ));

    public List<Agent> findAll(){
        return this.agents;
    }

    public Agent findById(String id) {
        return this.agents.stream().filter(agent -> agent.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Agent update(Agent agent) {
        this.deleteById(agent.getId());
        agent.setUpdatedAt(LocalDateTime.now());
        this.agents.add(agent);
        return  agent;
    }


    public void deleteById(String id) {
        Agent agent = this.findById(id);
        this.agents.remove(agent);
    }

    public Agent save(Agent agent) {
        LocalDateTime saveAt = LocalDateTime.now();
        agent.setId(UUID.randomUUID().toString());
        agent.setCreatedAt(saveAt);
        agent.setUpdatedAt(saveAt);
        this.agents.add(agent);
        return agent;
    }
}