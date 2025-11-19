package multithreading.objectlevellocking;

public class LaunchObjectLevelLocking {
    public static void main(String[] args) {
        HSBCBank bank1 = new HSBCBank(4000);
        Atm atm = new Atm(bank1);
        atm.setName("ATM Thread");

        GooglePay gpay = new GooglePay(bank1);
        gpay.setName("GPAY Thread");

        PhonePe ppay = new PhonePe(bank1);
        ppay.setName("PhonePay Thread");

        atm.start();
        gpay.start();
        ppay.start();





    }
}
