package model;

public abstract class Iris {

    private float sepalWidth;
    private float sepalLenght;
    private float petalWidth;
    private float petalLenght;

    public Iris(float sepalWidth, float sepalLenght, float petalWidth, float petalLenght) {
        setSepalLenght(sepalLenght);
        setSepalWidth(sepalWidth);
        setPetalWidth(petalWidth);
        setPetalLenght(petalLenght);
    }

    public float getSepalLenght() {
        return this.sepalLenght;
    }

    public void setSepalLenght(float value) {
        this.sepalLenght = value;
    }

    public float getSepalWidth() {
        return this.sepalWidth;
    }

    public void setSepalWidth(float value) {
        this.sepalWidth = value;
    }

    public float getPetalWidth() {
        return this.petalWidth;
    }

    public void setPetalWidth(float value) {
        this.petalWidth = value;
    }

    public float getPetalLenght() {
        return this.petalLenght;
    }

    public void setPetalLenght(float value) {
        this.petalLenght = value;
    }
}