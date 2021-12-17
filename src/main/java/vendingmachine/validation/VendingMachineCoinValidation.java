package vendingmachine.validation;

import static vendingmachine.constant.ErrorConstant.*;

public class VendingMachineCoinValidation {

    public static void inputValidation(String input){
        isNum(input);
        isPositive(input);
        isDivide10(input);
    }

    private static void isNum(String input){
        try{
            Integer.parseInt(input);
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException(ERROR_INPUT_NUM);
        }
    }

    private static void isPositive(String input){
        if(Integer.parseInt(input) < 0){
            throw new IllegalArgumentException(ERROR_INPUT_POSITIVE);
        }
    }

    private static void isDivide10(String input){
        if(Integer.parseInt(input) % 10 != 0){
            throw new IllegalArgumentException(ERROR_INPUT_Divide10);
        }
    }
}
