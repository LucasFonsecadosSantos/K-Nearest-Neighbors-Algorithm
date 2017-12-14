package app;

import model.Iris;
import model.IrisVirginica;
import model.IrisVersicolor;
import model.IrisSetosa;
import java.util.List;
import java.util.ArrayList;

public class KNearestNeighbors {

    private List<Iris> flowerArray;
    private float[][] originalMatrix;
    private float[][] matrix80Percent;
    private float[][] matrix20Percent;

    public KNearestNeighbors(List<Iris> flowerArray) {
        this.flowerArray = flowerArray;
        originalMatrix = new float[flowerArray.size()][4];
        matrix80Percent = new float[calculate80Percent(flowerArray.size())][4];
        matrix20Percent = new float[calculate20Percent(flowerArray.size())][4];
        startKNN();
    }

    public void startKNN() {
        int index = 0;
        for(Iris object : this.flowerArray) {
            Iris flower = null;
            if(object instanceof IrisVirginica) {
                flower = (IrisVirginica) object;
            }else if(object instanceof IrisSetosa) {
                flower = (IrisSetosa) object;
            }else if(object instanceof IrisVersicolor) {
                flower = (IrisVersicolor) object;
            }
            this.originalMatrix[index][0] = flower.getSepalWidth();
            this.originalMatrix[index][1] = flower.getSepalLenght();
            this.originalMatrix[index][2] = flower.getPetalWidth();
            this.originalMatrix[index][3] = flower.getPetalLenght();
            index++;
        }
        
    }

    private int calculate80Percent(int value) {
        return (0.8*value);
    }

    private int calculete20Percent(int value) {
        return (0.2*value);
    }
}