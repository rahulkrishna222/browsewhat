package com.browsewhat.app.db.entities;

// Generated Jan 2, 2015 5:42:03 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * BwBankInfo generated by hbm2java
 */
@Entity
@Table(name = "bw_bank_info", catalog = "browsewhat")
public class BwBankInfo implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7391341257729100325L;
    private Integer           id;
    private String            bankName;
    private Character         isActive;
    private Set<BwBankBranch> bwBankBranches = new HashSet<BwBankBranch>(0);

    public BwBankInfo() {
    }

    public BwBankInfo(String bankName) {
        this.bankName = bankName;
    }

    public BwBankInfo(String bankName, Character isActive, Set<BwBankBranch> bwBankBranches) {
        this.bankName = bankName;
        this.isActive = isActive;
        this.bwBankBranches = bwBankBranches;
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

    @Column(name = "bank_name", nullable = false, length = 150)
    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Column(name = "is_active", length = 1)
    public Character getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bwBankInfo", cascade=CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.EXTRA)
    public Set<BwBankBranch> getBwBankBranches() {
        return this.bwBankBranches;
    }

    public void setBwBankBranches(Set<BwBankBranch> bwBankBranches) {
        this.bwBankBranches = bwBankBranches;
    }

}
