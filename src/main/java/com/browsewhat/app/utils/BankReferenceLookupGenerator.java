package com.browsewhat.app.utils;

public class BankReferenceLookupGenerator {

    private final static String BANK_REF_KEY_START = "BW-BNSK00";
    private final static String BANK_REF_KEY_END   = "BNEK0022";

    public static String createBankRefKey(Integer bankId) {
        return new StringBuffer(15).append(BANK_REF_KEY_START).append(bankId).append(BANK_REF_KEY_END).toString();
    }

    /**
     * @param refKey
     * @return
     */
    public static Integer reverseBankRefKey(String refKey) {
        return Integer.valueOf(refKey.substring(BANK_REF_KEY_START.length(), (refKey.length() - BANK_REF_KEY_END.length())));
    }
}
