abstract class Shape {

    abstract double calculatevolume();

}
class cylinder extends Shape{
    public double r;
    public double h;

    public cylinder(double r, double h){
        this.r=r;
        this.h=h;
    }

    @Override
    double calculatevolume(){
        return Math.PI * r*r*h;
    }
}
class cube extends Shape{
    public double side;

    public cube(double side){
        this.side=side;
    }

    @Override
    double calculatevolume(){
        return side*side*side;
    }
}
