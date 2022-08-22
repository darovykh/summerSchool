package buem.darovykh.summerschool.service.agent.interfaces;

import buem.darovykh.summerschool.model.Agent;

import java.util.List;

public interface IAgentService {
    Agent create(Agent agent);
    Agent get(String id);
    Agent update(Agent agent);
    void delete(String id);
    List<Agent> getAll();
}
