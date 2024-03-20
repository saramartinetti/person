package eserciziRipassoOO;

public class Rectangle {

    private double larghezza;
    private double altezza;

    public Rectangle(double larghezza, double altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    public double getArea() {
        return larghezza * altezza;
      }
      public double getPerimetro() {
        return 2 * (larghezza + altezza);
}
}