package msd.climoilou.web2.formatif6.repository;

import msd.climoilou.web2.formatif6.model.Bidule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface BiduleRepository extends JpaRepository<Bidule, Long> {
    Collection<Bidule> findByNom(String nom);

}
