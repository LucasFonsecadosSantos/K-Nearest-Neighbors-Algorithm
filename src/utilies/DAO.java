package utilies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class DAO implements Serializable {

    private final String fileName;

    public DAO(String fileName) {
        this.fileName = fileName;
    }

    public List<String> loadData() {
        List<String> arrayData = new ArrayList<String>();
        try {
            File file = new File(this.fileName);
            if(file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(this.fileName));
                String s = br.readLine();
                while(!s.isEmpty()) {
                    arrayData.add(s);
                    s = br.readLine();
                }
            }else {
                //arquivo nao existe, impormit errro
            }
            
        } catch(Exception e) {
            System.out.println(e.toString());
        }
        return arrayData;
    }


}