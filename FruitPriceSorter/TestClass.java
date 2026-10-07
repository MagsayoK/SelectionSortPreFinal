package FruitPriceSorter;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TestClass {
    
     public static void displayFruits(Fruit[]fruits, String title){
         System.out.println("\n" + title);
         System.out.println("--------------------------------");
         for (Fruit f : fruits){
             System.out.println(f);
        }
     }
     public static void main(String[] args) {
       Fruit[] fruits = {
          new Fruit("G100", "Grapes", 45.9), new Fruit("B100", "Banana", 33.7), new Fruit("A344", "Apple", 25.0), new Fruit("M120", "Mango", 120.0),
          new Fruit("DF200", "Dragon Fruit", 130), new  Fruit("P504", "Papaya", 110.2), new Fruit("D213", "Durian", 60.50), new Fruit("CN96", "Coconut", 28.0)  
       } ;
        System.out.println("=====FRUIT BEFORE SORTING=====");
        displayFruits(fruits, "List of fruits before sorting");
        SelectionSort.selectionSort(fruits);
        
        displayFruits(fruits,"List of fruits after sorting");
         System.out.println("\nTop 3 Cheapest fruits");
        System.out.println("---------------------------------");
        for (int i = 0; i < 3; i++){
            System.out.println((i+ 1) +"." + fruits[i]);
        }      
    }
}
