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

// imports 
import java.util.*;

/**
 *
 * @author jaipal
 */
public abstract class Subscriber{
     protected GamePublisher publisher;
     public abstract void update();
     public abstract void requestUnsubscribe();
}

