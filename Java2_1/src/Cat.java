public class Cat implements Abilities {
    public final int RUN_DISTANCE_LIMIT = 1000;
    public final int JUMP_HEIGHT_LIMIT = 3;

    private int winCounter = 0;

    public int getWinCounter() {
        return winCounter;
    }

    public void setWinCounter(int winCounter) {
        this.winCounter = winCounter;
    }

    @Override
    public void winCheck(int winCounter, int length) {
        if (winCounter == length) System.out.println("Congratulations, cat finished distance successfully");
    }

    @Override
    public void run() {
        System.out.println("Cat running..");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumping..");
    }
}
