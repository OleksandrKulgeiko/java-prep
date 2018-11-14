package com.kulgeiko.drools.service;


import com.kulgeiko.drools.DroolsBeanFactory;
import com.kulgeiko.drools.model.Applicant;
import com.kulgeiko.drools.model.SuggestedRole;
import org.kie.api.runtime.KieSession;

import java.io.IOException;

public class ApplicantService {

    // The rules are fired by opening a KieSession bean – which can be retrieved from KieContainer
    KieSession kieSession = new DroolsBeanFactory().getKieSession();

    public SuggestedRole suggestARoleForApplicant(Applicant applicant, SuggestedRole suggestedRole) throws IOException {

        kieSession.insert(applicant);
        kieSession.setGlobal("suggestedRole",suggestedRole);
        kieSession.fireAllRules();
        System.out.println(suggestedRole.getRole());
        return suggestedRole;
    }
}
