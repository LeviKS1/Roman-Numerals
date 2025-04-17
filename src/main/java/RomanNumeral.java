package roman;

public class RomanNumeral {

    String convert (int input){
        String message = "";
        int ones = input % 10;
        for (int i = 0; i < ones; i++){
            message += "I";
        }

        return message;

    }
    
}
