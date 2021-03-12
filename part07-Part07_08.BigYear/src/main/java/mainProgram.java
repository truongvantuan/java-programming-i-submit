
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();

                Bird newBird = new Bird(name, latinName);
                birds.add(newBird);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();

                for (int i = 0; i < birds.size(); i++) {
                    if (birds.get(i).getName().equals(bird)) {
                        birds.get(i).observation();
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            }

            if (command.equals("All")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();

                for (int i = 0; i < birds.size(); i++) {
                    if (birds.get(i).getName().equals(bird)) {
                        System.out.println(birds.get(i));
                        break;
                    }
                }

            }
        }

    }

}
