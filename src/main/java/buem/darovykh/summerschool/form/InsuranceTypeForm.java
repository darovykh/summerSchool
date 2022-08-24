package buem.darovykh.summerschool.form;

import java.time.LocalDateTime;

public class InsuranceTypeForm {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String typeName;
    // stores percentage in hundredths (if the number is longer than hundredths, then it is rounded up to hundredths)
    private Integer agentSalaryPercent;

    public InsuranceTypeForm() {
    }

    public InsuranceTypeForm(String name, String description, String typeName, Integer agentSalaryPercent) {
        this.name = name;
        this.description = description;
        this.typeName = typeName;
        this.agentSalaryPercent = agentSalaryPercent;
    }

    public InsuranceTypeForm(String id, String name, String description, LocalDateTime createdAt,
                             LocalDateTime updatedAt, String typeName, Integer agentSalaryPercent) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.typeName = typeName;
        this.agentSalaryPercent = agentSalaryPercent;
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

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getAgentSalaryPercent() {
        return agentSalaryPercent;
    }

    public void setAgentSalaryPercent(Integer agentSalaryPercent) {
        this.agentSalaryPercent = agentSalaryPercent;
    }

    @Override
    public String toString() {
        return "InsuranceTypeForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", typeName='" + typeName + '\'' +
                ", agentSalaryPercent=" + agentSalaryPercent +
                '}';
    }
}
