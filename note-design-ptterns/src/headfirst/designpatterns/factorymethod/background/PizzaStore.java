package headfirst.designpatterns.factorymethod.background;

import headfirst.designpatterns.factorymethod.pizzas.CheesePizza;
import headfirst.designpatterns.factorymethod.pizzas.ClamPizza;
import headfirst.designpatterns.factorymethod.pizzas.PepperoniPizza;
import headfirst.designpatterns.factorymethod.pizzas.Pizza;

/**
 * @author: sjmp1573
 * @date: 2022/5/19 11:42
 * @description:
 */

public class PizzaStore {

    public PizzaStore() {
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("clam")){
            pizza = new ClamPizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else{
            pizza = null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
