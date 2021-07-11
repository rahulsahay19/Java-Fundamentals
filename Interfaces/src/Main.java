public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone = new DeskPhone(12345);
        timsPhone.powerOn();
        timsPhone.callPhone(12345);
        timsPhone.answer();

        ITelephone timsMobilePhone = new MobilePhone(24567);
        timsMobilePhone.powerOn();
        timsMobilePhone.callPhone(24567);
        timsMobilePhone.answer();
    }
}
