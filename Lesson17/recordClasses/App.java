package Lesson17.recordClasses;

import java.time.LocalDate;

public class App {
    static void main(String[] args) {
        LocalDate hiredDate = LocalDate.of(2026, 10, 6);
       /* EmployeeDTO employeeDTO = new EmployeeDTO(1, "Mrom mromonov", hiredDate);

        LocalDate hiredDate1 = LocalDate.of(2026, 10, 6);
        EmployeeRecord employeeRecord = new EmployeeRecord(11, "mirazam dotachi", hiredDate1);
        System.out.println(employeeDTO);
        System.out.println(employeeRecord.json());*/

        EmployeeRecord employeeRecord = new EmployeeRecord(-1, "mirazam dotachi", hiredDate);
    }
}
