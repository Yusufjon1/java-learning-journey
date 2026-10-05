package Lesson13.Homework3;

public class TexnikaApp {
    static void main(String[] args) {

        Telefon telefon = new Telefon();
        telefon.work();
        telefon.turnOff();
        telefon.turnOn();

        Mashina mashina = new Mashina();
        mashina.work();
        mashina.turnOff();
        mashina.turnOn();

        Televizor televizor = new Televizor();
        televizor.work();
        televizor.turnOff();
        televizor.turnOn();

        Texnika texnika = new Mashina();
        texnika.work();

        Texnika texnika1 = new Telefon();
        texnika1.work();

        Texnika texnika2 = new Televizor();
        texnika2.work();


    }
}
