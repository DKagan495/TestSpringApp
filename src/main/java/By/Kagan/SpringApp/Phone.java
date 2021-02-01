package By.Kagan.SpringApp;

public class Phone {
    private Function function;
    public Phone (Function function)
    {
        this.function = function;
    }
    public void whatDoes()
    {
        System.out.println("Phone is: " + function.getFunction());
    }
}
