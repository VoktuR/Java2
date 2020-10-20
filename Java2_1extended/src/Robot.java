public class Robot implements Participant {
    public final int RUN_DISTANCE_LIMIT = 30000;
    public final int JUMP_HEIGHT_LIMIT = 1;

    @Override
    public void doAction(Barrier barrier) {
        if (barrier instanceof Treadmill) {
            System.out.println("Robot is running..");
            barrier.setResult(barrier.checkActionPossibility(RUN_DISTANCE_LIMIT));
        }
        else if (barrier instanceof Wall) {
            System.out.println("Robot is jumping..");
            barrier.setResult(barrier.checkActionPossibility(JUMP_HEIGHT_LIMIT));
        }
    }

}
