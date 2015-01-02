package com.browsewhat.app.modules.bank.ifsc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.browsewhat.app.db.entities.BwBankInfo;
import com.browsewhat.app.db.service.BankService;
import com.browsewhat.app.entity.generator.BankInfoEntityGenerator;
import com.browsewhat.app.entity.generator.EntityGenerator;
import com.browsewhat.app.factory.DBEntityGeneratorFactory;
import com.browsewhat.app.models.bank.BankInfo;
import com.browsewhat.app.types.EntityType;
import com.browsewhat.app.utils.BWLogger;

public class BankDataProcessor {
    private final EntityGenerator<BwBankInfo> entityGenerator = DBEntityGeneratorFactory.getEntityGenerator(EntityType.Bank);

    @Autowired
    private BankService                       bankService;

    public void getAllBankNames() {
        BWLogger.trace("Requested for All banknames");
        List<BwBankInfo> banks = bankService.findAll();

        // transform Bank Entity to BankDTO

    }

    public List<BankInfo> getAllBankNames(int limit) {
        BWLogger.trace("Requested for All banknames");
        // Fetch BankName and Id from database
        List<BwBankInfo> banks = bankService.findAll();

        return BankInfoEntityGenerator.getBankNames(banks);
    }

    public void getBankNamesStartsWith(String startsWith, int offset, int limit) {

    }

    public void getBankNameByState(String state, int offset, int limit) {

    }

    public void getBankNameByDistrict(String district, int offset, int limit) {

    }

    public void getBankNameByCity(String city, int offset, int limit) {

    }

    public void getBankNameByAnyMatches(String bankName, String city, String district, String state) {

    }

    public void getBankByIFSC(String ifsc) {

    }

    public void getBankByMICR(String micr) {

    }

    /**
     * Setters and Getters
     */
    public BankService getBankService() {
        return bankService;
    }

    public void setBankService(BankService bankService) {
        this.bankService = bankService;
    }

}
