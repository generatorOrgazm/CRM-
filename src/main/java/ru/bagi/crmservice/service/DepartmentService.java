package ru.bagi.crmservice.service;

import org.springframework.stereotype.Service;
import ru.bagi.crmservice.model.Department;
import ru.bagi.crmservice.repository.DepartmentRepository;

import java.util.List;

/**
 * Сервис для управления отделами
 */
@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    /**
     * Возвращает все отделы
     */
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    /**
     * Сохраняет новый отдел
     */
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    /**
     * Удаляет текущий отдел
     */
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
