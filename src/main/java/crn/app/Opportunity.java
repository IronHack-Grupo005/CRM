package crn.app;

public class Opportunity extends Contact{

    private String product;
    private int quantity;
    private boolean status; //esto se refiere al enum, tiene que ser boolean?

    public Opportunity(int id, String name, String company, String email, int phoneNumber, String product, int quantity, boolean status) {
        super(id, name, company, email, phoneNumber);
        this.product = product;
        this.quantity = quantity;
        this.status = status;
    }


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
