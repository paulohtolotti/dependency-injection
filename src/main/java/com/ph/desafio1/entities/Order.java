package com.ph.desafio1.entities;

import com.ph.desafio1.exceptions.DomainException;

public class Order {
    private String code;
    private Double basic;
    private Double discount;


    public Order(String code, Double basic, Double discount) {

        if(basic <= 0) throw new DomainException("Basic price invalid.");
        if(discount < 0) throw new DomainException("Invalid discount value.");

        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
