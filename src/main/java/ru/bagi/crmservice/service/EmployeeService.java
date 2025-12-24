package ru.bagi.crmservice.service;

import org.springframework.stereotype.Service;
import ru.bagi.crmservice.model.Employee;
import ru.bagi.crmservice.repository.EmployeeRepository;
import java.util.List;

/**
 * Сервис для управления сотрудниками.
 */
@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    /**
     Возвращает список всех сотрудников
     */
    public List<Employee> getAll() { return repository.findAll(); }

    /**
     * Сохраняет нового сотрудника
     */
    public Employee save(Employee employee) { return repository.save(employee); }

    /** Удаляет сотрудника по ID
     */
    public void delete(Long id) { repository.deleteById(id); }
}