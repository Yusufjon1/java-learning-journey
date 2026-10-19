package Lesson17.recordClasses;

import java.time.LocalDate;

public record EmployeeRecord(Integer id, String fullName, LocalDate hiredDate) {

    public EmployeeRecord (Integer id, String fullName, LocalDate hiredDate) {

        if (id < 0 ) {
            throw new IllegalArgumentException("ID can not be negative");
        }

        this.id = id;
        this.fullName = fullName;
        this.hiredDate = hiredDate;
    }

    public static String mark = "✅";

    public String json() {
        return "{id: %d, full_name: %s, hired_date: %s }".formatted(id, fullName, hiredDate);
    }
}
