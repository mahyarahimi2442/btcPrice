package ir.ac.btcprice.repository;

import ir.ac.btcprice.entity.BitcoinPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BitcoinPriceRepository extends JpaRepository<BitcoinPrice, Long> {
}

