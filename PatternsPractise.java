/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternspractise;

/**
 *
 * @author Hamza Baig
 */
public class PatternsPractise {

    
    public static void main(String[] args) {
        // TODO code application logic here
        MallardDuck md=new MallardDuck();
        FlyBehavior fd=new FlyWithWings();
        QuackBehavior q=new Quack();
        md.setFlyBehavior(fd);
        md.setQuackBehavior(q);
        md.display();
        md.performFly();
        md.performQuack();
    }
    
}
