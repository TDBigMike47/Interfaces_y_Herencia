public interface Polygon {
    void getArea();

    // default method
    default void getSides() {
        System.out.println("I print the sides of a Polygon.");
    }
}