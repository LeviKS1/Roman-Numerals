

public class RomanNumeral {

    String convert (int input){
        String message = "";
        int ones = input % 10;
        int nine = input % 9;
        int five = input % 5;
        int four = input % 4;


        if (input == 10){
            int q = (int) Math.floorDiv(input, 10);
            for (int i = 0; i < q; i++){
                message += "X";
            }
        }
        if (nine == 0){
            message += "IX";
        }
        else if (input == 5){
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
