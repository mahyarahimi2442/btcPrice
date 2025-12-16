package ir.ac.btcprice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.service.registry.ImportHttpServices;

@SpringBootApplication
@ImportHttpServices(PriceApi.class)
public class BtcPriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BtcPriceApplication.class, args);
    }

}
