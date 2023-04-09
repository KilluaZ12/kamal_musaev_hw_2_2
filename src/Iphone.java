public class Iphone extends Telephone{

    private int yearOfManufacture;
    public Iphone(PhoneModel phoneModel, int yearOfManufacture) {
        super(phoneModel);
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public void print() {
        System.out.println("Phone model: " + getPhoneModel() + ", year of manufacture: " + getYearOfManufacture());
    }
}
