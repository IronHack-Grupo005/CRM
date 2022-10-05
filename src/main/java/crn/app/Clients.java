package crn.app;

public class Clients {

    private int id;
    private int employeesNumber;
    private String city;
    private String country;

    public Clients(int id, int employeesNumber, String city, String country) {

        this.id = id;
        this.employeesNumber = employeesNumber;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


//contactList -  List  de  contacts
   // opportunityList - List de oportunity
}
