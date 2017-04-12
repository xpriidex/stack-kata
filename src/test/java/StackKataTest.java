import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Felipe on 4/12/2017.
 */
public class StackKataTest {
    @Test
    public void stackStartEmpty(){
        //Arrange
        StackKata stackKata = new StackKata();
        boolean result = false;
        //Act
        result = stackKata.isEmpty();

        //
        assertEquals(true,result);
    }

}