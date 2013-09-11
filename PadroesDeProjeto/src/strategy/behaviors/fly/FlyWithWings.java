/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.behaviors.fly;

/**
 *
 * @author Stephann
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("flying with wings");
    }
}
