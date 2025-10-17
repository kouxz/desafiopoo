package entities;

public class Owner {
    private String name;
    private String phone;
    private String CPF;
   
    public Owner(String name, String phone, String CPF) {
        this.name = name;
        this.phone = phone;
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCPF() {
        return CPF;
    }
}
