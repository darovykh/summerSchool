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
    // is percent from all contracts contractBonus + Agent.fixSalary
    // stores money in hundredths (if the number is longer than hundredths, then it is rounded up to hundredths)
    private Integer salary;

    // stores money in hundredths (if the number is longer than hundredths, then it is rounded up to hundredths)
    private Integer contractBonus;

    private LocalDateTime from;
    private LocalDateTime to;

    public Salary() {
    }

    public Salary(String name, String description, Agent agent, Contract contract, Integer salary,
                  Integer contractBonus, LocalDateTime from, LocalDateTime to) {
        this.name = name;
        this.description = description;
        this.agent = agent;
        this.contract = contract;
        this.salary = salary;
        this.contractBonus = contractBonus;
        this.from = from;
        this.to = to;
    }

    public Salary(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt,
                  Agent agent, Contract contract, Integer salary, Integer contractBonus, LocalDateTime from,
                  LocalDateTime to) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.agent = agent;
        this.contract = contract;
        this.salary = salary;
        this.contractBonus = contractBonus;
        this.from = from;
        this.to = to;
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getContractBonus() {
        return contractBonus;
    }

    public void setContractBonus(Integer contractBonus) {
        this.contractBonus = contractBonus;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
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
                ", salary=" + salary +
                ", contractBonus=" + contractBonus +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
