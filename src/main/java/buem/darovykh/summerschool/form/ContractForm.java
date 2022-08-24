package buem.darovykh.summerschool.form;

import java.time.LocalDateTime;

public class ContractForm {

    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // the cost of what is insured
    // stores money in hundredths (if the number is longer than hundredths, then it is rounded up to hundredths)
    private Integer sumInsured;
    // how much the insured must pay (percentage)
    // stores percentage in hundredths (if the number is longer than hundredths, then it is rounded up to hundredths)
    private Integer tariffRate;

    public ContractForm() {
    }

    public ContractForm(String name, String description, Integer sumInsured, Integer tariffRate) {
        this.name = name;
        this.description = description;
        this.sumInsured = sumInsured;
        this.tariffRate = tariffRate;
    }

    public ContractForm(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt,
                        Integer sumInsured, Integer tariffRate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.sumInsured = sumInsured;
        this.tariffRate = tariffRate;
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

    public Integer getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(Integer sumInsured) {
        this.sumInsured = sumInsured;
    }

    public Integer getTariffRate() {
        return tariffRate;
    }

    public void setTariffRate(Integer tariffRate) {
        this.tariffRate = tariffRate;
    }

    @Override
    public String toString() {
        return "ContractForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", sumInsured=" + sumInsured +
                ", tariffRate=" + tariffRate +
                '}';
    }
}
