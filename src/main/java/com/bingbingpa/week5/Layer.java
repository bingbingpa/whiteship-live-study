package com.bingbingpa.week5;

public class Layer {

    int layerId;
    String layerName;

    public Layer() {
        this(0, null);
    }

    public Layer(int layerId) {
        this(layerId, null);
    }

    public Layer(String layerName) {
        this(0, layerName);
    }

    public Layer(int layerId, String layerName) {
        this.layerId = layerId;
        this.layerName = layerName;

    }

    public Layer getLayerInstance() {
        return this;
    }

    public int getLayerId() {
        return layerId;
    }

    public String getLayerName() {
        return layerName;
    }
}
