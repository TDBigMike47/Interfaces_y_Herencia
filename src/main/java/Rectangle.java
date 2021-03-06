public class Rectangle implements Polygon{
    float length;
    float breadth;
    float area;
    int sides = 4;

    public Rectangle(){
        length = 5;
        breadth = 4;
    }

    public Rectangle(int lenght, int breadth){
        this.length = lenght;
        this.breadth = breadth;

    }

    public void getArea() {
        area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);

    }

    public void getSides(){
        System.out.println("I have " + sides +" sides");
    }
}
