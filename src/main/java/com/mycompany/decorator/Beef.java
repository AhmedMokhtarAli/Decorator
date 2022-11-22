/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author Ahmed Mokhter
 */
public class Beef extends SandwitchDecorator{

    public Beef(Sandwitch sandwitch) {
        super(sandwitch);
    }
    
    @Override
    public int getCost()
    {
        return super.getCost()+5;
    }
   
    @Override
    public String getDescription()
    {
        return super.getDescription() + " with Beef";
    }
}
