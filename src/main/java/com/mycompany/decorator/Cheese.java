/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author Ahmed Mokhter
 */
public class Cheese  extends SandwitchDecorator{

    public Cheese(Sandwitch sandwitch) {
        super(sandwitch);
    }
    
    @Override
    public int getCost()
    {
        return super.getCost()+3;
    }
   
    @Override
    public String getDescription()
    {
        return super.getDescription() + " with Cheese";
    }
}
    

