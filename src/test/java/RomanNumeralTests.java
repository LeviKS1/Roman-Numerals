

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralTests {

    @Test
    void OneIsI (){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals(romanNumeral.convert(1), "I");
    }

    @Test
    void FiveIsV(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals(romanNumeral.convert(5), "V");
    }

    @Test
    void FourIsIV(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals(romanNumeral.convert(4),"IV");
    }

    @Test
    void NineIsIX(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals(romanNumeral.convert(9), "IX");
    }

    @Test
    void TenIsX(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals(romanNumeral.convert(10), "X");
    }

    @Test
    void LessThanTen(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals(romanNumeral.convert(8), "VIII");
    }
}
