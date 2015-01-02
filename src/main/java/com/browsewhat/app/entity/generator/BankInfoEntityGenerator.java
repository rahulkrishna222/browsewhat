/**
 * 
 */
package com.browsewhat.app.entity.generator;

import java.util.ArrayList;
import java.util.List;

import com.browsewhat.app.db.entities.BwBankInfo;
import com.browsewhat.app.db.entities.BwContactus;
import com.browsewhat.app.models.bank.BankInfo;
import com.browsewhat.app.models.form.ContactUs;

/**
 * @author krahul
 *
 */
public class BankInfoEntityGenerator implements EntityGenerator<BwBankInfo> {

    @Override
    public BwBankInfo convertServiceObjectToEntity(Object obj) {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object convertEntityToServiceObject(BwBankInfo obj) {

        return null;
    }

    /**
     * Returns name and id of the bank only from {@link BwBankInfo}
     * 
     * @param bwBankInfos
     * @return
     */
    public static List<BankInfo> getBankNames(List<BwBankInfo> bwBankInfos) {

        if (bwBankInfos != null && !bwBankInfos.isEmpty()) {
            List<BankInfo> bankInfoList = new ArrayList<BankInfo>(bwBankInfos.size() + 2);
            for (BwBankInfo bwBank : bwBankInfos) {
                bankInfoList.add(new BankInfo(bwBank.getId(), bwBank.getBankName()));
            }
            return bankInfoList;
        } else {
            return new ArrayList<BankInfo>(0);
        }
    }
}
