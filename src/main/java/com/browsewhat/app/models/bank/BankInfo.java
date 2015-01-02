package com.browsewhat.app.models.bank;

import java.io.Serializable;

public class BankInfo implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 3848331499271863949L;

    private Integer           bankId;
    private String            bankName;
    private String            address;
    private String            district;
    private String            city;
    private String            state;
    private String            country;

    private String            ifsc;
    private String            micr;

    public BankInfo() {

    }

    /**
     * Minimal Constructor
     * 
     * @param bankId
     * @param bankName
     */
    public BankInfo(Integer bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
    }

    /**
     * @param bankId
     * @param bankName
     * @param address
     * @param district
     * @param city
     * @param state
     * @param country
     * @param ifsc
     * @param micr
     */
    public BankInfo(Integer bankId, String bankName, String address, String district, String city, String state, String country, String ifsc,
            String micr) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.address = address;
        this.district = district;
        this.city = city;
        this.state = state;
        this.country = country;
        this.ifsc = ifsc;
        this.micr = micr;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getMicr() {
        return micr;
    }

    public void setMicr(String micr) {
        this.micr = micr;
    }

}
