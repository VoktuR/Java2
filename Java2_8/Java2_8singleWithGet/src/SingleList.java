public interface SingleList extends SingleIterable {
    void add(String val);
    boolean remove(String val);
    int size();
    String get(int index);
}
