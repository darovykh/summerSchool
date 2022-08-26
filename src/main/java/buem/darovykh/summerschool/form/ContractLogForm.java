package buem.darovykh.summerschool.form;

import buem.darovykh.summerschool.model.*;

import java.time.LocalDateTime;

public class ContractLogForm {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Client client;
    private Agent agent;
    private Contract contract;
    private Branch whereContactWasSigned;
    private InsuranceType insuranceType;

    public ContractLogForm() {
    }

    public ContractLogForm(String name, String description, Client client, Agent agent, Contract contract,
                           Branch whereContactWasSigned, InsuranceType insuranceType) {
        this.name = name;
        this.description = description;
        this.client = client;
        this.agent = agent;
        this.contract = contract;
        this.whereContactWasSigned = whereContactWasSigned;
        this.insuranceType = insuranceType;
    }

    public ContractLogForm(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt,
                           Client client, Agent agent, Contract contract, Branch whereContactWasSigned,
                           InsuranceType insuranceType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.client = client;
        this.agent = agent;
        this.contract = contract;
        this.whereContactWasSigned = whereContactWasSigned;
        this.insuranceType = insuranceType;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public Branch getWhereContactWasSigned() {
        return whereContactWasSigned;
    }

    public void setWhereContactWasSigned(Branch whereContactWasSigned) {
        this.whereContactWasSigned = whereContactWasSigned;
    }

    public InsuranceType getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }

    @Override
    public String toString() {
        return "ContractLogForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", client=" + client +
                ", agent=" + agent +
                ", contract=" + contract +
                ", whereContactWasSigned=" + whereContactWasSigned +
                ", insuranceType=" + insuranceType +
                '}';
    }
}
