import panier.PayByCard;
import panier.PayByPaypal;
import panier.PayMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner saisir = new Scanner(System.in);
        int a;
        PayMethod pay ;
            do {
                System.out.println("faites un choix : ");
                System.out.println(" 1 - Paypal ");
                System.out.println(" 2 - Card ");
                a = Integer.parseInt(saisir.nextLine());
            }while(a!=1 && a!=2);

        System.out.println("Valeur de a : "+a);
        if(a==1){
           pay = new PayByPaypal();
           pay.pay(13000);
        }else{
            pay=new PayByCard();
            pay.pay(13000);
        }

    }
}
