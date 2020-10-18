public class Robot implements Abilities {
    public final int RUN_DISTANCE_LIMIT = 30000;
    public final int JUMP_HEIGHT_LIMIT = 1;

    private int winCounter = 0;

    public int getWinCounter() {
        return winCounter;
    }

    public void setWinCounter(int winCounter) {
        this.winCounter = winCounter;
    }

    @Override
    public void winCheck(int winCounter, int length) {
        if (winCounter == length) System.out.println("Congratulations, robot finished distance successfully");
    }

    @Override
    public void run() {
        System.out.println("Robot running..");
    }

    @Override
    public void jump() {
        System.out.println("Robot jumping..");
    }
}
