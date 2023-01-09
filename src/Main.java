public class Main {
    public static void main(String[] args) {



        int score = 100; // Баланс счета клиента
        int upScore = 100; // сумма пополнения
        int bonus = 1 ; // Бонус на каждые 100 рублей при пополнении баланса от 1000 руб.

        if (upScore >= 1000) score = score + upScore + ( upScore / 100 );

        else score = score + upScore;

        System.out.println("Баланс счета:" + score );
        System.out.print("Бонусных рублей:" + (upScore / 100) );


    }





}