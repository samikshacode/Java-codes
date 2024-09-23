package Package;
public class trig{
    double angle;
    
   

    public trig(double angle) {
        this.angle = Math.toRadians(angle); // Convert degrees to radians
    }

    public double getsine() {
        return Math.sin(angle);
    }

    public double getcosine() {
        return Math.cos(angle);
    }

    public double gettan() {
        return Math.tan(angle);
    }

    public double getSecant() {
        return 1 / Math.cos(angle);
    }

    public double getCosecant() {
        return 1 / Math.sin(angle);
    }

    public double getCotangent() {
        return 1 / Math.tan(angle);
    }
}
