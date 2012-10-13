//Understands that it has four sides with four right angles
public class Rectangle {
    private int length, width;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int calcArea() {
        return width * length;
    }

    public int calcPerimeter() {
        return 2 * (width + length);
    }


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
