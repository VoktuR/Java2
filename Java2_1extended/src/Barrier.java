public interface Barrier {
    void showResult(boolean result);
    boolean checkActionPossibility(int LIMIT);
    void setResult(boolean result);
    boolean getResult();
}
