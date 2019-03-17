import java.util.Objects;

public class Patient {
    private String name;
    private String surName;
    private String city;


    public Patient(String name, String surName, String city) {
        this.name = name;
        this.surName = surName;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(name, patient.name) &&
                Objects.equals(surName, patient.surName) &&
                Objects.equals(city, patient.city);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surName, city);
    }
}
