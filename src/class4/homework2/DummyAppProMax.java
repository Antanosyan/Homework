package class4.homework2;

public class DummyAppProMax extends DummyAppPro{
    private boolean screenSharingEnabled;

    public DummyAppProMax(String... participantNames) {
        super(participantNames);
        this.screenSharingEnabled = false;
    }
    public void enableScreenSharing() {
        if (screenSharingEnabled) {
            System.out.println("Screen sharing is already enabled.");
        } else {
            screenSharingEnabled = true;
            System.out.println("Screen sharing is now enabled.");
        }
    }
}
