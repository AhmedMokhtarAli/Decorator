    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author Ahmed Mokhter
 */
public class Decorator {

    public static void main(String[] args) {
        Sandwitch sandwitch=new Cheese(new Beef(new Cheese(new BasicSandwitch())));
        
        System.out.println("sandwitch cost : "+sandwitch.getCost()+"\n Sandwitch description : "+sandwitch.getDescription());
        
    }
}
