package crn.app.classes;

import javax.swing.text.Style;

public class Lead {

    private static long id = 0 ;
    private String name;
    private String phoneNumber;
    private String email;
    private String companyName;
    private final int identificador;

    public Lead(String name, String phoneNumber, String email, String companyName) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.setCompanyName(companyName);
        this.id ++ ;
        this.identificador = (int)this.id;
    }

    @Override
    protected Object clone() {
        return this;
        //return super.clone();
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
