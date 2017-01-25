package com.company.demo.web.screens;

import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Embedded;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Screen extends AbstractWindow {
    @Inject
    private Embedded image;

    private List<String> images = Arrays.asList(
            "theme://images/1.jpg",
            "theme://images/2.jpg",
            "theme://images/3.jpg",
            "theme://images/4.jpg",
            "theme://images/5.jpg"
    );

    private int index = 0;

    @Override
    public void init(Map<String, Object> params) {
        updateImage();
    }

    private void updateImage() {
        image.setSource(images.get(index));
    }

    public void prevImage() {
        index = --index >= 0 ? index : images.size() - 1;
        updateImage();
    }

    public void nexImage() {
        index = ++index < images.size() ? index : 0;
        updateImage();
    }
}