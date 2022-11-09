import javax.xml.crypto.dsig.SignatureMethod;

public class Circle implements Shape{
    
    @Override
    public void draw(String colour) {
        System.out.println(colour + "Circle");        
    }
}
