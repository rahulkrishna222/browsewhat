package com.browsewhat.app.db.entities;

// Generated Dec 31, 2014 1:31:02 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BwContactus generated by hbm2java
 */
@Entity
@Table(name = "bw_contactus", catalog = "browsewhat")
public class BwContactus implements java.io.Serializable {

    private Integer id;
    private String  email;
    private String  subject;
    private String  questions;
    private char    status;

    public BwContactus() {
    }

    public BwContactus(String email, String questions, char status) {
        this.email = email;
        this.questions = questions;
        this.status = status;
    }

    public BwContactus(String email, String subject, String questions, char status) {
        this.email = email;
        this.subject = subject;
        this.questions = questions;
        this.status = status;
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

    @Column(name = "email", nullable = false, length = 150)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "subject", length = 100)
    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Column(name = "questions", nullable = false, length = 1000)
    public String getQuestions() {
        return this.questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    @Column(name = "status", nullable = false, length = 1)
    public char getStatus() {
        return this.status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

}
