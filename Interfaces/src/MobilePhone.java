public class MobilePhone implements ITelephone{
    private int _myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        _myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone switched on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing" + phoneNumber);
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == _myNumber && isOn){
            isRinging = true;
            System.out.println("Ring Ring");
        }else {
            isRinging = false;
            System.out.println("Mobile phone switched off");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

