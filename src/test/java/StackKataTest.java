import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Felipe on 4/12/2017.
 */
public class StackKataTest {
    StackKata stackKata;
    boolean resultBoolean;
    int result;
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
    @Test
    public void pushOneAndTwoThenIsEmptyIsFalse(){
        //Act
        stackKata.push(1);
        stackKata.push(2);
        resultBoolean = stackKata.isEmpty();

        //Assert
        assertEquals(false,resultBoolean);

    }
    @Test
    public void pushFourAndFivehenIsTamIsTwo(){
        //Act
        stackKata.push(1);
        stackKata.push(2);
        result=stackKata.tam();

        //Assert
        assertEquals(2,result);

    }
    @Test
    public void pushSixAndSevenThenPopReturnSeven(){
        //Act
        stackKata.push(6);
        stackKata.push(7);
        result=stackKata.pop();

        //Assert
        assertEquals(7,result);

    }

}