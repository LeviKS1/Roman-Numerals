

public class RomanNumeral {

    String convert (int input){
        String message = "";

        if (input >= 10){
            int q = Math.floorDiv(input, 10);
            for (int i = 0; i < q; i++){
                message += "X";
                input -= 10;
            }
        }

        if (input == 9){
            message += "IX";
        }
        else if (input == 5){
            message += "V";
        }
        else if (input == 4){
            message += "IV";
        }
        else{
            for (int i = 0; i < input; i++){
                message += "I";
            }
        }     

        return message;

    }
    
}
