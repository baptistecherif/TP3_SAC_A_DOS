import java.io.FileNotFoundException;

public class Main {

    public static void main (String[] args) throws FileNotFoundException {
        Backpack backpack = new Backpack("src/resources/sac0.txt");
        backpack.display();
    }
}