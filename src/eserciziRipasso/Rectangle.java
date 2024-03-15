public class Rectangle {
    
    private int Larghezza;
    private String Altezza;

    public Rectangle(int larghezza, String altezza) {
        Larghezza = larghezza;
        Altezza = altezza;
    }

    public Rectangle(int i, int j) {
    }

    public int getLarghezza() {
        return Larghezza;
    }

    public String getAltezza() {
        return Altezza;
    }

    public void setLarghezza(int larghezza) {
        Larghezza = larghezza;
    }

    public void setAltezza(String altezza) {
        Altezza = altezza;
    }
    
}
