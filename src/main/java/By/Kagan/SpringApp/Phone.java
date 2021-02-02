package By.Kagan.SpringApp;

public class Phone {
    private Function function;
    private String brand;
    private int charge;
    public Phone ()
    {

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getBrand() {
        return brand;
    }

    public int getCharge() {
        return charge;
    }
    public void setFunction(Function function)
    {
        this.function = function;
    }
    public void whatCharge()
    {
        System.out.println("Charge of this phone: " + getCharge() + "%");
    }
    public void whatBrand()
    {
        System.out.println("Brand of this phone is " + getBrand());
    }
    public void whatDoes()
    {
        System.out.println("Phone is: " + function.getFunction());
    }
}
