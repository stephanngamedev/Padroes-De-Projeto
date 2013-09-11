package strategy.behaviors.quack;

/**
 *
 * @author Stephann
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("squeak");
    }
}
