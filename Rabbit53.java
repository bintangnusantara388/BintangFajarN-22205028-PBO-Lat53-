/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rabbit53;

/**
 *
 * @author 
 * Nama : Bintang Fajar Nusantara 
 * Nim : 22205028
 * Prodi : Teknik Informatika/22
 * Deskripsi Program : Program ini berisi tentang deskripsi tentang kelinci. 
 */

public class Rabbit53 {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    public Rabbit53(boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
      public boolean isVegetarian(){
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
}

class Rabbit extends Rabbit53 {

    private final String color;
    private final String name;
   
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.name = name;
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
        this.color = color;
        
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
  
}
    
    public static void main(String[] args) {
        Rabbit53 rabbitInstance = new Rabbit53(true, "Carrot", 4);
        Rabbit tank = rabbitInstance.new Rabbit("Peter", false, "Grass", 4, "grey");
        System.out.println("Hello, his name is " + tank.getName());
        System.out.println(tank.getName() + " is Vegetarian? " + tank.isVegetarian());
        System.out.println(tank.getName() + " eats " + tank.getEats());
        System.out.println(tank.getName() + " has " + tank.getNoOfLegs() + " legs");
        System.out.println(tank.getName() + " color is " + tank.getColor());

    }
    
}
