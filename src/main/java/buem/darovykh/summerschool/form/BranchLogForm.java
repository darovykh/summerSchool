package buem.darovykh.summerschool.form;

import buem.darovykh.summerschool.model.Agent;
import buem.darovykh.summerschool.model.Branch;

import java.time.LocalDateTime;

public class BranchLogForm {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Branch whereAgentWorks;
    private Agent agent;

    public BranchLogForm() {
    }

    public BranchLogForm(String name, String description, Branch whereAgentWorks, Agent agent) {
        this.name = name;
        this.description = description;
        this.whereAgentWorks = whereAgentWorks;
        this.agent = agent;
    }

    public BranchLogForm(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt,
                         Branch whereAgentWorks, Agent agent) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.whereAgentWorks = whereAgentWorks;
        this.agent = agent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Branch getWhereAgentWorks() {
        return whereAgentWorks;
    }

    public void setWhereAgentWorks(Branch whereAgentWorks) {
        this.whereAgentWorks = whereAgentWorks;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    @Override
    public String toString() {
        return "BranchLogForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", whereAgentWorks=" + whereAgentWorks +
                ", agent=" + agent +
                '}';
    }
}
