public class Square implements Polygon{
    float lenght;
    float area;
    int sides = 4;

    public Square(){
        lenght = 5;

    }

    public Square(int lenght){
        this.lenght = lenght;
    }

    public void getArea(){
        area = lenght * lenght;
        System.out.println("The area of the Square is: " + area);

    }
    public void getSides(){
        System.out.println("I have " + sides +" sides");
    }

}
