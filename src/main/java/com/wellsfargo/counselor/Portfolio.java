package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private Long portfolioID;

    @OneToOne()
    @JoinColumn(name="cl_id", nullable = false, unique=true)
    private Client client;
    
    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;


    protected Portfolio() {
        this.securities = new ArrayList<>();
    }

    public Portfolio(Client client) {
        this.client = client;
        this.securities = new ArrayList<>();
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

}