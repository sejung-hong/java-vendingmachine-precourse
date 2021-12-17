package vendingmachine.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.LinkedHashMap;
import java.util.Map;

public class MachineCoin {
    private static Map<Coin, Integer> machineCoin;

    public  static Map<Coin, Integer> getMachineCoin(){
        return machineCoin;
    }
    public void init(){
        machineCoin = new LinkedHashMap<>();
        for(Coin coin : Coin.values()){
            machineCoin.put(coin, 0);
        }
    }

    public void createRandomCoin(int sumMachineCoin){
        init();
        while(sumMachineCoin != 0){
            int randomAmount = Randoms.pickNumberInList(Coin.getCoinList());
            if(sumMachineCoin < randomAmount){
                continue;
            }
            sumMachineCoin -= randomAmount;
            Coin randomCoin = Coin.getCoin(randomAmount);
            machineCoin.put(randomCoin, machineCoin.get(randomCoin)+1);
        }

    }
}
