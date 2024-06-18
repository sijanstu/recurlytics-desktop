package com.sijanstu.recurlytics.components;

import javax.swing.*;

public class EffectOption {

    protected float effectAlpha = 1f;
    protected boolean effectFadeOut = false;
    protected Icon[] randomEffect;

    public EffectOption setEffectAlpha(float effectAlpha) {
        this.effectAlpha = effectAlpha;
        return this;
    }

    public EffectOption setEffectFadeOut(boolean effectFadeOut) {
        this.effectFadeOut = effectFadeOut;
        return this;
    }

    public EffectOption setRandomEffect(Icon[] randomEffect) {
        this.randomEffect = randomEffect;
        return this;
    }
}

