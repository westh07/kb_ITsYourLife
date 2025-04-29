package basic.ch13.sec02.exam01;
// 타입변수 여러개로 받아올때는 ,를 이용
public class Product<K,M> {
    private K kind;
    private M model;

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
