package Relationships.HasRelationships;

public class Heart {

    private int beatsCount;

    public Heart(int beatsCount) {
        this.beatsCount = beatsCount;
    }

    @Override
    public String toString() {
        return "Heart{" +
                "beatsCount=" + beatsCount +
                '}';
    }
}
