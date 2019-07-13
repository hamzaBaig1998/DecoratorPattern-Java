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
public class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    void display(){
        System.out.println("I'm a duck!");
    }
    void performFly(){
        flyBehavior.fly();
    }
    void performQuack(){
        quackBehavior.quack();
    }
    protected void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior=flyBehavior;
    }
    protected void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior=quackBehavior;
    }
}
