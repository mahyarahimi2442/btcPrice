package ir.ac.btcprice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.service.registry.ImportHttpServices;

@SpringBootApplication
@ImportHttpServices(PriceApi.class)
@EnableScheduling
public class BtcPriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BtcPriceApplication.class, args);
    }

}
