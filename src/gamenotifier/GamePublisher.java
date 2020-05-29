/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenotifier;

/**
 *
 * @author jaipal
 */
import java.util.*;


public class GamePublisher {
    //list of observers 
    private List<Subscriber> Subscribers = new ArrayList<Subscriber>();
    private String state;
    
    public String getState(){
	// send state 
        return state;
    }
    
    public void setState(String state){
	// set new state like game release,etc and notify to subscribers
        this.state = state;
        notifySubscribers();
    }
    
    public void subscribe(Subscriber sub){
	// Add new subscribers in chain
        Subscribers.add(sub);
    }
    
    public void notifySubscribers(){
        Subscribers.forEach((subscriber) -> {
	// update all subscribers
            subscriber.update();
        });
    }
    
    public void unsubscribe(Subscriber sub){
	// unsubscribe from service
        Subscribers.remove(sub);
    }
    
    
}
