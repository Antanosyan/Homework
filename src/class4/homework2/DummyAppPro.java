package class4.homework2;

public class DummyAppPro extends DummyCall{
    private String[] videoParticipants; // Array for participants (up to 10)
    private boolean cameraEnabled; // Status of the camera

    // Constructor for DummyAppPro that accepts up to 10 participants
    public DummyAppPro(String... participantNames) {
        super(participantNames[0], participantNames.length > 1 ? participantNames[1] : null);

        if (participantNames.length > 10) {
            System.out.println("Maximum number of participants is 10.");
            System.exit(5);
        }

        this.videoParticipants = new String[10];
        for (int i = 0; i < participantNames.length; i++) {
            this.videoParticipants[i] = participantNames[i];
        }
        this.cameraEnabled = false;
        System.out.println("Audio and Video call with participants: " + getParticipants());
    }

    public void makeVideoCall() {
        System.out.println("Making video call to participants: " + getParticipants());
        if (cameraEnabled) {
            System.out.println("Camera is enabled.");
        } else {
            System.out.println("Camera is disabled.");
        }
    }
    public void enableCamera() {
        cameraEnabled = true;
        System.out.println("Camera is now enabled.");
    }

    public void disableCamera() {
        cameraEnabled = false;
        System.out.println("Camera is now disabled.");
    }
    public void takeCall() {
        System.out.println("Video call accepted by participants: " + getParticipants() + ".");
    }
    public void hangUp() {
        System.out.println("Video call ended.");
    }
}
