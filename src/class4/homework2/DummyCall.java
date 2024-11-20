package class4.homework2;

public class DummyCall {
    private String[] participants = new String[2];
    private int lastCallDuration;

    public DummyCall(String participant1) {
        this.participants[0] = participant1;
        System.out.println("Audio call completed with participant: " + getParticipants());
    }

    public DummyCall(String participant1, String participant2) {
        this.participants[0] = participant1;
        this.participants[1] = participant2;
    }

    public String getParticipants() {
        if (participants[1] != null) {
            return participants[0] + " and " + participants[1];
        } else {
            return participants[0];
        }
    }

    public void makeCall() {
        System.out.println("Calling " + getParticipants());
    }

    public void takeCall() {
        System.out.println("Call answered by " + getParticipants() + ".");
    }

    public void hangUp() {
        System.out.println("call hung up");
    }

    public void getLastCallDuration() {
        System.out.println("call duration is " + (int) (Math.random() * 3600) + " seconds");
    }
}
