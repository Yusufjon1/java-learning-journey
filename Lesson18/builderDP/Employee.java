package Lesson18.builderDP;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String fatherName;
    private Integer age;
    private String email;
    private String phoneNumber;
    private String position;



   public static Builder builder() {
       return new Builder();
   }


    public Employee(String id, String firstName, String lastName, String fatherName, Integer age, String email, String phoneNumber, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String firstName;
        private String lastName;
        private String fatherName;
        private Integer age;
        private String email;
        private String phoneNumber;
        private String position;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder fatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Employee build() {
            return new Employee(this.id,
                    this.firstName,
                    this.lastName,
                    this.fatherName,
                    this.age,
                    this.email,
                    this.phoneNumber,
                    this.position);
        }
    }
}
