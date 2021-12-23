package Chapter12.practice_p399;

public class GenericPrinter<V extends Matarial> {
    private V material;

    public void setMaterial(V material) {
        this.material = material;
    }

    public V getMaterial() {
        return this.material;
    }

    public void printing() {
        material.doPrinting();
    }

    @Override
    public String toString() {
        return material.toString();
    }
}