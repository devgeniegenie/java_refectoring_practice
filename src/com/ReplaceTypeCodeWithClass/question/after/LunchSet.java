package com.ReplaceTypeCodeWithClass.question.after;

public class LunchSet {
    private final LunchType _lunchType;
    private final DrinkType _drinkType;

    public LunchSet(LunchType _lunchType, DrinkType _drinkType) {
        this._lunchType = _lunchType;
        this._drinkType = _drinkType;
    }

    @Override
    public String toString() {
        return "LunchSet{" +
                "_lunchType=" + _lunchType +
                ", _drinkType=" + _drinkType +
                '}';
    }
}
