
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter();
        System.out.println(counter.value());

        counter.increase();
        System.out.println(counter.value());
        
        counter.increase(10);
        System.out.println(counter.value());
    }
}
