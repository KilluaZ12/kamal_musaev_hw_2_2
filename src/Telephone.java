public abstract class Telephone implements Printable{

    private PhoneModel phoneModel;

    public void setPhoneModel(PhoneModel phoneModel) {
        this.phoneModel = phoneModel;
    }

    public PhoneModel getPhoneModel() {
        return phoneModel;
    }

    public Telephone(PhoneModel phoneModel) {
        this.phoneModel = phoneModel;
    }
}
