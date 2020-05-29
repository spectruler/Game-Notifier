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

public class Observer2 extends Subscriber{
    
     public Observer2(GamePublisher publisher){
        this.publisher = publisher;
        this.publisher.subscribe(this);
    }
    
    @Override
    public void update(){
	// notify to observer about new updates
        System.out.println("Abdul Rehman: New game "+publisher.getState() + " has been released");
    }

    @Override
    public void requestUnsubscribe() {
	// unsubscribe service
        publisher.unsubscribe(this);
    }
    
    
}
