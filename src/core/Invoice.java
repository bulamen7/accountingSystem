package core;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {
    private BigDecimal priceNet;
    private int vat;
    private String description;
    private LocalDate date;

    public Invoice(BigDecimal priceNet, int vat, String description, LocalDate date) {
        this.priceNet = priceNet;
        this.vat = vat;
        this.description = description;
        this.date = date;
    }

    public BigDecimal getPriceNet() {
        return priceNet;
    }

    public void setPriceNet(BigDecimal priceNet) {
        this.priceNet = priceNet;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
