package entities;

public class Employee {

    // ATRIBUTOS
    private String name;
    private Integer hours;
    private Double valuePerHour;
    // ATRUTIS

    // CONSTRUTORES 
    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public Integer getHours() {
        return hours;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    public Double getValuePerHour() {
        return valuePerHour;
    }
    // ENCAPSULAMENTO

    // METODOS
    public Double payment() {
        Double total = getHours() * getValuePerHour();
        return total;
    }
    // METODOS

}