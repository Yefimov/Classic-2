import sun.plugin2.message.Conversation;

import java.util.ArrayList ;

class Classic
{
    public static void Initialisation2D(){
        System.out.println("2D :");
        Rectangle paper = new Rectangle(12,21);
        Triangle tri = new Triangle(10,21);
        Circle cir = new Circle(60);
        System.out.println("Площадь листа бумаги : " + paper.getSquare());
        System.out.println("Площадь треугольника : " + tri.getSquare());
        System.out.println("Площадь окружности : " + new java.math.BigDecimal(cir.getSquare()).setScale(7, java.math.RoundingMode.HALF_UP).doubleValue()); // Округлил
    }

    public static void Initialisation3D(){
        System.out.println("3D :");
        Parallelepiped boxNails = new Parallelepiped(10,11,12);
        System.out.println("Площадь коробки с гвоздями : " + boxNails.getSquare());
        System.out.println("Объём коробки с гвоздями : " + boxNails.getCapacity());
        Sphere шар = new Sphere(3);
        System.out.println("Площадь шара : " + шар.getSquare());
        System.out.println("Объём шара : " + шар.getCapacity());
        Cone cone = new Cone(10, 11, 12);
        System.out.println("Площадь конуса : " + cone.getSquare());
        System.out.println("Объём конуса : " + cone.getCapacity());
    }

    public static void Initialisation(){
        Initialisation2D();
        System.out.println("\n");
        Initialisation3D();
    }

    public static void InitialisationAll(){
        ArrayList <Figure> figureList = new ArrayList<>();
        figureList.add(new Rectangle(12,21));
        figureList.add(new Triangle(10,21));
        figureList.add(new Circle(60));
        figureList.add(new Parallelepiped(10,11,12));
        figureList.add(new Sphere(3));
        figureList.add(new Cone(10,11,12));

        for (Figure f : figureList)
        {
            System.out.println(f.getClass());
            System.out.println("Площадь фигуры : " + ((Dimension2)f).getSquare());
            if(f instanceof Dimension3) {
                System.out.println("Объём фигуры : " + ((Dimension3)f).getCapacity());
            }
        }
    }

    public static void main(String[] args){
        //Initialisation();
        InitialisationAll();
    }
}