import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String colour) {
        shapes.forEach( shape -> {
            shape.draw(colour);
        });
    }

    public void add(Shape s) {
        shapes.add(s);
    }

    public void remove(Shape s) {
        try {
            shapes.remove(s);
        } catch (Exception e) {
            System.out.println("Shape not found");
        }
    }

    public void clear() {
        shapes.clear();
    }
}
