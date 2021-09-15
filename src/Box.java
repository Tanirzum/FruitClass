public class Box<K, T extends Friut> {

    T getObj;
    K value;


    public Box(K value, T getObj) {
        this.getObj = getObj;
        this.value = value;
    }

    public T getGetObj() {
        return getObj;
    }

    public void setGetObj(T getObj) {
        this.getObj = getObj;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }

    public T getObj() {
        return getObj;
    }
}
