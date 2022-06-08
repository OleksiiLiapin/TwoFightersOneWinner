

public class Main {
    public static void main(String[] args) {
        Fighter lew = new Fighter("Lew", 10, 2);
        Fighter harry = new Fighter("Harry", 5, 4);

        Fighter andrew = new Fighter("Andrew", 12, 7);
        Fighter mike = new Fighter("Mike", 8, 4);

        Fighter alex = new Fighter("Alex", 11, 5);
        Fighter endy = new Fighter("Endy", 2, 4);

        String message = Fighter.declareWinner(harry, lew, "HaRry");
        System.out.println(message);
        message = Fighter.declareWinner(andrew, mike, "Andrew");
        System.out.println(message);
        message = Fighter.declareWinner(endy, alex, "Alex");
        System.out.println(message);



    }
}
