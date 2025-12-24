package ru.bagi.crmservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bagi.crmservice.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
