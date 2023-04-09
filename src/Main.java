public class Main {
    public static void main(String[] args) {

        Telephone iphone = createObject(PhoneModel.IPHONE);
        Telephone samsung = createObject(PhoneModel.SAMSUNG);
        Telephone xiaomi = createObject(PhoneModel.XIAOMI);

        if (iphone != null) {
            iphone.print();
        }

        if (samsung != null) {
            samsung.print();
        }

        if (xiaomi != null) {
            xiaomi.print();
        }

    }
    public static Telephone createObject(PhoneModel phoneModel) {
        switch (phoneModel) {
            case IPHONE:
                Iphone iphone = new Iphone(PhoneModel.IPHONE, 2022);
                return iphone;
            case SAMSUNG:
                Samsung samsung = new Samsung(PhoneModel.SAMSUNG, 16);
                return samsung;
            case XIAOMI:
                Xiaomi xiaomi = new Xiaomi(PhoneModel.XIAOMI, 128);
                return xiaomi;
            default:
                return null;
        }
    }
}