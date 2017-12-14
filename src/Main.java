import app.KNearestNeighbors;
import utilies.DAO;
import utilies.Parser;
import model.Iris;
import model.IrisVirginica;
import model.IrisSetosa;
import model.IrisVersicolor;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        if(args.length > 0) {
            DAO dao = new DAO(args[0]);
            Parser parser = new Parser();
            List<String> array = dao.loadData();
            List<Iris> flowerArray = new ArrayList<Iris>();

            for(String s : array) { 
                String[] tokens = parser.getTokens(s);
                if(tokens[tokens.length - 1].equals("Iris-virginica")) {
                    flowerArray.add(new IrisVirginica(Float.parseFloat(tokens[0]), Float.parseFloat(tokens[1]), Float.parseFloat(tokens[2]), Float.parseFloat(tokens[3])));
                }else if(tokens[tokens.length - 1].equals("Iris-setosa")) {
                    flowerArray.add(new IrisSetosa(Float.parseFloat(tokens[0]), Float.parseFloat(tokens[1]), Float.parseFloat(tokens[2]), Float.parseFloat(tokens[3])));
                }else if(tokens[tokens.length - 1].equals("Iris-versicolor")) {
                    flowerArray.add(new IrisVersicolor(Float.parseFloat(tokens[0]), Float.parseFloat(tokens[1]), Float.parseFloat(tokens[2]), Float.parseFloat(tokens[3])));
                }
            }

            KNearestNeighbors knn = new KNearestNeighbors(flowerArray);

        }else {
            //imprimir erro;
        }
    
    }
}

