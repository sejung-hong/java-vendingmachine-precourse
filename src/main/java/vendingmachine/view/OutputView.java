package vendingmachine.view;

import vendingmachine.model.Coin;
import vendingmachine.model.MachineCoin;

import java.util.Map;

public class OutputView {

    public static void PrintVendingMachineCoin(){
        Map<Coin, Integer> machineCoin = MachineCoin.getMachineCoin();
        System.out.println("자판기가 보유한 동전");
        for(Map.Entry<Coin,Integer> map : machineCoin.entrySet()){
            System.out.println(map.getKey().getAmount() + "원 - " + map.getValue() + "개" );
        }
    }
}
