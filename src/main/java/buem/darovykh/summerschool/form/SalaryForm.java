package buem.darovykh.summerschool.form;

import java.time.LocalDateTime;

public class SalaryForm {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String agentId;
    // is percent from all contracts contractBonus + Agent.fixSalary
    // stores money in hundredths (if the number is longer than hundredths, then it is rounded up to hundredths)
    private Integer salary;

    // stores money in hundredths (if the number is longer than hundredths, then it is rounded up to hundredths)
    private Integer contractBonus;

    private LocalDateTime from;
    private LocalDateTime to;

    public SalaryForm() {
    }

    public SalaryForm(String name, String description, String agentId, Integer salary,
                      Integer contractBonus, LocalDateTime from, LocalDateTime to) {
        this.name = name;
        this.description = description;
        this.agentId = agentId;
        this.salary = salary;
        this.contractBonus = contractBonus;
        this.from = from;
        this.to = to;
    }

    public SalaryForm(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt,
                      String agentId, Integer salary, Integer contractBonus, LocalDateTime from,
                      LocalDateTime to) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.agentId = agentId;
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

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
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
    public String toString() {
        return "SalaryForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", agentId='" + agentId + '\'' +
                ", salary=" + salary +
                ", contractBonus=" + contractBonus +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
