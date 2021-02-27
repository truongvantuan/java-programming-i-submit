
public class Main {

    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift book1 = new Gift("Tuan", 1995);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);

        Package gifts = new Package();

        gifts.addGift(book);
        gifts.addGift(book1);

        System.out.println(gifts.totalWeight());
    }

    // use this main method to try out your classes!
}
