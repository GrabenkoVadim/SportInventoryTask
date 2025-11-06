package org.example;

public class SportInventory {
    private String name;         // назва інвентарю
    private String category;     // вид спорту
    private double price;        // ціна інвентарю
    private double weight;       // вага інвентарю
    private int durability;      // міцність (0–100)

    public SportInventory(String name, String category, double price, double weight, int durability) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.weight = weight;
        this.durability = durability;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public double getWeight() { return weight; }
    public int getDurability() { return durability; }

    @Override
    public String toString() {
        return String.format("%s (%s): price=%.2f, weight=%.1f, durability=%d",
                name, category, price, weight, durability);
    }

    // метод для порівняння на рівність усіх полів
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SportInventory other)) return false;
        return name.equals(other.name)
                && category.equals(other.category)
                && price == other.price
                && weight == other.weight
                && durability == other.durability;
    }

}
