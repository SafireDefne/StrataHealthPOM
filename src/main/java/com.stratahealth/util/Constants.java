package com.stratahealth.util;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static final String PAGE_TITLE = "Strata Health Solutions Inc. - Matching the right patients, " +
            "to the right, resources, at the right time.";

    public static final String CONTACT_PAGE_TITLE = "Contact - Strata Health Solutions Inc.";
    public static final String CONTACT_PAGE_NAME = "Contact Strata Health";
    public static final String COUNTRY = "Canada";
    public static final String FAIL_MESSAGE= "reCaptcha verification failed, please try again.";
    public static final String OUR_CUSTOMERS_PAGE_TITLE = "Our Customers - Strata Health Solutions Inc.";
    public static final String OUR_CUSTOMERS_PAGE_NAME = "Our Customers";
    public static final String COMPANY_PAGE_TITLE = "The Company - Strata Health Solutions Inc.";
    public static final String COMPANY_PAGE_NAME = "The Company";
    public static final String ABOUT_NEWS_PAGE_TITLE = "Posts - Strata Health Solutions Inc.";
    public static final String ABOUT_NEWS_PAGE_NAME = "News";
    public static final String PATIENT_CHOICE_PAGE_NAME = "Patient Choice";
    public static final String PATIENT_CHOICE_PAGE_TITLE = "Patient Choice - Strata Health Solutions Inc.";
    public static final String SILOED_SYSTEMS_PAGE_NAME = "Siloed Systems";
    public static final String SILOED_SYSTEMS_PAGE_TITLE = "Siloed Systems - Strata Health Solutions Inc.";



    public static List<String> actualOurSolutionsDropDownList() {
        List<String> list = new ArrayList<>();
        list.add("Integrate");
        list.add("Choose");
        list.add("Sign");
        list.add("Match");
        list.add("Transition");
        list.add("Communicate");
        list.add("Waitlist/Capacity");
        list.add("Analyze");
        return list;
    }

    public static List<String> actualOurImpactDropdownList() {
        List<String> list = new ArrayList<>();
        list.add("Avoidable Delays and Length of Stay");
        list.add("Readmissions");
        list.add("Patient Choice");
        list.add("Provider Network Management");
        list.add("Siloed Systems");
        list.add("Transitions of Care");
        return list;
    }

    public static List<String> actualAboutDropdownList() {
        List<String> list = new ArrayList<>();
        list.add("Company");
        list.add("Leadership");
        list.add("Security");
        list.add("News");
        list.add("Case Studies");
        list.add("Events");
        list.add("Careers");
        return list;
    }



}
