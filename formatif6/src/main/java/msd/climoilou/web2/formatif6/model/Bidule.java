package msd.climoilou.web2.formatif6.model;

import jakarta.persistence.Access;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Bidule {

    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    public Bidule(String nom) {
        this.nom = nom;
    }
}
