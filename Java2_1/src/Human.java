public class Human implements Abilities {
    public final int RUN_DISTANCE_LIMIT = 100000;
    public final int JUMP_HEIGHT_LIMIT = 2;
    private int winCounter = 0;

    public int getWinCounter() {
        return winCounter;
    }

    public void setWinCounter(int winCounter) {
        this.winCounter = winCounter;
    }

    @Override
    public void winCheck(int winCounter, int length) {
        if (winCounter == length) System.out.println("Congratulations, human finished distance successfully");
     }

    @Override
    public void run() { System.out.println("Human running.."); }

    @Override
    public void jump() {
        System.out.println("Human jumping..");
    }
}
