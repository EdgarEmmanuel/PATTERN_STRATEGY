package panier;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PayByPaypal implements  PayMethod {
    @Override
    public boolean pay(int amount) {
        if(true){
            System.out.println("Paying "+amount+" using Paypal");
            return true;
        }else {
            return false;
        }
    }











}
