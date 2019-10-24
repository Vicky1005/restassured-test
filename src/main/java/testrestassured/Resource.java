package testrestassured;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.Objects;

@JsonAutoDetect
public class Resource {

    private int id;
    private String name;
    private int year;
    private String color;
    @JsonProperty("pantone_value")
    private String pantoneValue;




    public Resource() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPantoneValue() {
        return pantoneValue;
    }

    public void setPantoneValue(String pantoneValue) {
        this.pantoneValue = pantoneValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return id == resource.id &&
                year == resource.year &&
                Objects.equals(name, resource.name) &&
                Objects.equals(color, resource.color) &&
                Objects.equals(pantoneValue, resource.pantoneValue);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getYear(), getColor(), getPantoneValue());
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", name='" + name +
                ", year=" + year +
                ", color='" + color +
                ", pantoneValue='" + pantoneValue +
                '}';
    }
}
