package com.ReplaceTypeCodeWithClass.question;

public class AfterLunchSet {
    public final LunchType _lunchType;
    public final DrinkType _drinkType;

    public AfterLunchSet(LunchType _lunchType, DrinkType _drinkType) {
        this._lunchType = _lunchType;
        this._drinkType = _drinkType;
    }

    enum LunchType {
        A, B, C
    }

    enum DrinkType {
        COFFEE, JUICE, TEA
    }


}
