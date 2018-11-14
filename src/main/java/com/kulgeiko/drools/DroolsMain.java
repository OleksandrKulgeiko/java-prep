package com.kulgeiko.drools;

import com.kulgeiko.drools.model.Applicant;
import com.kulgeiko.drools.model.Country;
import com.kulgeiko.drools.model.SuggestedRole;
import com.kulgeiko.drools.service.ApplicantService;

public class DroolsMain {

    public static void main(String... args) throws Exception{

        // Object to evaluate
        Country country = new Country("Ukraine");
        Applicant applicant = new Applicant("David", 37, 1600000.0,11, country);

        // Output of evaluation
        SuggestedRole suggestedRole = new SuggestedRole();

        // Execution
        ApplicantService applicantService = new ApplicantService();
        applicantService.suggestARoleForApplicant(applicant, suggestedRole);

        System.out.println(suggestedRole.getRole());
    }

}
