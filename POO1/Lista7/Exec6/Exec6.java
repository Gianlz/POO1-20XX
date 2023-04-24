package lista7.Exec6;

public class Exec6 {
    private float size;

    Exec6(float size) {
        setSize(size);
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getArea() {
        return size * size;
    }
}