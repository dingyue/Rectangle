//Understands how to draw a rectangle
public class Graphing {
    private int lengthOfRectangle, widthOfRectangle;
    public Graphing(Rectangle rectangle) {
        this.lengthOfRectangle = rectangle.getLength();
        this.widthOfRectangle = rectangle.getWidth();
    }

    public String presentVisualization(String symbol) {
        String visualRectangle = "";
        for (int row = 0; row < widthOfRectangle; row++) {
            if (row == 0 || row == widthOfRectangle - 1) {
                visualRectangle = visualizeTopAndBottomLine(visualRectangle, symbol);
            } else {
                visualRectangle = visualizeSideLines(visualRectangle, symbol);
            }
        }
        return visualRectangle;
    }

    private String visualizeSideLines(String visualRectangle, String symbol) {
        visualRectangle += symbol;
        for (int printLength = 1; printLength < lengthOfRectangle - 1; printLength++)
            visualRectangle += " ";
        visualRectangle += symbol + "\n";
        return visualRectangle;
    }

    private String visualizeTopAndBottomLine(String visualRectangle, String symbol) {
        for (int printLength = 0; printLength < lengthOfRectangle; printLength++) {
            visualRectangle += symbol;
        }
        visualRectangle += "\n";
        return visualRectangle;
    }
}
