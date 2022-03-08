package com.jc.exception.bank;

import com.jc.exception.exception.InvalidCardNumberException;
import com.jc.exception.exception.NegativeSummaException;
import com.jc.exception.exception.LimitMoneyException;
import com.jc.exception.exception.NullArgException;

public class BankOnline {
    public void send (String cardNumber, double money){
        if (cardNumber.replaceAll(" ", "").length() != 16){
            throw new InvalidCardNumberException("Карта введена неверно");
        }
        if (money < 0) {
            throw new NegativeSummaExeption("Введена отрицательная сумма");
        }
        if (money > 50000) {
            throw new LimitMoneyExeption("Превышен лимит карты");
        }
        if ((money == 0) || (cardNumber == "")){
            throw new NullArgExeption("Один из аргументов равен null");
        }

        System.out.println("Операция прошла успешно");
    }
}
