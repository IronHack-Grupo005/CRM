package crn.app.classes;

import crn.app.enums.Industry;
import crn.app.enums.Product;
import crn.app.enums.Status;

public class Opportunity extends Lead {

    private static long id = 0;
    Product industry;
    private int number;
    Contact decisionMaker;
    Status status;

    Lead lead;
    // TODO: Esto va fuara ?

    public Opportunity(String name, String phoneNumber, String email, String companyName, Product industry, Contact decisionMaker, Status status, Lead lead) {
        super(name, phoneNumber, email, companyName);
        this.industry = industry;
        this.decisionMaker = decisionMaker;
        this.status = status;
        this.lead = lead;
        this.id++;
    }

    public static long getId() {
        return id;
    }

    public Product getIndustry() {
        return industry;
    }

    public void setIndustry(Product industry) {
        this.industry = industry;
    }

    public Contact getDecisionMaker() {
        return decisionMaker;
    }

    public void setDecisionMaker(Contact decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Lead getLead() {
        return lead;
    }

    public void setLead(Lead lead) {
        this.lead = lead;
    }
}
