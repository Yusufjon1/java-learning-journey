package Homework.Task4;

public class Kugelschreiber {
    private int quantity;
    private boolean isClicked;
    private int oneLetter = 1;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isClicked() {
        return isClicked;
    }

    public void setClicked(boolean clicked) {
        this.isClicked = clicked;
    }

    public double getOneLetter() {
        return oneLetter;
    }

    public void setOneLetter(int oneLetter) {
        this.oneLetter = oneLetter;
    }


    public void write(String text) {

        if (!isClicked) {
            System.out.println("Pencil has not opened yet");
            return;
        }

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            int neededInk;

            if (ch == ' ') {
                neededInk = 0;
            } else if (Character.isUpperCase(ch)) {
                neededInk = oneLetter * 2;
            } else {
                neededInk = oneLetter;
            }

            if (quantity >= neededInk) {
                quantity -= neededInk;
                result += ch;
            } else {
                System.out.println("Ink is out !");
                break;
            }
        }

        System.out.println("Written text: " + result);

    }
}
