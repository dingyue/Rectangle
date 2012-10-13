import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//Ensures that the properties of the square are correct
public class TestSquare {

    Square square;


    @Test
    public void shouldReturnAreaWhenSideAreTwo() {
        square = new Square(2);
        assertThat(square.area(), is(4));
    }

    @Test
    public void shouldReturnAreaWhenSideAreFour() {
        square = new Square(4);
        assertThat(square.area(), is(16));
    }

    @Test
    public void shouldReturnPerimeterWhenSidesAreFour() {
        square = new Square(4);
        assertThat(square.perimeter(), is(16));
    }

    @Test
    public void shouldReturnPerimeterWhenSidesAreFive() {
        square = new Square(5);
        assertThat(square.perimeter(), is(20));
    }

}
