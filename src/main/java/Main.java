public class Main {
    public static void main(String[] args) {
        Polygon r1 = new Rectangle();
        Polygon r2 = new Rectangle(8,5);

        r1.getArea();
        // The area is: 20
        r1.getSides();
        // I have 4 Sides
        r2.getArea();
        // The area is 40
        r2.getSides();
        //I have 4 sides

        Polygon s1 = new Square();
        Polygon s2 = new Square(12);

        s1.getArea();
        //The area is 25
        s1.getSides();
        // I have 4 Sides
        s2.getArea();
        // The area is 144
        s2.getSides();
        // I have 4 Sides


        Polygon c1 = new Circle();
        Polygon c2 = new Circle(16);

        c1.getArea();
        //The area of the Circle is 78.539
        c1.getSides();
        // I have 1 sides, but I'm a circle, Do i have sides?
        c2.getArea();
        // The area of the Circle is: 804.2496
        c2.getSides();
        //I have 1 sides, but I'm a circle, Do i have sides?
    }
}
