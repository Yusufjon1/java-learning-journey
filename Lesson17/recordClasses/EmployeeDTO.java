package Lesson17.recordClasses;

import java.time.LocalDate;
import java.util.Objects;

/*
* DTO -> Data Transfer Object
* */
public class EmployeeDTO {
    private Integer id;
    private String fullName;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTO that = (EmployeeDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(fullName, that.fullName) && Objects.equals(hiredDate, that.hiredDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, hiredDate);
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", hiredDate=" + hiredDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    public EmployeeDTO(Integer id, String fullName, LocalDate hiredDate) {
        this.id = id;
        this.fullName = fullName;
        this.hiredDate = hiredDate;
    }

    private LocalDate hiredDate;
}
