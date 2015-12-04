public class Circle extends Dimension2{
    public Circle(double width)
    {
        this.width = width; // this.width - это диаметр окружности
    }
    @Override
    public double getSquare() { return Math.PI * width / 2; } // Половина диаметра - это радиус
}