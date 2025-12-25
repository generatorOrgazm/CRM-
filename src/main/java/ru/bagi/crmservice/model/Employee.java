package ru.bagi.crmservice.model;

import jakarta.persistence.*;

/**
 * Сущность сотрудника, так же содержит связи с Department и Position
 */
@Entity
public class Employee {

    /**
     * Уникальный идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Имя сотрудника
     */
    private String firstName;

    /**
     *Фамилия сотрудника
     */
    private String lastName;

    /**
     Отдел, к которому привязан сотрудник
     */
    @ManyToOne
    private Department department;

    /**
     Должность сотрудника
     */
    @ManyToOne
    private Position position;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    public Position getPosition() { return position; }
    public void setPosition(Position position) { this.position = position; }
}
