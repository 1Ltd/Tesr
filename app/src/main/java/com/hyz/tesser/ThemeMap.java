package com.hyz.tesser;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class ThemeMap {
    private ThemeMap() {

    }

    public static final Map<Theme, Integer> DEFAULT = ImmutableMap.of(
            Theme.LIGHT, R.style.Theme_Tesser_Light,
            Theme.DARK, R.style.Theme_Tesser_Dark,
            Theme.AMOLED, R.style.Theme_Tesser_Amoled
    );
}
