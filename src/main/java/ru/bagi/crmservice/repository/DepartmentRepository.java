package ru.bagi.crmservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bagi.crmservice.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {}
