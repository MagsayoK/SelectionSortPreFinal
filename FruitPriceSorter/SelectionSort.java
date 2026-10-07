package FruitPriceSorter;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class SelectionSort {
    
    public static void selectionSort(Fruit[]fruits){
        int n = fruits.length;
      
        
        for (int i = 0; i < n - 1; i++){
        int minIndex = i;
        for (int j = i + 1; j < n; j++){
            if (fruits[j].getPrice() < fruits[minIndex].getPrice()){
                minIndex = j;
            }
        }
        Fruit temp = fruits[minIndex];
        fruits[minIndex] = fruits[i];
        fruits[i] = temp;
    }
   }
}
