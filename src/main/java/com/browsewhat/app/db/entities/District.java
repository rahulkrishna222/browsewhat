package com.browsewhat.app.db.entities;

// Generated Jan 15, 2015 1:30:53 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * District generated by hbm2java
 */
@Entity
@Table(name = "district", catalog = "browsewhat")
public class District implements java.io.Serializable {

    private Integer id;
    private State   state;
    private String  name;
    private Integer geoLocation;

    public District() {
    }

    public District(State state, String name) {
        this.state = state;
        this.name = name;
    }

    public District(State state, String name, Integer geoLocation) {
        this.state = state;
        this.name = name;
        this.geoLocation = geoLocation;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state", nullable = false)
    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "geo_location")
    public Integer getGeoLocation() {
        return this.geoLocation;
    }

    public void setGeoLocation(Integer geoLocation) {
        this.geoLocation = geoLocation;
    }

}