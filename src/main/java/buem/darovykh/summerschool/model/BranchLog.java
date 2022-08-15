package buem.darovykh.summerschool.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class BranchLog {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Branch whereAgentWorks;
    private Agent agent;

    public BranchLog() {
    }

    public BranchLog(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public BranchLog(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt,
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BranchLog branchLog = (BranchLog) o;
        return id.equals(branchLog.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "BranchLog{" +
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
