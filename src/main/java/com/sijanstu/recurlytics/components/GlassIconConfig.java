package com.sijanstu.recurlytics.components;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.io.Serializable;
import java.util.Map;

/**
 * @author sijanstu
 */
@Setter
@Getter
public class GlassIconConfig implements Serializable {

    public GlassIconConfig(String name, float scale, int glassIndex, int blur, Map<Integer, String> colorMap, GlassShape glassShape) {
        this.name = name;
        this.scale = scale;
        this.glassIndex = glassIndex;
        this.blur = blur;
        this.colorMap = colorMap;
        this.glassShape = glassShape;
    }

    public GlassIconConfig() {
        this(null, 3f, 0, 5, null, new GlassShape(Color.decode("#0CA064"), new RoundRectangle2D.Double(2, 2, 10, 10, 5, 5), 45f));
    }

    private String name;
    private float scale = 1;
    private int glassIndex = 0;
    private int blur = 5;
    private Map<Integer, String> colorMap;
    private GlassShape glassShape;

    @Setter
    @Getter
    public static class GlassShape implements Serializable {

        public GlassShape(Color color, Shape shape, float rotate) {
            this.color = color;
            this.shape = shape;
            this.rotate = rotate;
        }

        public GlassShape() {
        }

        private Color color;
        private Shape shape;
        private float rotate;
    }
}
