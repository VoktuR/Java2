public interface DoublyList extends DoublyIterable {
    void add(String val);
    boolean remove(String val);
    int size();
    String get(int index);
}
