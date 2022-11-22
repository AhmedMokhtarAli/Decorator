/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author Ahmed Mokhter
 */
public class SandwitchDecorator implements Sandwitch {
    Sandwitch sandwitch;
    public SandwitchDecorator(Sandwitch sandwitch){
        this.sandwitch =sandwitch;
    } 
    @Override
    public int getCost() {
        return this.sandwitch.getCost();
    }

    @Override
    public String getDescription() {
        return this.sandwitch.getDescription();
    }
    
}
