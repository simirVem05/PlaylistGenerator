import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Study {
    public void generate(int songCount){
        String file = "src\\Spotify dataset_exportd.csv";
        BufferedReader reader = null;
        String line = "";
        ArrayList<String> collection = new ArrayList<>();

        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                String[] trackData = line.split("\",\"");
                String energyStr = trackData[5];
                String speechStr = trackData[7];
            }
        }
        catch(Exception e){

        }
        finally{
            
        }
    }
}
