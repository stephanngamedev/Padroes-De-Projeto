package strategy.ducks;

import strategy.behaviors.fly.FlyWithWings;
import strategy.behaviors.quack.Quack;

/**
 *
 * @author Stephann
 */
public class MallardDuck extends Duck{
    
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
