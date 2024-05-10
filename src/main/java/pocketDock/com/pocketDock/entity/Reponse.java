package pocketDock.com.pocketDock.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRep;
    private String ContenuRep;
    private Date dateRep;

    @JsonIgnore
    @ManyToOne
    Reclamation reclamations;

    @ManyToOne
    private OurUsers users;
}
