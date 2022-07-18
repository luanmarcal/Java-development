package dev.luanmarcal.app.models.machines;

import dev.luanmarcal.app.models.products.Coffee;
import dev.luanmarcal.app.models.products.HotDrink;

public class CoffeeMachine implements HotDrinkMachine{

    @Override
    public HotDrink makeDrink() {
        return new Coffee();
    }
}
