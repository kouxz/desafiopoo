package entities;

public class Apartment extends Property{
    
    private int aptRent;

    public Apartment(String adress, int number, Owner owner, int aptRent) {
        super(adress, number, owner);
        this.aptRent = aptRent;
    }

    public int getAptRent() {
        return aptRent;
    }

    public void setAptRent(int aptRent) {
        this.aptRent = aptRent;
    }
    

    @Override
    public boolean isRented() {
        if (isRent()) {
            System.out.println("The apartment number" + getNumber() + " is rented.");
        } else {
            System.out.println("The apartment number " + getNumber() + " is available.");
        }
        return isRent();
    }

    @Override
    public Integer calculateRent(int days) {
        return days * aptRent;
    }
}

