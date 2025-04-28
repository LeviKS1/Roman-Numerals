package roman;

public class RomanNumeral {

    String convert (int input){
        String message = "";
        int ones = input % 10;
        int nine = input % 9;
        int five = input % 5;
        int four = input % 4;

        if (nine == 0){
            message += "IX";
        }
        else if (five == 0){
            message += "V";
        }
        else if (four == 0){
            message += "IV";
        }
        else{
            for (int i = 0; i < ones; i++){
                message += "I";
            }
        }
        
        

        return message;

    }
    
}
