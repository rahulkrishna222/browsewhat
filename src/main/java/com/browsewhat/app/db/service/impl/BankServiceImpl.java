package com.browsewhat.app.db.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.browsewhat.app.db.dao.BankDAO;
import com.browsewhat.app.db.entities.BwBankInfo;
import com.browsewhat.app.db.service.BankService;

public class BankServiceImpl implements BankService {

    @Autowired
    private BankDAO bankDAO;

    @Override
    public List<BwBankInfo> findAll() {

        return bankDAO.findAll();
    }

    @Override
    public BwBankInfo insert(BwBankInfo t) {

        return bankDAO.insert(t);
    }

    @Override
    public void delete(BwBankInfo id) {
        bankDAO.delete(id);
    }

    @Override
    public BwBankInfo find(Object id) {

        return bankDAO.find(id);
    }

    @Override
    public BwBankInfo update(BwBankInfo t) {

        return bankDAO.update(t);
    }

    public void setBankDAO(BankDAO bankDAO) {
        this.bankDAO = bankDAO;
    }

    @Override
    public List<BwBankInfo> findByBankName(String bankName) {

        return bankDAO.findByBankName(bankName);
    }

    @Override
    public List<BwBankInfo> findByCity(String city) {

        return bankDAO.findByCity(city);
    }

    @Override
    public List<BwBankInfo> findByDistrict(String district) {

        return bankDAO.findByDistrict(district);
    }

    @Override
    public List<BwBankInfo> findByState(String state) {

        return bankDAO.findByState(state);
    }

    @Override
    public List<BwBankInfo> findByAddress(String address) {

        return bankDAO.findByAddress(address);
    }

    @Override
    public List<BwBankInfo> findByIFSC(String ifsc) {

        return bankDAO.findByIFSC(ifsc);
    }

    @Override
    public List<BwBankInfo> findByMICR(String micr) {

        return bankDAO.findByMICR(micr);
    }

    @Override
    public List<BwBankInfo> findByBranch(String branchName) {

        return bankDAO.findByBranch(branchName);
    }

    public BankDAO getBankDAO() {
        return bankDAO;
    }

    @Override
    public void insertBankInfo(BwBankInfo bank) {
        bankDAO.insertBankInfo(bank);

    }

    @Override
    public void insertBankInfoBatch(List<BwBankInfo> banks) {
        bankDAO.insertBankInfoBatch(banks);

    }

    @Override
    public List<BwBankInfo> searchBranch(Integer bankId, String branchName, String district, String state, String ifsc, String micr) {
        // TODO Auto-generated method stub
        return bankDAO.searchBranch(bankId, branchName, district, state, ifsc, micr);
    }
}
