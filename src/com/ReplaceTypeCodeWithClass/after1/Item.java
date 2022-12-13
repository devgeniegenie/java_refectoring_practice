package com.ReplaceTypeCodeWithClass.after1;

public class Item {
    private final ItemType _itemType;
    private final String _title;
    private final int _price;

    public Item(ItemType _itemType, String title, int price) {
        this._itemType = _itemType;
        this._title = title;
        this._price = price;
    }

    public String getTitle() {
        return _title;
    }

    public int getPrice() {
        return _price;
    }

    public String toString() {
        return "[ " + _itemType.getTypecode() + ", " + getTitle() + ", " + getPrice() +" ]";
    }
}
