package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        String testData = "";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void checksForDoubleSquareBracket(){
        String checkForDoubleBracket = "Checking for double bracket";
        String testData = "[[]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertEquals(checkForDoubleBracket, result, true);
    }

    @Test
    public void checkForString(){
        String launchCodeString = "Checking for Launch Code";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        //String wordTested = "[]LaunchCode";
        assertEquals(launchCodeString, result, true);
    }

}
