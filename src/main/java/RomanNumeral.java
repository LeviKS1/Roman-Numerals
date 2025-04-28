package roman;

public class RomanNumeral {

    String convert (int input){
        String message = "";
        int ones = input % 10;
        int five = input % 5;

        if (five == 0){
            message += "V";
        }
        else{
            for (int i = 0; i < ones; i++){
                message += "I";
            }
        }
        
        

        return message;

    }
    
}
