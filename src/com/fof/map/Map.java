package com.fof.map;

import com.fof.graphics.IDrawable;
import com.fof.graphics.layer;
import com.fof.graphics.layersProvider;

public class Map extends layer implements IDrawable {
    public Map(String name, int id) {
        super(name, id, layersProvider.INSTANCE);
    }

    @Override
    public void draw() {
        // Draw Method When call time to draw.

    }
}