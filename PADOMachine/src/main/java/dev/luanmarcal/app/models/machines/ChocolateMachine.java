package dev.luanmarcal.app.models.machines;

import dev.luanmarcal.app.models.products.Chocolate;
import dev.luanmarcal.app.models.products.HotDrink;

public class ChocolateMachine implements HotDrinkMachine {
    @Override
    public HotDrink makeDrink() {
        return new Chocolate();
    }
}
