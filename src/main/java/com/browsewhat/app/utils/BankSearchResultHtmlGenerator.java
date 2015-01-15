package com.browsewhat.app.utils;

import java.util.ArrayList;
import java.util.Collection;
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
            builder.append("<p onclick=\"location.href='bank/view/name/");
            builder.append(BankReferenceLookupGenerator.createBankRefKey(bank.getId()));
            builder.append("';\">");
            builder.append(bank.getBankName());
            builder.append("</p>");
            builder.append(HTML_ANCHOR_END);
            builder.append(HTML_LI_END);
        }
        builder.append(HTML_UL_END);
        return builder.toString();
    }

    public static List<Map<String, String>> createBankSearchResultForHtmlPage(Collection<BwBankBranch> branchesToAdded) {
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

    private final static String TR_OPEN  = "<tr>";
    private final static String TR_CLOSE = "</tr>";

    private final static String TD_OPEN  = "<td>";
    private final static String TD_CLOSE = "</td>";

    public static String createBankSearchResultForHtmlPage(Collection<BwBankBranch> branchesToAdded, String htmlElement) {
        List<Map<String, String>> branches = new ArrayList<Map<String, String>>(10);
        int counter = 1;
        StringBuilder builder = new StringBuilder(30 * branchesToAdded.size());
        for (BwBankBranch branch : branchesToAdded) {
            builder.append(TR_OPEN);
            if (counter == 10) {
                break;
            }
            builder.append(TD_OPEN);
            builder.append(branch.getBranch());
            builder.append(TD_CLOSE);

            builder.append(TD_OPEN);
            builder.append(branch.getCity());
            builder.append(TD_CLOSE);

            builder.append(TD_OPEN);
            builder.append(branch.getDistrict());
            builder.append(TD_CLOSE);

            builder.append(TD_OPEN);
            builder.append(branch.getState());
            builder.append(TD_CLOSE);

            builder.append(TD_OPEN);
            builder.append(branch.getIfsc());
            builder.append(TD_CLOSE);

            ++counter;
            builder.append(TR_OPEN);
        }
        builder.append(TR_OPEN);
        builder.append(TD_OPEN);
        builder.append("Total results " + branchesToAdded.size() + " showing only " + --counter);
        builder.append(TD_CLOSE);
        return builder.toString();
    }
}
