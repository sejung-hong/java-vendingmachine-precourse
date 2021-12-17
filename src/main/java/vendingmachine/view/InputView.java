package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;

import static vendingmachine.constant.InputConstant.*;

public class InputView {

    private static String ConsoleReadLine(){
        return Console.readLine();
    }

    public static String inputVendingMachineCoin(){
        System.out.println(MSG_INPUT_VENDING_MACHINE_COIN);
        return ConsoleReadLine();
    }

    public static String inputProduct(){
        System.out.println(MSG_INPUT_PRODUCT);
        return ConsoleReadLine();
    }

}
