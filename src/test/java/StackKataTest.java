import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Felipe on 4/12/2017.
 */
public class StackKataTest {
    StackKata stackKata;
    boolean resultBoolean;
    @Before
    public void setUp() throws Exception {
        //Arrange
        stackKata = new StackKata();
        resultBoolean = false;

    }

    @Test
    public void stackStartEmpty(){

        //Act
        resultBoolean = stackKata.isEmpty();

        //Assert
        assertEquals(true,resultBoolean);
    }
    @Test
    public void pushThreeThenIsEmptyIsFalse(){
        //Act
        stackKata.push(3);
        resultBoolean = stackKata.isEmpty();

        //Assert
        assertEquals(false,resultBoolean);

    }

}