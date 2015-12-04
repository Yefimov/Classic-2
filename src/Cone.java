public class Cone extends Dimension3{
    public Cone(double width, double length, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }
    @Override
    public double getSquare() { return Math.PI * width / 2 * length + Math.PI * Math.pow(width / 2, 3); } // Половина диаметра - это радиус
    @Override
    public double getCapacity() { return Math.PI * Math.pow(width / 2, 3) * height / 3; }
}
