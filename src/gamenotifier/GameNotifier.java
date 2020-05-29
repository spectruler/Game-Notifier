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

public class GameNotifier {

    public static void main(String[] args) {
        // TODO code application logic here
        GamePublisher subject   = new GamePublisher();
        Observer observer1 = new Observer(subject);
        Observer2 observer2 = new Observer2(subject);
        
        // Case 1, both observers have subscribed 
        System.out.println("Case 1:-> both subscribers have subscribed");
        System.out.println("Let's publish new game ");
        subject.setState("Ori and t he Blind Forest");
        
        // Case 2, one subscriber unsubscribes 
        System.out.println("Case 2:-> one unsubscribed");
        observer2.requestUnsubscribe();
        System.out.println("Let's publish another game");
        subject.setState("Far Cry Primal");
    }
    
}