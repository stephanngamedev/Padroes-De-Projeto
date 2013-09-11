package strategy.behaviors.fly;

/**
 *
 * @author Stephann
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("can't fly");  
    }
}
