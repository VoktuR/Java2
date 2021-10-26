public class Wall implements Barrier {
    public final int HEIGHT = 2;
    private boolean result;

    @Override
    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public boolean getResult() {
        return result;
    }

    @Override
    public void showResult(boolean result) {
        if (result) {
            System.out.println("Jump was successful");
        }
        else System.out.println("Action failed");
    }

    @Override
    public boolean checkActionPossibility(int JUMP_HEIGHT_LIMIT) {
        return HEIGHT <= JUMP_HEIGHT_LIMIT;
    }

}
