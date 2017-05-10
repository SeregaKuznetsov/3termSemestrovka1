package model;

import javax.persistence.*;

/**
 * Created by admin on 26.04.2017.
 */
@Entity
@Table(name = "stock")
public class Stock {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String city;

    private String address;

    public Stock() {
    }

    public Stock(String city, String address) {
        this.city = city;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
