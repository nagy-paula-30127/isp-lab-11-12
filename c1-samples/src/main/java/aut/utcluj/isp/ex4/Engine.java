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
public class Engine {
    public final static int MAX_SPEED = 10;
    private boolean started;
    private int speed;
    
    public void start(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void stop(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void increaseSpeed(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void decreaseSpeed(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public boolean isStarted(){return false;}
}
