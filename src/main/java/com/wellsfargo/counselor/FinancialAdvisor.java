package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue()
    private Long ad_ID;

    @Column(name = "ad_first_name", nullable = false)
    private String firstName;

    @Column(name = "ad_last_name", nullable = false)
    private String lastName;

    @Column(name = "ad_email", nullable = false)
    private String email;

    @Column(name = "ad_phone", nullable = false)
    private String phone;

    @OneToMany(mappedBy = "financialAdvisor")
    private List<Client> clients;

    protected FinancialAdvisor() {

    }

    public FinancialAdvisor(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.clients = new ArrayList<>();
    }

    public Long getAdId() {
        return ad_ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
