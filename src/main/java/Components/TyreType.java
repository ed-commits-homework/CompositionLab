package Components;

import Interfaces.ICost;

public enum TyreType implements ICost {
    SPORT,
    OFFROAD,
    NORMAL;

    public double cost() {
        switch(this) {
            case SPORT:
                return 220;
            case OFFROAD:
                return 260;
            case NORMAL:
                return 170;
        }
        return 0;
    }
}
