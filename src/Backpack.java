import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Backpack {
    private BufferedReader backpack;
    private String pmax;
    private List<String> weightObject;


    public Backpack(String filename) throws FileNotFoundException {
        file file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        this.backpack = br;
    }

    public void ReadPmax{
        this.pmax = backpack.readLine();
    }

    public void ReadWeightObject{
        this.weightObject = backpack.readLine()
    }

    public void display(){
        ReadPmax();
        this.backpack.close();


    }


}
