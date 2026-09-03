package Homework.com.pdp.online.task.number;

public class Rectangle {

    private int width;
    private int height;
    private int result;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


    public void calculate() {
        result = width * height;
        System.out.println(width + " * " + height + " = " + result);
    }
}
