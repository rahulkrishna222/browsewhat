/**
 * 
 */
package com.browsewhat.app.db.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.browsewhat.app.db.dao.BankDAO;
import com.browsewhat.app.db.entities.BwBankInfo;

/**
 * @author krahul
 *
 */
public class BankDAOImpl implements BankDAO {

    private final String   BANK_NAME     = "name";
    private final String   BANK_CITY     = "city";
    private final String   BANK_BRANCH   = "branch";
    private final String   BANK_DISTRICT = "district";
    private final String   BANK_ADDRESS  = "address";
    private final String   BANK_STATE    = "state";
    private final String   BANK_IFSC     = "ifsc";
    private final String   BANK_MICR     = "micr";

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * 
     */
    public BankDAOImpl() {
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.template.DBServiceTemplate#findAll()
     */
    @Override
    public List<BwBankInfo> findAll() {
        Session session = sessionFactory.openSession();
        Transaction txn = session.beginTransaction();
        txn.begin();

        Query query = session.createQuery("from BwBankInfo bank");
        List<BwBankInfo> bankInfos = query.list();

        txn.commit();
        session.close();
        
        return bankInfos;
    }

    private List<BwBankInfo> findByProperty(String propery, String value) {
        Session session = sessionFactory.openSession();
        Transaction txn = session.beginTransaction();

        StringBuilder queryString = new StringBuilder("from BwBankInfo as bank where bank.");
        queryString.append(propery);
        queryString.append("=:value");

        Query query = session.createQuery(queryString.toString());

        List result = query.list();

        return query.list();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.template.DBServiceTemplate#insert(java.lang.Object)
     */
    @Override
    public BwBankInfo insert(BwBankInfo t) {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.template.DBServiceTemplate#delete(java.lang.Object)
     */
    @Override
    public void delete(BwBankInfo id) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.template.DBServiceTemplate#find(java.lang.Object)
     */
    @Override
    public BwBankInfo find(Object id) {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.browsewhat.app.db.service.template.DBServiceTemplate#update(java.lang.Object)
     */
    @Override
    public BwBankInfo update(BwBankInfo t) {

        return null;
    }

    @Override
    public List<BwBankInfo> findByBankName(String bankName) {

        return findByProperty(BANK_NAME, bankName);
    }

    @Override
    public List<BwBankInfo> findByCity(String city) {

        return findByProperty(BANK_CITY, city);
    }

    @Override
    public List<BwBankInfo> findByDistrict(String district) {

        return findByProperty(BANK_DISTRICT, district);
    }

    @Override
    public List<BwBankInfo> findByState(String state) {

        return findByProperty(BANK_STATE, state);
    }

    @Override
    public List<BwBankInfo> findByAddress(String address) {

        return findByProperty(BANK_ADDRESS, address);
    }

    @Override
    public List<BwBankInfo> findByIFSC(String ifsc) {

        return findByProperty(BANK_IFSC, ifsc);
    }

    @Override
    public List<BwBankInfo> findByMICR(String micr) {

        return findByProperty(BANK_MICR, micr);
    }

    @Override
    public List<BwBankInfo> findByBranch(String branchName) {

        return findByProperty(BANK_BRANCH, branchName);
    }
}
