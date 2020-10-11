public class Register {
    private String firstName;
    private String lastName;
    private int dayBirth;
    private int monthBirth;
    private int yearBirth;
    private double altura;
    private double peso;
    private double imc;

    public Register(String firstName, String lastName, int dayBirth, int monthBirth, int yearBirth, double altura,
            double peso) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.altura = altura;
        this.peso = peso;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setdayBirth(int dayBirth) {
        this.dayBirth = dayBirth;
    }

    public int getdayBirth() {
        return this.dayBirth;
    }

    public void setmonthBirth(int month) {
        this.monthBirth = monthBirth;
    }

    public int getmonthBirth() {
        return this.monthBirth;
    }

    public void setyearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getyearBirth() {
        return this.yearBirth;
    }

    public int getIdade() {
        return 2020 - yearBirth;
    }

    public void setAltura(double alturaMetros) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getImc() {
        imc = getPeso() / (getAltura() * getAltura());
        return imc;
    }
}