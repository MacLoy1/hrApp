package fr.afrogeek.hrApp.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.afrogeek.hrApp.entity.Employee;
@Repository /* besagt dass eien Inteface ein Bestandteil von Repository utiliser pour encapsuler les details
 d acces aux données et traduuire les exceptions specifiques a la persistance en exception permettant une 
 gestion exeptionnelle independante de la technologie persistance sousjacente*/
public interface EmployeeeRepository extends JpaRepository<Employee,UUID>{

}
