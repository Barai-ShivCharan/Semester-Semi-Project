package org.codngwallah.emproject;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class EmpController {

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        emp.setName("Shivam")
        return employees;
    }
}
