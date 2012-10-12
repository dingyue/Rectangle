
public class Rectangle {
    //Understands that rectangle have four sides and four right angles
    private int lenght, width;

    public Rectangle(int width, int lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public int calcArea(){
        return width * lenght;
    }

    public int calcPerimeter() {
        return 2 * (width + lenght);


    }
}
