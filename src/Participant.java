public class Participant {
    private String name;
    private boolean distanceCompletedStatus = false;

    public Participant(String name) {
        this.name = name;
    }

    public boolean getDistanceCompletedStatus() {
        return this.distanceCompletedStatus;
    }

    public void setDistanceCompletedStatus(boolean distanceCompletedStatus) {
        this.distanceCompletedStatus = distanceCompletedStatus;
    }

    public String getName() {
        return this.name;
    }

}
