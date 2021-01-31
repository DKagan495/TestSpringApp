package By.Kagan.SpringApp;

public class MyFrstBean {
    private String Name, Surname;
    private int yearsOld;
    public MyFrstBean(String Name, String Surname, int yearsOld)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.yearsOld = yearsOld;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
