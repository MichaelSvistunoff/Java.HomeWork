package HomeWork006;

import java.util.Comparator;
import java.util.Objects;

public class Laptop implements Comparable<Laptop> {
    int id;
    String type;
    String brand;
    String model;
    String color;
    int ram;
    String video;
    String processor;
    boolean os;
    int storage;
    int price;


    @Override
    public String toString() {
        return String.format("id: %d / Type: %s / Brand: %s / Model: %s /" +
                " Color: %s / Ram: %d / Video: %s / Processor: %s / OS: %s / Storage: %d / Price: %d",
                id, type, brand, model, color, ram, video, processor, os, storage, price);
    }

    public Laptop(int id, String type, String brand, String model, String color, int ram, String video, String processor, boolean os, int storage, int price) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.video = video;
        this.processor = processor;
        this.os = os;
        this.storage = storage;
        this.price = price;
    }

    public Laptop() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id && ram == laptop.ram && os == laptop.os && storage == laptop.storage && price == laptop.price && Objects.equals(type, laptop.type) && Objects.equals(brand, laptop.brand) && Objects.equals(model, laptop.model) && Objects.equals(color, laptop.color) && Objects.equals(video, laptop.video) && Objects.equals(processor, laptop.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, brand, model, color, ram, video, processor, os, storage, price);
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getProcessor() {
        return processor;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    // Compare laptops by ID
    @Override
    public int compareTo(Laptop o) {
        return id - o.getId();
    }

    public int compareToPrie(Laptop o) {
        return price - o.getPrice();
    }

    public int compareToRam(Laptop o) {
        return ram - o.getRam();
    }
}
