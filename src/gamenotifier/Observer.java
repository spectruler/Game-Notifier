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
public class Observer extends Subscriber {
    public Observer(GamePublisher publisher){
        this.publisher = publisher;
        this.publisher.subscribe(this);
    }
    
    @Override
    public void update(){
	// update
        System.out.println("Jaipal: New game "+publisher.getState() + " has been released");
    }

    @Override
    public void requestUnsubscribe() {
	// unsubsribe 
        publisher.unsubscribe(this);
    }
    
}
