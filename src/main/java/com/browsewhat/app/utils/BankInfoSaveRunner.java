/**
 * 
 */
package com.browsewhat.app.utils;

import com.browsewhat.app.db.entities.BwBankInfo;

/**
 * @author krahul
 *
 */
public class BankInfoSaveRunner extends Thread {

    
    BwBankInfo bankToSave = null;

    @Override
    public void run() {
        System.out.println(bankToSave.getBankName());
        System.out.println(bankToSave.getBwBankBranches().size());
    }
    public BwBankInfo getBankToSave() {
        return bankToSave;
    }

    public void setBankToSave(BwBankInfo bankToSave) {
        this.bankToSave = bankToSave;
    }

    

}
