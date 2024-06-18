package com.sijanstu.recurlytics.components;

import com.formdev.flatlaf.extras.FlatSVGIcon;


import javax.swing.*;
import java.awt.*;

public class AlertsOption {

    protected Icon icon;
    protected Color baseColor;

    protected boolean loopAnimation;

    protected EffectOption effectOption;

    public AlertsOption(Icon icon, Color baseColor) {
        this.icon = icon;
        this.baseColor = baseColor;
    }

    public AlertsOption setEffectOption(EffectOption effectOption) {
        this.effectOption = effectOption;
        return this;
    }

    public AlertsOption setLoopAnimation(boolean loopAnimation) {
        this.loopAnimation = loopAnimation;
        return this;
    }
    protected static AlertsOption getAlertsOption(MessageAlerts.MessageType messageType) {
        if (null == messageType) {
            return getDefaultOption("raven/alerts/icon/information.svg", null);
        } else switch (messageType) {
            case SUCCESS:
            {
                Icon[] effects = new Icon[]{
                    new FlatSVGIcon("raven/alerts/effect/check.svg"),
                    new FlatSVGIcon("raven/alerts/effect/star.svg"),
                    new FlatSVGIcon("raven/alerts/effect/firework.svg"),
                    new FlatSVGIcon("raven/alerts/effect/balloon.svg")
                };
                return getDefaultOption("raven/alerts/icon/success.svg", Color.decode("#10b981"), effects);
            }
            case WARNING:
            {
                Icon[] effects = new Icon[]{
                    new FlatSVGIcon("raven/alerts/effect/disclaimer.svg"),
                    new FlatSVGIcon("raven/alerts/effect/warning.svg"),
                    new FlatSVGIcon("raven/alerts/effect/query.svg"),
                    new FlatSVGIcon("raven/alerts/effect/mark.svg")
                };
                return getDefaultOption("raven/alerts/icon/warning.svg", Color.decode("#f59e0b"), effects);
            }
            case ERROR:
            {
                Icon[] effects = new Icon[]{
                    new FlatSVGIcon("raven/alerts/effect/error.svg"),
                    new FlatSVGIcon("raven/alerts/effect/sad.svg"),
                    new FlatSVGIcon("raven/alerts/effect/shield.svg"),
                    new FlatSVGIcon("raven/alerts/effect/nothing.svg")
                };
                return getDefaultOption("raven/alerts/icon/error.svg", Color.decode("#ef4444"), effects);
            }
            default:
                return getDefaultOption("raven/alerts/icon/information.svg", null);
        }
    }

    private static AlertsOption getDefaultOption(String icon, Color color, Icon[] effects) {
        AnimateIcon.AnimateOption option = new AnimateIcon.AnimateOption()
                .setInterpolator(EasingInterpolator.EASE_OUT_BOUNCE)
                .setScaleInterpolator(new KeyFrames(1f, 1.5f, 1f))
                .setRotateInterpolator(new KeyFrames(0f, (float) Math.toRadians(-30f), 0f));
        return new AlertsOption(new AnimateIcon(icon, 4f, option), color)
                .setEffectOption(new EffectOption()
                        .setEffectAlpha(0.9f)
                        .setEffectFadeOut(true)
                        .setRandomEffect(effects))
                .setLoopAnimation(true);
    }

    public static AlertsOption getDefaultOption(String icon, Color color) {
        AnimateIcon.AnimateOption option = new AnimateIcon.AnimateOption()
                .setScaleInterpolator(new KeyFrames(1f, 1.2f, 1f))
                .setRotateInterpolator(new KeyFrames(0f, (float) Math.toRadians(-30), (float) Math.toRadians(30), 0f));
        return new AlertsOption(new AnimateIcon(icon, 4f, option), color)
                .setLoopAnimation(true);
    }
}
