package ru.bagi.crmservice.controller;

import org.springframework.web.bind.annotation.*;
import ru.bagi.crmservice.model.Employee;
import ru.bagi.crmservice.service.EmployeeService;
import java.util.List;

/**
 * Контроллер для работы с сотрудниками через API.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    /**
     * Получить список всех сотрудников
     */
    @GetMapping
    public List<Employee> getAll() { return service.getAll(); }

    /** С
     * Создать нового сотрудника
     */
    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return service.save(employee);
    }

    /**
     * Обновить данные сотрудника
     */
    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return service.save(employee); //
    }

    /**
     * Удалить сотрудника
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}