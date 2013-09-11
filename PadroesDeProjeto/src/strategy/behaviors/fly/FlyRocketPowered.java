package strategy.behaviors.fly;

/**
 *
 * @author Stephann
 */
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("flying with a rocket");
    }
}
