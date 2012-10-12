import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

 //Ensures the rectangle can return its perimeter and area.
public class TestRectangle {
    @Test
    public void shouldReturnFourWhenLengthIsTwoAndWidthIsTwo(){
        Rectangle rectangle = new Rectangle(2,2);
        assertThat(rectangle.calcArea(),is(4));
    }

    @Test
    public void shouldReturnAreaOfTwoByThree(){
        Rectangle rectangle = new Rectangle(2,3);
        assertThat(rectangle.calcArea(),is(6));
    }

    @Test
    public void shouldReturnPerimeterOfTwoByThree(){
        Rectangle rectangle = new Rectangle(2,3);
        assertThat(rectangle.calcPerimeter(),is(10));
    }
}
