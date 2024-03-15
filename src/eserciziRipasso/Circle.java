package eserciziRipasso;

public class Circle {

    private  static float raggio;

    public Circle(float raggio) {
        this.raggio = raggio;
    }

    public float area (){
        return raggio * raggio * 3.14f;
    }

    public float circonferenza (){
        return raggio * 2 * 3.14f;
    }

    public float getRaggio() {
        return raggio;
    }

    public void setRaggio(float raggio) {
        this.raggio = raggio;
    }

    @Override
    public String toString() {
        return "Circle [raggio=" + raggio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(raggio);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        if (Float.floatToIntBits(raggio) != Float.floatToIntBits(other.raggio))
            return false;
        return true;
    }
    
}
