/**
 * 
 */
package com.browsewhat.app.db.service;

import java.util.List;

import com.browsewhat.app.db.entities.BwBankInfo;
import com.browsewhat.app.db.service.template.DBServiceTemplate;

/**
 * @author krahul
 *
 */
public interface BankService extends DBServiceTemplate<BwBankInfo> {

    public List<BwBankInfo> findByBankName(String bankName);

    public List<BwBankInfo> findByBranch(String branchName);

    public List<BwBankInfo> findByCity(String city);

    public List<BwBankInfo> findByDistrict(String district);

    public List<BwBankInfo> findByState(String state);

    public List<BwBankInfo> findByAddress(String address);

    public List<BwBankInfo> findByIFSC(String ifsc);

    public List<BwBankInfo> findByMICR(String micr);

}
