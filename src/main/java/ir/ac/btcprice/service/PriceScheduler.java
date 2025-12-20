package ir.ac.btcprice.service;

import ir.ac.btcprice.PriceApi;
import ir.ac.btcprice.entity.BitcoinPrice;
import ir.ac.btcprice.repository.BitcoinPriceRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PriceScheduler {

    private final PriceApi priceApi;
    private final BitcoinPriceRepository repository;

    public PriceScheduler(PriceApi priceApi,
                          BitcoinPriceRepository repository) {
        this.priceApi = priceApi;
        this.repository = repository;
    }

    @Scheduled(cron = "0 * * * * *")
    public void saveBitcoinPrice() {
        try {
            long price =
                    priceApi.getPrice()
                            .getBitcoin().getUsd();

            BitcoinPrice btcPrice = new BitcoinPrice();
            btcPrice.setPrice(price);
            btcPrice.setCreatedAt(LocalDateTime.now());

            repository.save(btcPrice);

            System.out.println("BTC price saved: " + price);

        } catch (Exception e) {

            System.err.println("Error");
            e.printStackTrace();
        }
    }
}

