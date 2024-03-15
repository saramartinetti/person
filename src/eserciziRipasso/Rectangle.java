package eserciziRipasso;

public class Rectangle {

    private int larghezza;
    private String altezza;

    public Rectangle(int larghezza, String altezza) {
        larghezza = larghezza;
        altezza = altezza;
    }

    public Rectangle(int i, int j) {
    }

    public int getLarghezza() {
        return larghezza;
    }

    public String getAltezza() {
        return altezza;
    }

    public void setLarghezza(int larghezza) {
        larghezza = larghezza;
    }

    public void setAltezza(String altezza) {
        altezza = altezza;
    }
}
