package fr.afrogeek.hrApp.entity;

import java.time.LocalDateTime;
import java.util.UUID;

//import javax.swing.text.Position;


import fr.afrogeek.hrApp.enums.Gender;
import fr.afrogeek.hrApp.enums.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity// besagt dass diese Klasse mit einer Table in der DB und SpringBoot wird diese Table erzeugt
@Table (name="employees")  // damit die Table dass SpringBoot erzeugen wird, weist den Name Employees zu anstant eine Table default zu create
@Data // fuer getter & Setter Methoden
@Builder // Wenn man ein neues Objekt der klasse Employee erzeugt kann man damit machen.
@ToString
@AllArgsConstructor // Konstruktor mit alle Atributen
@NoArgsConstructor // mit keinem Attribut leer ohne Argument
@Getter // pour avoir les getter 
@Setter // pour avoir des setter

public class Employee {
    
    @Id  // Primary key
    @GeneratedValue // id werden automatisch generiert
    
    private UUID id; // sind so definiert fuer mehr Sicherheit hier wir keine Column(nullable = false) weil als default ein ID wird immer erzeugt


    @Enumerated(EnumType.STRING) // weil Die EnumType als Default als index gespeichert werden und damit dass die Werte unsere String in Enum nimmst schreiben wird diesse Zeile zur Konvertierung

    @Column(nullable = false) // damit die Colum nicht null initialisiert werden. (Pflichtfelder)
    private Gender gender;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phone;
    
    @Column(nullable = false)
    private LocalDateTime dateOfBirth;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private Long remainingVacationDays;

    @Column(nullable = false)
    private boolean isOnVaction;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Position position;

    @Column(nullable = false)
    private String imageURL;




    

   


}
