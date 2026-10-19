package Lesson18.hw2;


public class Phone {
    private String name;
    private Model model;
    private int storage;

    public Phone(String name, Model model, int storage) {
        this.name = name;
        this.model = model;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public Model getModel() {
        return model;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", storage=" + storage +
                '}';
    }
}
