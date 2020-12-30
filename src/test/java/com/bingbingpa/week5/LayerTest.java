package com.bingbingpa.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LayerTest {

    @Test
    @DisplayName("this 테스트")
    void thisTest() {
        Layer layer1 = new Layer(1);
        Layer layer2 = new Layer("행정구역");

        System.out.println(layer1.getLayerId());
        System.out.println(layer2.getLayerName());

        Layer layer3 = new Layer(10, "테스트");
        Layer layer4 = layer3.getLayerInstance();

        assertThat(layer3).isEqualTo(layer4);
    }
}