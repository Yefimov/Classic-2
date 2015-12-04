public class Sphere extends Dimension3{
    public Sphere(double width){
        this.width = width;
    }
    @Override
    public double getSquare() { return Math.PI * Math.pow(width / 2, 2) * 4; } // Половина диаметра - это радиус
    @Override
    public double getCapacity() { return Math.PI * Math.pow(width / 2, 3) * 4 / 3; }
}
