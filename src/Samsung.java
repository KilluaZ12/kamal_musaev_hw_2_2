public class Samsung extends Telephone{

    private int ram;

    public Samsung(PhoneModel phoneModel, int ram) {
        super(phoneModel);
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }
    @Override
    public void print() {
        System.out.println("Phone model: " + getPhoneModel() + ", RAM: " + getRam() + "gb");
    }
}
