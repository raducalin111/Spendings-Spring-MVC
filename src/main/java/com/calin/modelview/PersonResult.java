package com.calin.modelview;

import java.math.BigDecimal;

/**
 * Created by Calin on 6/26/2016.
 */
public class PersonResult {

    private String name;
    private BigDecimal amount;

    public PersonResult(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    public PersonResult() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
