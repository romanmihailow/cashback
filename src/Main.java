public class Main {
    public static void main(String[] args) {



        int score = 100; // Баланс счета клиента
        int cash = 1100;  // Сумма пополнения
        int bonus = 0 ;  // Бонусных рублей на счете

        if (cash >= 1000) {
            bonus = cash / 100;
            score = score + cash + bonus;


        } else {
            score = score + cash;
        }

        System.out.println("Баланс счета:" + score );
        System.out.print("Бонусных рублей на счете:" + bonus );


    }


 


}