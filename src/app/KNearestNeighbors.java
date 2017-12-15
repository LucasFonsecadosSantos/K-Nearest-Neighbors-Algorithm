package app;

import model.Iris;
import model.IrisVirginica;
import model.IrisVersicolor;
import model.IrisSetosa;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class KNearestNeighbors {

    private List<Iris> flowerArray;
    private float[][] originalMatrix;
    private float[][] matrix80Percent;
    private float[][] matrix20Percent;
    private int[] randomValues;

    public KNearestNeighbors(List<Iris> flowerArray) {
        this.flowerArray = flowerArray;
        this.originalMatrix = new float[flowerArray.size()][4];
        this.matrix80Percent = new float[calculate80Percent(flowerArray.size())][4];
        this.matrix20Percent = new float[calculate20Percent(flowerArray.size())][4];
        //this.randomValues = new int[calculate20Percent(flowerArray.size())];
        generateRandomValues(this.flowerArray.size());
        //for(int i=0;i<randomValues.length;i++) {
        //    System.out.print(randomValues[i] + " ");
        //}
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
        /**
         * 
         * fazer um for de 0 a original matrix lenght,
         * dentro disso, um foreach percorrendo random values
         * se o i do primeiro for for igual ao elemento do ramdom value
         * percorrido, entao colocar a linha atual na matrix 20, caso contrario
         * colocar na 80.
         */
    }

    private int calculate80Percent(int value) {
        System.out.println((int)0.2*value);
        return Math.round(0.2*value);
    }

    private int calculate20Percent(int value) {
        return (0.8*value);
    }

    private void generateRandomValues(int end) {
        
        int numero;
        int[] num = new int[calculate20Percent(this.flowerArray.size())];
        //System.out.println(calculate20Percent(this.flowerArray.size()));
        Random r = new Random();
        for(int i=0; i<num.length; i++){
             numero = r.nextInt(end) + 0;
             for(int j=0; j<num.length; j++){
                   if(numero == num[j] && j != i){
                         numero = r.nextInt(end) + 0;
                   }else{
                        num[i] = numero;
                   }
             }
        }
        //Apresentar na tela o resultado
        for(int i=0; i<num.length; i++){
             System.out.print(num[i]+"  ");
             if(i%5==0){
                 System.out.println();
             }
        }

    }

}