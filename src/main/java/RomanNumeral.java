

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
            input -= 9;
        }
        
        if (input >= 5 && input < 9){
            message += "V";
            input -= 5;
        }

        if (input == 4){
            message += "IV";
            input -= 4;
        }

        for (int i = 0; i < input; i++){
            message += "I";
        }  

        return message;

    }
    
}
