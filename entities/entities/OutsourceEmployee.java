package entities;

public class OutsourceEmployee extends Employee{

    // ATRIBUTOS
    private Double additionalCharge;
    // ATRIBUTOS

    // CONSTRUTORES
    public OutsourceEmployee() {
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    public Double getAdditionalCharge() {
        return additionalCharge;
    }
    // ENCAPSULAMENTO

    // METODOS
    @Override
    public Double payment()  {
        Double total = super.payment() + additionalCharge + (additionalCharge * 0.10);
        return total; 
    }
    // METODOS
    
}
