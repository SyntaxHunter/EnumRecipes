package org.jointheleague.enums;

import java.util.HashMap;
import java.util.Map;

public enum Coin {

    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private final int value;

    Coin(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    
    public static Map<Coin, Integer> getChange(int money) {
	    Map<Coin, Integer> change = new HashMap<>();

        Coin[] coinTypes = Coin.values();

        for(int i = coinTypes.length - 1; i >= 0; i--){
            int coinValue = coinTypes[i].getValue();
            int numCoins = money / coinValue;
            change.put(coinTypes[i], numCoins);
            money -= numCoins * coinValue;
        }

	return change;
    }

}
