package homework.hw6.competition.participants;

public abstract class Participant {

    private final double MAX_RUNNING_DISTANCE;
    private final double MAX_JUMPING_HEIGHT;
    private final String NAME;
    private boolean isFailedCompetition = false;

    public Participant(String name, double runningDistance, double jumpingHeight) {
        this.NAME = name;
        this.MAX_RUNNING_DISTANCE = runningDistance;
        this.MAX_JUMPING_HEIGHT = jumpingHeight;
    }

    public boolean isRun(double distance) {
        return MAX_RUNNING_DISTANCE >= distance;
    }

    public boolean isJump(double height) {
        return MAX_JUMPING_HEIGHT >= height;
    }

    public String getName() {
        return NAME;
    }

    public double getMaxRunningDistance() {
        return MAX_RUNNING_DISTANCE;
    }

    public double getMaxJumpingHeight() {
        return MAX_JUMPING_HEIGHT;
    }

    public boolean getIsFailedCompetition() {
        return isFailedCompetition;
    }

    public void setIsFailedCompetition(boolean failedCompetition) {
        isFailedCompetition = failedCompetition;
    }
}
