package com.rjsbmysql.repository;

import com.rjsbmysql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value="select employee.id from employee where employee.name=?", nativeQuery = true)
    public int getEmployeeId(String name);

}
