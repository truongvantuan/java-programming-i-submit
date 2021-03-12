
public class Bird {

    private String name;
    private String latinName;
    private int count;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.count = 0;
    }

    public void observation() {
        this.count++;
    }

    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.count + " observations" ;
    }

}
