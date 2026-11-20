package msd.climoilou.web2.formatif6;

import msd.climoilou.web2.formatif6.model.Bidule;
import msd.climoilou.web2.formatif6.repository.BiduleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class Formatif6Application implements CommandLineRunner {

    @Autowired
    private BiduleRepository biduleRepository;

    private Logger logger = LoggerFactory.getLogger(Formatif6Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Formatif6Application.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        logger.info("BiduleRepository size: {}", biduleRepository.findAll().size());

        //on ajoute un bidule à chaque nouveau lancement du backend
        biduleRepository.save(new Bidule("bidule"+ UUID.randomUUID()));

    }
}
