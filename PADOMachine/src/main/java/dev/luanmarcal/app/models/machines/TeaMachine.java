package dev.luanmarcal.app.models.machines;

import dev.luanmarcal.app.models.products.HotDrink;
import dev.luanmarcal.app.models.products.Tea;

public class TeaMachine implements HotDrinkMachine{

    @Override
    public HotDrink makeDrink() {
        return new Tea();
    }
}
