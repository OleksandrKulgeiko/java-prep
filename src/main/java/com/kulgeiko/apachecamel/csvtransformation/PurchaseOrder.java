package com.kulgeiko.apachecamel.csvtransformation;

import java.math.BigDecimal;

import java.math.BigDecimal;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

/**
 * Created by akulgeiko on 9/4/2018.
 */
@CsvRecord(separator = ",", crlf = "UNIX")
public class PurchaseOrder {

    @DataField(pos = 1)
    private String name;

    @DataField(pos = 2, precision = 2)
    private BigDecimal price;

    @DataField(pos = 3)
    private int amount;

    public PurchaseOrder(String name, BigDecimal price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public PurchaseOrder(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
