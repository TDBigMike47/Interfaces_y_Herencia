public class Circle implements Polygon{
    float radio;
    double PI =3.1416;
    double area;
    int sides = 1;

    public Circle(){
        radio = 5;
    }

    public Circle(float radio){
        this.radio = radio;
    }
    public void getArea(){
        area = (radio * radio) * PI;
        System.out.println("The area of the Circle is: " + area);
    }

    public void getSides(){
        System.out.println("I have " + sides +" sides, but I'm a circle, Do i have sides?");
    }
}
