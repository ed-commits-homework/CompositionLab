public abstract class Vehicle {

    private String name;
    private Double price;

    public Vehicle(String name, Double price){
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
