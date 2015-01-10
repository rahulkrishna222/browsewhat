/**
 * 
 */
package com.browsewhat.app.db.dao;

import java.util.List;

import com.browsewhat.app.db.dao.template.DAOTemplate;
import com.browsewhat.app.db.entities.BwBankInfo;

/**
 * @author krahul
 *
 */
public interface BankDAO extends DAOTemplate<BwBankInfo> {

    public List<BwBankInfo> findByBankName(String bankName);

    public List<BwBankInfo> findByBranch(String branchName);

    public List<BwBankInfo> findByCity(String city);

    public List<BwBankInfo> findByDistrict(String district);

    public List<BwBankInfo> findByState(String state);

    public List<BwBankInfo> findByAddress(String address);

    public List<BwBankInfo> findByIFSC(String ifsc);

    public List<BwBankInfo> findByMICR(String micr);

    public List<BwBankInfo> searchBranch(Integer bankId, String branchName, String district, String state, String ifsc, String micr);

    public void insertBankInfo(BwBankInfo bank);

    public void insertBankInfoBatch(List<BwBankInfo> banks);
}
