package class4.homework2;

public class Demo {
    public static void main(String[] args) {
        DummyCall audioCallWithSingle = new DummyCall("Armen");
        audioCallWithSingle.getParticipants();
        audioCallWithSingle.makeCall();
        audioCallWithSingle.takeCall();
        audioCallWithSingle.hangUp();
        audioCallWithSingle.getLastCallDuration();
        System.out.println("------------------");

        DummyCall audioCallWithTwo = new DummyCall("Armen", "Sona");
        audioCallWithTwo.getParticipants();
        audioCallWithTwo.makeCall();
        audioCallWithTwo.takeCall();
        audioCallWithTwo.hangUp();
        audioCallWithTwo.getLastCallDuration();
        System.out.println("----------------------");

        DummyAppPro videoCallWithThree = new DummyAppPro("Alice Ivanova", "Bob Petrov", "Charlie Sidorov");
        videoCallWithThree.makeCall();
        videoCallWithThree.takeCall();
        videoCallWithThree.enableCamera();
        videoCallWithThree.hangUp();
        videoCallWithThree.getLastCallDuration();

        System.out.println("----------------");

        DummyAppProMax videoCallWithSome = new DummyAppProMax("Armen", "Box", "Mike", "David", "Maks");
        videoCallWithSome.makeCall();
        videoCallWithSome.takeCall();
        videoCallWithSome.enableCamera();
        videoCallWithSome.enableScreenSharing(); // Enable screen sharing during the call
        videoCallWithSome.hangUp();
        videoCallWithSome.getLastCallDuration();
    }
}
