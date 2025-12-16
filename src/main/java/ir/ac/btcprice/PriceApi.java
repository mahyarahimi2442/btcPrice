package ir.ac.btcprice;

import ir.ac.btcprice.dto.PriceResponse;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface PriceApi {
    @GetExchange(url = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=usd")
    PriceResponse getPrice();
}
