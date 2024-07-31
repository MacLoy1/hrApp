package fr.afrogeek.hrApp.service;


import org.springframework.stereotype.Service;

import fr.afrogeek.hrApp.entity.Employee;
import fr.afrogeek.hrApp.repository.EmployeeeRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor /*lombok genere automatiquement un constructeur avec parametre
 obligatoire pour chaque champs dans la classe qui utile pour l injection des dépendances car 
 employee Repository automatiquement injecté pae SprinBoot au moment de la creation de notre Service*/
public class EmployeeService {
    
    private final EmployeeeRepository employeeeRepository;/*final alors doit etre initialiser a la creation de L objet
    cet interface permet a la classe de service de communiquer avec la base de données pour executer les operations
    CRUD sur les Employee ces Operations sont definis plus bas*/
    public Employee creatEmployee(Employee employee){ //Create Methode

        return employeeeRepository.save(employee);//methode save enregistre un objet employee dans la Db et renvoi l onjet saubegardé
    }
    public Employee getEmployeeById(UUID id){

        return employeeeRepository.findById(id).orElseThrow(

        ()-> new RuntimeException("Employee with id ="+id+"not found"));// wenn keine Employee mit dem Id gefunden dann verwalten mit exception
    }
    public List<Employee> getAllEmployee(){

        return employeeeRepository.findAll();
    }
    public Employee updatEmployee(UUID id ,Employee employeeDetails){ //
        Employee employee = this.getEmployeeById(id); 

        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getFirstName());
        employee.setEmail(employeeDetails.getEmail());
        employee.setPhone(employeeDetails.getPhone());
        employee.setGender(employeeDetails.getGender());
        employee.setDateOfBirth(employeeDetails.getDateOfBirth());
        employee.setCity(employeeDetails.getCity());
        employee.setCountry(employeeDetails.getCountry());
        employee.setRemainingVacationDays(employeeDetails.getRemainingVacationDays());
        employee.setOnVaction(employeeDetails.isOnVaction());
        employee.setPosition(employeeDetails.getPosition());
        return employeeeRepository.save(employee);
    }

    public void deleteEmployee(UUID id){

        employeeeRepository.deleteById(id);
    }
}
