package multithreading.classlevellocking;

public class LaunchClassLevelLocking {
    public static void main(String[] args) {
        HSBCBank bank1 = new HSBCBank(4000);
        Atm atm = new Atm();
        atm.setName("ATM Thread");

        GooglePay gpay = new GooglePay();
        gpay.setName("GPAY Thread");

        PhonePe ppay = new PhonePe();
        ppay.setName("PhonePay Thread");

        atm.start();
        gpay.start();
        ppay.start();

    }
}
