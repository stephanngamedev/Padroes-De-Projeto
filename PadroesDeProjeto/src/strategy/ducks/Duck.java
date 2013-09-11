package strategy.ducks;

import strategy.behaviors.fly.FlyBehavior;
import strategy.behaviors.quack.QuackBehavior;

/**
 *
 * @author Stephann
 */
public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    
    public abstract void display();
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void setQuackBehavior( QuackBehavior quackBehavior ){
        this.quackBehavior = quackBehavior;
    }
    
    public void setFlyBehavior( FlyBehavior flyBehavior ){
        this.flyBehavior = flyBehavior;
    }
}
