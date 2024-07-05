package model;

import java.util.ArrayList;
import java.util.List;

public class Agency {
    private Long id;
    private String name;
    private String address;
    private List<House>houses=new ArrayList<>();
    private List<Customer>customers=new ArrayList<>();

    public Agency(Long id, String name, String address, List<House> houses, List<Customer> customers) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.houses = houses;
        this.customers = customers;
    }

    public Agency(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Agency() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "\nAgency{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", houses=" + houses +
                ", customers=" + customers +
                '}';
    }
}
