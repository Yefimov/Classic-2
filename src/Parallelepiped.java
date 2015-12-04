public  class Parallelepiped extends Dimension3{
    public Parallelepiped(double width, double length, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }
    @Override
    public double getSquare() { return width * length * height; }
}
