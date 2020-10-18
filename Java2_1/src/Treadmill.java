public class Treadmill implements Barrier {

    public final int DISTANCE = 5000;

    @Override
    public void makeAMove(boolean result) {
        if (result) {
            System.out.println("Run was successful");
        }
        else System.out.println("Action failed");
    }

    @Override
    public boolean checkActionPossibility(int RUN_DISTANCE_LIMIT) {
        return DISTANCE <= RUN_DISTANCE_LIMIT;
    }

}
