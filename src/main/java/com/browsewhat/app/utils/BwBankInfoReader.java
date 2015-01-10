/**
 * 
 */
package com.browsewhat.app.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.browsewhat.app.db.entities.BwBankBranch;
import com.browsewhat.app.db.entities.BwBankInfo;
import com.browsewhat.app.db.service.BankService;

/**
 * @author krahul
 *
 */
public class BwBankInfoReader {

    private BankService bankService;
    
    public void startReadingBankInfo(String path, BankService bankService) {
        this.bankService = bankService;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            List<BwBankInfo> banks = new ArrayList<BwBankInfo>(30000 * workbook.getNumberOfSheets());
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                HSSFSheet sheet = workbook.getSheetAt(i);
                processSheet(sheet);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return;
    }

    private void processSheet(HSSFSheet sheet) {
        //List<BwBankInfo> banks = new ArrayList<BwBankInfo>(sheet.getPhysicalNumberOfRows());

        BwBankInfo bank = new BwBankInfo();
        String bankName = null;
        String ifsc = null;
        System.out.println("Sheet Name : "+ sheet.getSheetName());
        System.out.println("Rows available in Sheet : " + sheet.getPhysicalNumberOfRows());
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            HSSFRow row = sheet.getRow(i);
           
            // BANK IFSC MICR CODE BRANCH ADDRESS CONTACT CITY DISTRICT STATE
            bankName = row.getCell(0).getStringCellValue();
            if (i == 1) {
                bank.setBankName(bankName);
            }
            
            if (!bank.getBankName().equalsIgnoreCase(bankName) && ifsc.substring(0, 4).equalsIgnoreCase(row.getCell(1).getStringCellValue().substring(0, 4))) {
                System.out.println(">>>>> Bank Name : "+ bank.getBankName() + "Branch Count : "+ bank.getBwBankBranches().size());
                bankService.insertBankInfo(bank);
               /* BankInfoSaveRunner runner = new BankInfoSaveRunner();
                runner.setBankToSave(bank);
                runner.start();*/
                
                bank = new BwBankInfo();
                bank.setBankName(bankName);
            }
            BwBankBranch branch = new BwBankBranch();
            row.getCell(1).setCellType(1);
            row.getCell(2).setCellType(1);
            row.getCell(3).setCellType(1);
            row.getCell(4).setCellType(1);
            row.getCell(5).setCellType(1);
            row.getCell(6).setCellType(1);
            row.getCell(7).setCellType(1);
            row.getCell(8).setCellType(1);
            
            
            branch.setIfsc(row.getCell(1).getStringCellValue());
            branch.setMicr(row.getCell(2).getStringCellValue());
            if (branch.getMicr() != null && branch.getMicr().equalsIgnoreCase("NA")) {
                branch.setMicr(null);
            }
            branch.setBranch(row.getCell(3).getStringCellValue());
            branch.setAddress(row.getCell(4).getStringCellValue());
            
            branch.setContact(row.getCell(5).getStringCellValue());
            branch.setCity(row.getCell(6).getStringCellValue());
            branch.setDistrict(row.getCell(7).getStringCellValue());
            branch.setState(row.getCell(8).getStringCellValue());
            branch.setBwBankInfo(bank);
            // branch.setIfsc(row.getCell(9).getStringCellValue());
            //System.out.println(branch);
            ifsc = branch.getIfsc();
            bank.getBwBankBranches().add(branch);
        }
        bankService.insertBankInfo(bank);
    }
}
