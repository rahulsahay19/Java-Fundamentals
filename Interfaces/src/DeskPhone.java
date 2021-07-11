public class DeskPhone implements ITelephone {
    private int _myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        _myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action required.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing" + phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == _myNumber){
            isRinging = true;
            System.out.println("Tring Tring");
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
