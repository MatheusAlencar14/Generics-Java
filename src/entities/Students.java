package entities;

import java.util.Objects;

public class Students {

    private Character course;
    private Integer number;

    public Students(Character course, Integer number) {
        this.course = course;
        this.number = number;
    }

    public Character getCourse() {
        return course;
    }

    public void setCourse(Character course) {
        this.course = course;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        return Objects.equals(number, students.number);
    }

    @Override
    public int hashCode() {
        return number != null ? number.hashCode() : 0;
    }
}
