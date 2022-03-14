//package com.jc.exception;

//import com.jc.exception.bank.BankOnline;
//import com.jc.exception.exception.InvalidCardNumberException;
//import com.jc.exception.exception.NegativeSummaException;
//import com.jc.exception.exception.LimitMoneyException;
//import com.jc.exception.exception.NullArgException;

public class Test {
    public static void main(String[] args){
        BankOnline bankOnline = new BankOnline();
        BankOnline card = new BankOnline();
        try{
            bankOnline.send("1231123112311231", 1000.00);
            card.send("1971518106013457", 61200.21);
        } catch (InvalidCardNumberException exception){
            System.err.println("Проверьте правильность ввода карты");
        } catch (BlockCardsException exception){
            System.err.println("Невозможен перевод на заблокированную карту");
        } catch (NegativeSummaException exception){
            System.err.println("Введена отрицательная сумма перевода");
        } catch (LimitMoneyException exception){
            System.err.println("Превышен лимит в 50 000");
        } catch (NullArgException exception){
            System.err.println("Поле номер карты пусто или сумма перевода равна нулю");
        }
    }
}
