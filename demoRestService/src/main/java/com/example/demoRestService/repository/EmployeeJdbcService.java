package com.example.demoRestService.repository;

import com.example.demoRestService.models.Employee;
import com.example.demoRestService.services.MyService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Slf4j
@Profile("h2")
public class EmployeeJdbcService implements MyService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void setup(){
        jdbcTemplate.execute("create table employee (id int auto_increment primary key, name varchar, email varchar, salary number)");
        jdbcTemplate.update("insert into employee(name, email, salary) values (?,?,?)","Nila", "nila@nila.com", 2000.00 );
        jdbcTemplate.update("insert into employee(name, email, salary) values (?,?,?)","Joe", "Joe@nila.com", 3000.00 );
        jdbcTemplate.update("insert into employee(name, email, salary) values (?,?,?)","Andy", "Andy@nila.com", 4000.00 );
    }


    @Override
    public void createEmployee(Employee employee) {

    }

    @Override
    public void updateEmployee(int id, Employee employee) {

    }

    @Override
    public void deleteEmployee(int id) {

    }

    @Override
    public Employee getEmployeeById(int id) {
        return jdbcTemplate.queryForObject("select * from employee where id=?", new EmployeeROwMapper(), id );
    }
    @Override
    public List<Employee> getAllEmployees() {
        return jdbcTemplate.query("select * from employee", new EmployeeROwMapper());
    }

    public static class EmployeeROwMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            return Employee.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .email(rs.getString("email"))
                    .salary(rs.getDouble("salary"))
                    .build();
        }
    }
}
