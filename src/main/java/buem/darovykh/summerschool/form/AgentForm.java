package buem.darovykh.summerschool.form;

import java.time.LocalDateTime;

public class AgentForm {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private String phone;
    // for day
    // stores money in hundredths (if the number is longer than hundredths, then it is rounded up to hundredths)
    private Integer fixSalary;

    public AgentForm() {
    }

    public AgentForm(String name, String description, String firstName, String lastName, String patronymic,
                     String address, String phone, Integer fixSalary) {
        this.name = name;
        this.description = description;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.fixSalary = fixSalary;
    }

    public AgentForm(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt,
                     String firstName, String lastName, String patronymic, String address, String phone,
                     Integer fixSalary) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.fixSalary = fixSalary;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(Integer fixSalary) {
        this.fixSalary = fixSalary;
    }

    @Override
    public String toString() {
        return "AgentForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", fixSalary=" + fixSalary +
                '}';
    }
}