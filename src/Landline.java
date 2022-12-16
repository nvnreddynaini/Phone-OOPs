public class Landline implements Phone{
    private String myPhoneNo;
    private boolean isRinging;
    boolean powerOn;

    public Landline(String PhoneNo) {
        myPhoneNo = PhoneNo;
        isRinging = false;
        powerOn = true;
    }

    @Override
    public void powerOn() {
        powerOn = true;
    }

    @Override
    public void dailNo(String No) {
        System.out.println("Dialing the no "+ No);
    }

    @Override
    public boolean answerPhone() {
        if(isRinging == true){
            System.out.println("Please answer the Phone on "+myPhoneNo);
            isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean receivePhone(String phoneNo) {
        if(myPhoneNo == phoneNo){
            System.out.println("We have received the phone on "+myPhoneNo);
            isRinging = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        if(isRinging == true){
            return true;
        }
        return false;
    }
}
