public class Laptop {
    public int memory = 256;
    public String brand = "Apple";
    public String colour = "black";
    public double weight;
    public int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "memory=" + memory +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
