package crn.app.classes;

import crn.app.enums.Industry;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private static long id ;
    Industry industry;

    private int employeeCount;
    private String city;
    private String country;

    List<Contact> contactos = new ArrayList<>();
    List<Opportunity> oportunidades = new ArrayList<>();

}
