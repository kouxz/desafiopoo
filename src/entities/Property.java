package entities;

public abstract class Property {
    protected String adress;
    protected int number;
    protected boolean rented;
    protected Owner owner;

    public Property(String adress, int number, Owner owner) {
        this.adress = adress;
        this.number = number;
        this.rented = false;
        this.owner = owner;
    }

    public abstract boolean isRented(); 

    public String contactOwner(){
        return "Owner: " + owner.getName() + "Phone: " + owner.getPhone();
    }

    public abstract Integer calculateRent(int days);

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isRent() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }   
}
