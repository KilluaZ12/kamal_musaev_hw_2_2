public class Xiaomi extends Telephone{

    private int memory;
    public Xiaomi(PhoneModel phoneModel, int memory) {
        super(phoneModel);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public void print() {
        System.out.println("Phone model: " + getPhoneModel() + ", " + getMemory() + "gb memory");
    }
}
