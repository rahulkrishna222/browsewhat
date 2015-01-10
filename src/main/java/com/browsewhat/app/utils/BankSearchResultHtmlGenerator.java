package com.browsewhat.app.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.browsewhat.app.db.entities.BwBankBranch;
import com.browsewhat.app.db.entities.BwBankInfo;

public class BankSearchResultHtmlGenerator {

    private final static String HTML_UL_OPEN     = "<ul>";
    private final static String HTML_UL_END      = "</ul>";
    private final static String HTML_LI_OPEN     = "<li>";
    private final static String HTML_LI_END      = "</li>";
    private final static String HTML_ANCHOR_OPEN = "<a>";
    private final static String HTML_ANCHOR_END  = "</a>";

    public static String getHtmlForSearchBankByName(List<BwBankInfo> banks) {

        StringBuilder builder = new StringBuilder(8 * banks.size() * 10);
        builder.append(HTML_UL_OPEN);
        for (BwBankInfo bank : banks) {
            builder.append(HTML_LI_OPEN);
            builder.append("<a src=\"bank/view/name/");
            builder.append(BankReferenceLookupGenerator.createBankRefKey(bank.getId()));
            builder.append("\">");
            builder.append(bank.getBankName());
            builder.append(HTML_ANCHOR_END);
            builder.append(HTML_LI_END);
        }
        builder.append(HTML_UL_END);
        return builder.toString();
    }

    public static List<Map<String, String>> createBankSearchResultForHtmlPage(Set<BwBankBranch> branchesToAdded) {
        List<Map<String, String>> branches = new ArrayList<Map<String, String>>(10);
        int counter = 1;
        for (BwBankBranch branch : branchesToAdded) {
            if (counter == 10) {
                break;
            }
            Map<String, String> branchMap = new HashMap<String, String>(5);
            branchMap.put("BranchName", branch.getBranch());
            branchMap.put("BranchCity", branch.getCity());
            branchMap.put("BranchDistrict", branch.getCity());
            branchMap.put("BranchState", branch.getState());
            branchMap.put("BranchIFSC", branch.getIfsc());

            branches.add(branchMap);
            ++counter;
        }
        return branches;
    }
}
