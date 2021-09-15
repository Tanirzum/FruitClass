public class VegetableBox<K, T extends Vegetable> {
    T getObj;
    K value;

    public VegetableBox(T getObj, K value) {
        this.getObj = getObj;
        this.value = value;
    }

    public T getObj() {
        return getObj;
    }

    public void setObj(T getObj) {
        this.getObj = getObj;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }
}
