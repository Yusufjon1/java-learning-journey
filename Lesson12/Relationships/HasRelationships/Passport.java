package Relationships.HasRelationships;

public class Passport {

    private String serial;
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Passport(String serial, String number) {
        this.serial = serial;
        this.number = number;
    }
}
