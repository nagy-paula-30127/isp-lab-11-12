/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aut.utcluj.isp.ex4;

/**
 *
 * @author mihai.hulea
 */
public class Drone {
    
    private Engine engine;
    private int altitude;
    
    /**
     * Drone can work only with an engine.
     */
    public void goUp(){
        engine.start();
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void goDown() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getAltitude() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public void startEngine(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Engine hasEngine(){
        return engine;
    }
}
