/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Fruit {
    private String fruitId;
    private String name;
    private double price;
    
    public Fruit(String fruitId, String name, double price){
        this.fruitId = fruitId;
        this.name = name;
        this.price = price;
    }

    public String getFruitId() {
        return fruitId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Fruit{" + "fruitId = " + fruitId + ", name = " + name + ", price = " + price + '}';
    }
    
    

}
