package com.browsewhat.app.db.entities;

// Generated Jan 15, 2015 1:30:53 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BwCountries generated by hbm2java
 */
@Entity
@Table(name = "bw_countries", catalog = "browsewhat")
public class BwCountries implements java.io.Serializable {

    private Integer            id;
    private String             name;
    private String             lat;
    private String             longi;
    private Set<BwUserAddress> bwUserAddresses = new HashSet<BwUserAddress>(0);

    public BwCountries() {
    }

    public BwCountries(String name) {
        this.name = name;
    }

    public BwCountries(String name, String lat, String longi, Set<BwUserAddress> bwUserAddresses) {
        this.name = name;
        this.lat = lat;
        this.longi = longi;
        this.bwUserAddresses = bwUserAddresses;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "lat", length = 45)
    public String getLat() {
        return this.lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Column(name = "longi", length = 45)
    public String getLongi() {
        return this.longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bwCountries")
    public Set<BwUserAddress> getBwUserAddresses() {
        return this.bwUserAddresses;
    }

    public void setBwUserAddresses(Set<BwUserAddress> bwUserAddresses) {
        this.bwUserAddresses = bwUserAddresses;
    }

}
