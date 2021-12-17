package vendingmachine.controller;

import vendingmachine.model.MachineCoin;
import vendingmachine.model.MachineProduct;
import vendingmachine.model.Product;
import vendingmachine.model.UserCoin;
import vendingmachine.validation.VendingMachineCoinValidation;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

public class VendingMachineController {

    int sumMachineCoin;
    UserCoin userCon;
    MachineCoin machineCoin;
    Product product;
    MachineProduct machineProduct;

    public void run() {
        runVendingMachineCoin();
        runVendingMachineRandomCoin();
        OutputView.PrintVendingMachineCoin();
        runProduct();
    }

    private void runVendingMachineCoin(){
        String machineCoin = InputView.inputVendingMachineCoin();
        try{
            VendingMachineCoinValidation.inputValidation(machineCoin);
            sumMachineCoin = Integer.parseInt(machineCoin);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            runVendingMachineCoin();
        }
    }

    private void runVendingMachineRandomCoin(){
        machineCoin = new MachineCoin();
        machineCoin.createRandomCoin(sumMachineCoin);
    }

    private void runProduct(){
        String products = InputView.inputProduct();
    }


}
