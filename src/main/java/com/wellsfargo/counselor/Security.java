package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private Long securityID;

    @Column(name = "security_name", nullable = false)
    private String name;

    @Column(name = "security_category", nullable = false)
    private String category;

    @Column(name = "security_purchase_date", nullable = false)
    private Date purchase_date;

    @Column(name = "security_purchase_price", nullable = false)
    private String purchase_price;
    
    @Column(name = "security_quantity", nullable = false)
    private int quantity;

    @ManyToOne()
    @JoinColumn(name = "port_id", nullable = false)
    private Portfolio portfolio;

    protected Security() {

    }

    public Security(String name, String category, Date purchase_date, String purchase_price, int quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public Long getSecurityID() {
        return securityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchaseDate() {
        return purchase_date;
    }

    public void setPurchaseDate(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public String getPurchasePrice() {
        return purchase_price;
    }

    public void setPurchasePrice(String purchase_price) {
        this.purchase_price = purchase_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}