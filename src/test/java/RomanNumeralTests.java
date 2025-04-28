package roman;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
}
