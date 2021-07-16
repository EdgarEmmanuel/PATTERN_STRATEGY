package panier;


import java.util.Scanner;

public class PayByCard implements PayMethod {
    @Override
    public boolean pay(int amount) {
        if(true){
            System.out.println("Paying "+amount+" using credit card");
            return true;
        }else {
            return false;
        }
    }







}
