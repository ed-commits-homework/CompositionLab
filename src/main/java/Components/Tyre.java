package Components;

import Interfaces.ICost;

public class Tyre implements ICost {
    TyreType tyreType;

    public Tyre(TyreType tyreType) {
        this.tyreType = tyreType;
    }

    public TyreType getType() {
        return this.tyreType;
    }

    public double cost() {
        return tyreType.cost();
    }
}
