package ru.bagi.crmservice.controller;

import org.springframework.web.bind.annotation.*;
import ru.bagi.crmservice.model.Department;
import ru.bagi.crmservice.service.DepartmentService;

import java.util.List;
import java.util.Optional;

/**
 * Контроллер для управления отделами организации
 */
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    /**
     * Получение списка всех отделов
     */
    @GetMapping
    public List<Department> getAll() {
        return departmentService.getAllDepartments();
    }

    /**
     * Создание нового отдела
     */
    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

}