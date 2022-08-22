package buem.darovykh.summerschool.service.agent.interfaces;

import buem.darovykh.summerschool.model.Agent;

import java.util.List;

public interface IAgentService {
    Agent create(Agent item);
    Agent get(String id);
    Agent update(Agent item);
    void delete(String id);
    List<Agent> getAll();
}
