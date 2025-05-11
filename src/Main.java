import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        SellersOfCarrot Seller1 =
               new SellersOfCarrot("John Williams", 28, LocalDate.of(1990,5,2), 67.78,false);

        SellersOfCarrot Seller2 =
                new SellersOfCarrot("Danny Elfmann", 106, LocalDate.of(1962,8,12), 289.23, true);



        System.out.println ("Seller " + Seller1.getName() + " who was born " + Seller1.getDateOfBirth() + " has made " + Seller1.getContracts() + " contracts and sold total amount of " + Seller1.getSoldCarrot() + " tons of carrot. His senior status is:" + Seller1.isSeniorOrNot() + ".");
        System.out.println ("Seller " + Seller2.getName() + " who was born " + Seller2.getDateOfBirth() + " has made " + Seller2.getContracts() + " ontracts and sold total amount of " + Seller2.getSoldCarrot() + " tons of carrot. His senior status is:" + Seller2.isSeniorOrNot() + ".");
    }
}