package homework10.task1;

public interface IDictionary<TKey, TValue> {
    void addElements(TKey key, TValue value);

    TValue valueOf(int i);

    int countPair();
}
