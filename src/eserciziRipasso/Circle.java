package eserciziRipasso;

public class Circle {

    private double raggio;

    public Circle(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double getArea() {
        return Math.PI * raggio * raggio;
      }
    
      public double getCirconferenza() {
        return 2 * Math.PI * raggio; 
}
}