
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program

        Person tuan1 = new Person("tuan", new SimpleDate(8, 2, 1995), 55, 158);
        Person tuan2 = new Person("tuan", new SimpleDate(80, 2, 1995), 55, 158);

        System.out.println(tuan1.equals(tuan2));
    }
}
