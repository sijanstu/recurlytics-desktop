package com.sijanstu.recurlytics.components;

public abstract class PopupController {

    private boolean consume;

    public boolean getConsume() {
        return consume;
    }

    public void consume() {
        consume = true;
    }

    public abstract void closePopup();
}
