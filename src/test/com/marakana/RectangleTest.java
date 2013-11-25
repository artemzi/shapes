package test.com.marakana; 

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import com.marakana.Rectangle;
import com.marakana.Square;

/** 
* Rectangle Tester. 
* 
* @author artem 
* @since <pre>nov 25, 2013</pre> 
* @version 1.0 
*/
public class RectangleTest {
	
	public static final Random RNDM = new Random();

    @Test
    public void equalRectanglesMustBeEqual() {
        for (int i = 0; i < 1000000; i++) {
            Rectangle
                    r1 = arbitraryRectangle(),
                    r2 = new Rectangle(r1.getWidth(), r1.getHeight());
            assertEquals(r2, r1);
        }
    }

    @Test
    public void equalSquaresMustBeEqual() {
        for (int i = 0; i < 1000000; i++) {
            Square
                    s1 = arbitrarySquare(),
                    s2 = new Square(s1.getWidth());
            assertEquals(s2, s1);
        }
    }

    @Test
    public void setRectangleWidthShouldChangeOnlyWidth() {
        for (int i = 0; i < 1000000; i++) {
            Rectangle r = arbitraryRectangle();
            int
            	width = RNDM.nextInt(50),
            	height = r.getHeight();
            r.setWidth(width);
            assertEquals(width, r.getWidth());
            assertEquals(height, r.getHeight());
        }
    }

    @Test
    public void SquaresMustBeSquares() {
        for (int i = 0; i < 1000000; i++) {
            Square s = arbitrarySquare();
            assertEquals(s.getWidth(), s.getHeight());
        }
    }

    private Rectangle arbitraryRectangle() {
        return new Rectangle(RNDM.nextInt(), RNDM.nextInt());
    }

    private Square arbitrarySquare() {
        return new Square(RNDM.nextInt());
    }
} 