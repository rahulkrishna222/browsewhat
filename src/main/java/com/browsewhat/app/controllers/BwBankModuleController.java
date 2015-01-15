package com.browsewhat.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.browsewhat.app.db.entities.BwBankBranch;
import com.browsewhat.app.db.entities.BwBankInfo;
import com.browsewhat.app.db.service.BankService;
import com.browsewhat.app.utils.BWLogger;
import com.browsewhat.app.utils.BankReferenceLookupGenerator;
import com.browsewhat.app.utils.BankSearchResultHtmlGenerator;

@Controller
@RequestMapping(value = "bank")
public class BwBankModuleController {
    @Autowired
    private BankService bankService;

    @RequestMapping(method = RequestMethod.GET)
    public String loadBankPage() {
        return "bank-service";
    }

    @RequestMapping(value = "/loadBankDB", method = RequestMethod.GET)
    public String loadBanksDatabase(@RequestParam("path") String path) {
        // new BwBankInfoReader().startReadingBankInfo(path, bankService);
        return "bank-service";
    }

    @RequestMapping(value = "search/name.html", method = RequestMethod.GET)
    public ResponseEntity<String> loadFindByBankName(@RequestParam("name") String name) {
        List<BwBankInfo> banks = bankService.findByBankName(name);
        return new ResponseEntity<String>(BankSearchResultHtmlGenerator.getHtmlForSearchBankByName(banks), HttpStatus.OK);
    }

    @RequestMapping(value = "view/name/{bankId}", method = RequestMethod.GET)
    public String loadBankViewForBankName(@PathVariable("bankId") String bankId, Model model) {
        if (bankId != null) {
            BWLogger.info("Find Bank request reached with ID : " + bankId);
        } else {
            return "error";
        }
        try {
            Integer originalBankId = BankReferenceLookupGenerator.reverseBankRefKey(bankId);
            model.addAttribute("BankId", bankId);
            BwBankInfo bankInfo = bankService.find(originalBankId);
            if (bankInfo != null) {
                model.addAttribute("bankName", bankInfo.getBankName());
                if (bankInfo.getBwBankBranches() != null) {
                    model.addAttribute("bankBbranchSize", bankInfo.getBwBankBranches().size());
                    model.addAttribute("Branches", BankSearchResultHtmlGenerator.createBankSearchResultForHtmlPage(bankInfo.getBwBankBranches()));
                }
            } else {
                return "bank-service";
            }

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e1) {
            BWLogger.error("Invalid Bankname ID", e1);
            return "error";
        }
        return "bank-search-result";

    }

    @RequestMapping(value = "search/filter/{bankId}", method = RequestMethod.POST)
    public ResponseEntity<String> searchBank(@PathVariable("bankId") String bankId, @RequestParam("branchName") String branchName, @RequestParam("state") String state,
            @RequestParam("district")  String district, @RequestParam("ifsc")  String ifsc) {
        // TODO Validate input

        List<BwBankBranch> branches = bankService.searchBranch(BankReferenceLookupGenerator.reverseBankRefKey(bankId), branchName, district, state, ifsc, null);
        
        //model.addAttribute("BankId", bankId);

        if (branches != null) {
            return new ResponseEntity<String>(BankSearchResultHtmlGenerator.createBankSearchResultForHtmlPage(branches, "TD"), HttpStatus.OK);
          
        } else {
            return new ResponseEntity<String>("<TR><TD> No Records found</TD></TR>", HttpStatus.NOT_FOUND);
        }
    }

    public void findBankIFSC(Integer bankId, Integer countryId, String bankName, Integer branch) {

    }

    public BankService getBankService() {
        return bankService;
    }

    public void setBankService(BankService bankService) {
        this.bankService = bankService;
    }

}
