import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
//Ensures the drawing of rectangle is correct
public class TestGraphing {

    @Test
    public void shouldPrintRectangleThreeByFiveStars(){
        Rectangle rectangle = new Rectangle(3,5);
        Graphing graph = new Graphing(rectangle);
        assertThat(graph.presentVisualization("*"),is("*****\n*   *\n*****\n"));
    }

    @Test
    public void shouldPrintRectangleThreeBySixStars(){
        Rectangle rectangle = new Rectangle(3,6);
        Graphing graph = new Graphing(rectangle);
        assertThat(graph.presentVisualization("*"),is("******\n*    *\n******\n"));
    }

    @Test
    public void shouldPrintRectangleThreeBySixDots(){
        Rectangle rectangle = new Rectangle(3,6);
        Graphing graph = new Graphing(rectangle);
        assertThat(graph.presentVisualization("."),is("......\n.    .\n......\n"));
    }

    @Test
    public void shouldPrintRectangleFiveBySixDots(){
        Rectangle rectangle = new Rectangle(5,6);
        Graphing graph = new Graphing(rectangle);
        assertThat(graph.presentVisualization("."),is("......\n.    .\n.    .\n.    .\n......\n"));
    }
}
