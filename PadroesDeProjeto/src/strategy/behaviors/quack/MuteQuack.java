package strategy.behaviors.quack;

/**
 *
 * @author Stephann
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("...");
    }
}
