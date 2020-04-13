package core;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountingSystem {
    private List<Invoice> salesInvoices = new ArrayList<>();
    private List<Invoice> purchasesInvoices = new ArrayList<>();

    public void addSalesInvoice(Invoice invoice) {
        salesInvoices.add(invoice);
    }

    public void addPurchaseInvoice(Invoice invoice) {
        purchasesInvoices.add(invoice);
    }

    public BigDecimal yearProfit(int rok) {

        return null;
    }

    public BigDecimal yearProfitWithVat(int rok) {

        return null;
    }

    public BigDecimal quarterProfit(int rok, int kwartal) {

        return null;
    }

    public BigDecimal monthlyProfit(int rok, int kwartal, int miesiac) {

        return null;
    }

    public BigDecimal overallProfit() {

        return null;
    }

    public void importInvoices(File file) {
        //plik moze miec zle dane, rzucic wyjatek

    }
}
