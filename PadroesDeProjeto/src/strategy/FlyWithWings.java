/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Stephann
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("flying");
    }
}
