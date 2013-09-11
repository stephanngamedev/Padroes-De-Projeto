package strategy;

import strategy.behaviors.fly.FlyRocketPowered;
import strategy.ducks.MallardDuck;
import strategy.ducks.Duck;
import strategy.ducks.ModelDuck;

/**
 *
 * @author Stephann
 */
public class MiniDuckSimulator {
    public static void main( String args [] ){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior( new FlyRocketPowered());
        model.performFly();
    }
}
