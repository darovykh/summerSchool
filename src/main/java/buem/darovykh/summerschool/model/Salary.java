package buem.darovykh.summerschool.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Salary {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Agent agent;
    private Contract contract;
    // is percent from all contracts (Contract.sumInsured * Contract.tariffRate * InsuranceType.agentSalaryPercent)
    // stores money in hundredths (if the number is longer than hundredths, then it is rounded up to hundredths)
    private Integer agentSalary;

    public Salary() {
    }

    public Salary(String name, String description, Agent agent, Contract contract, Integer agentSalary) {
        this.name = name;
        this.description = description;
        this.agent = agent;
        this.contract = contract;
        this.agentSalary = agentSalary;
    }

    public Salary(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt,
                  Agent agent, Contract contract, Integer agentSalary) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.agent = agent;
        this.contract = contract;
        this.agentSalary = agentSalary;
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

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Integer getAgentSalary() {
        return agentSalary;
    }

    public void setAgentSalary(Integer agentSalary) {
        this.agentSalary = agentSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary = (Salary) o;
        return id.equals(salary.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", agent=" + agent +
                ", contract=" + contract +
                ", agentSalary=" + agentSalary +
                '}';
    }
}
