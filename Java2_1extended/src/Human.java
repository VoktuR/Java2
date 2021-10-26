public class Human implements Participant {
    public final int RUN_DISTANCE_LIMIT = 10000;
    public final int JUMP_HEIGHT_LIMIT = 2;

    @Override
    public void doAction(Barrier barrier) {
        if (barrier instanceof Treadmill) {
            System.out.println("Human is running..");
            barrier.setResult(barrier.checkActionPossibility(RUN_DISTANCE_LIMIT));
        }
        else if (barrier instanceof Wall) {
            System.out.println("Human is jumping..");
            barrier.setResult(barrier.checkActionPossibility(JUMP_HEIGHT_LIMIT));
        }
    }

}
