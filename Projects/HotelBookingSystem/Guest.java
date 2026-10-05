package Projects.HotelBookingSystem;

public class Guest {
    private String fullName1;
    private String passportId;
    private String phoneNumber;

    public String getFullName1() {
        return fullName1;
    }

    public void setFullName1(String fullName) {
        this.fullName1 = fullName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Guest() {
    }

    public Guest(String fullName1, String passportId, String phoneNumber) {
        this.fullName1 = fullName1;
        this.passportId = passportId;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "fullName1='" + fullName1 + '\'' +
                ", passportId='" + passportId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
