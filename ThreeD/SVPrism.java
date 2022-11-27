package ThreeD;

public abstract class SV implements shape {
    double length;
    double width;
    double height;


    public double getSurfaceArea(){
        return 2 * ((length * width) + (height * length) + (height * width));
    }

    public double getVolume(){
        return (length * width * height);
    }
}
