package entities;

public class House extends Property {

    private int houseRent;

    public House(String adress, int number, Owner owner, int houseRent) {
        super(adress, number, owner);
        this.houseRent = houseRent;
    }

     public int getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(int houseRent) {
        this.houseRent = houseRent;
    }

    @Override
    public boolean isRented() {
        if (isRent()) {
            System.out.println("The house is rented.");
        } else {
            System.out.println("The house is available.");
        }
        return isRent();
    }

    @Override
    public Integer calculateRent(int days) {
        return days * houseRent;
    }
    
}
