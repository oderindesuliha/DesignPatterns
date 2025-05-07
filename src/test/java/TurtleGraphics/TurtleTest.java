package TurtleGraphics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {

    @Test
    public void testThatTurtleIsNonsense(){
        Turtle myTurtle = new Turtle();
        assertEquals(null, myTurtle);

    }


}