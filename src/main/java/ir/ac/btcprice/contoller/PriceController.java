package ir.ac.btcprice.contoller;

import ir.ac.btcprice.PriceApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/price")
public class PriceController {

    private final PriceApi priceApi;

    public PriceController(PriceApi priceApi) {
        this.priceApi = priceApi;
    }

    @GetMapping
    public int getPrice(){
        return priceApi.getPrice().getBitcoin().getUsd();
    }
}
