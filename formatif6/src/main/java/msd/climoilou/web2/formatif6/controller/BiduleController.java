package msd.climoilou.web2.formatif6.controller;

import lombok.Getter;
import msd.climoilou.web2.formatif6.model.Bidule;
import msd.climoilou.web2.formatif6.repository.BiduleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@CrossOrigin(origins = {"http://localhost:5173","http://localhost:5174","http://localhost:5175"})
@RestController
public class BiduleController {

    @Autowired
    private BiduleRepository biduleRepository;

    private Logger logger = LoggerFactory.getLogger(BiduleController.class);

    @GetMapping("/bidules")
    public Collection<Bidule> getAllBidules() throws InterruptedException {
        logger.info("BiduleController getAllBidules");

        Thread.sleep(1000);

        return biduleRepository.findAll();
    }
}
