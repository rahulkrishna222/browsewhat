package com.browsewhat.app.db.entities;

// Generated Jan 2, 2015 5:42:03 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BwLoginHistory generated by hbm2java
 */
@Entity
@Table(name = "bw_login_history", catalog = "browsewhat")
public class BwLoginHistory implements java.io.Serializable {

    private Integer id;
    private BwLogin bwLogin;
    private Date    accessedTime;
    private String  host;
    private String  remoteIp;

    public BwLoginHistory() {
    }

    public BwLoginHistory(BwLogin bwLogin, Date accessedTime, String host, String remoteIp) {
        this.bwLogin = bwLogin;
        this.accessedTime = accessedTime;
        this.host = host;
        this.remoteIp = remoteIp;
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
    @JoinColumn(name = "login_id", nullable = false)
    public BwLogin getBwLogin() {
        return this.bwLogin;
    }

    public void setBwLogin(BwLogin bwLogin) {
        this.bwLogin = bwLogin;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "accessed_time", nullable = false, length = 19)
    public Date getAccessedTime() {
        return this.accessedTime;
    }

    public void setAccessedTime(Date accessedTime) {
        this.accessedTime = accessedTime;
    }

    @Column(name = "host", nullable = false, length = 150)
    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Column(name = "remote_ip", nullable = false, length = 17)
    public String getRemoteIp() {
        return this.remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

}
