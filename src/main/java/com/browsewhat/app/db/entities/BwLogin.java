package com.browsewhat.app.db.entities;

// Generated Jan 15, 2015 1:30:53 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * BwLogin generated by hbm2java
 */
@Entity
@Table(name = "bw_login", catalog = "browsewhat", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class BwLogin implements java.io.Serializable {

    private Integer             id;
    private BwUser              bwUser;
    private String              password;
    private Date                expires;
    private Set<BwLoginHistory> bwLoginHistories = new HashSet<BwLoginHistory>(0);

    public BwLogin() {
    }

    public BwLogin(BwUser bwUser, String password, Date expires) {
        this.bwUser = bwUser;
        this.password = password;
        this.expires = expires;
    }

    public BwLogin(BwUser bwUser, String password, Date expires, Set<BwLoginHistory> bwLoginHistories) {
        this.bwUser = bwUser;
        this.password = password;
        this.expires = expires;
        this.bwLoginHistories = bwLoginHistories;
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
    @JoinColumn(name = "username", unique = true, nullable = false)
    public BwUser getBwUser() {
        return this.bwUser;
    }

    public void setBwUser(BwUser bwUser) {
        this.bwUser = bwUser;
    }

    @Column(name = "password", nullable = false, length = 250)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expires", nullable = false, length = 19)
    public Date getExpires() {
        return this.expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bwLogin")
    public Set<BwLoginHistory> getBwLoginHistories() {
        return this.bwLoginHistories;
    }

    public void setBwLoginHistories(Set<BwLoginHistory> bwLoginHistories) {
        this.bwLoginHistories = bwLoginHistories;
    }

}
