package ir.ac.btcprice.dto;

public class PriceResponse {
    private Bitcoin bitcoin;

    public Bitcoin getBitcoin() {
        return bitcoin;
    }

    public PriceResponse setBitcoin(Bitcoin bitcoin) {
        this.bitcoin = bitcoin;
        return this;
    }

    public static class Bitcoin {
        private int usd;

        public int getUsd() {
            return usd;
        }

        public Bitcoin setUsd(int usd) {
            this.usd = usd;
            return this;
        }
    }
}
