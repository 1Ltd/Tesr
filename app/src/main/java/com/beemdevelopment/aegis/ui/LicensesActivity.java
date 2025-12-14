package com.beemdevelopment.Tesser.ui;

import android.os.Bundle;

import com.beemdevelopment.Tesser.Preferences;
import com.beemdevelopment.Tesser.R;
import com.beemdevelopment.Tesser.ThemeMap;
import com.beemdevelopment.Tesser.helpers.ThemeHelper;
import com.mikepenz.aboutlibraries.LibsBuilder;
import com.mikepenz.aboutlibraries.ui.LibsActivity;

import org.jetbrains.annotations.Nullable;

import dagger.hilt.InstallIn;
import dagger.hilt.android.EarlyEntryPoint;
import dagger.hilt.android.EarlyEntryPoints;
import dagger.hilt.components.SingletonComponent;

public class LicensesActivity extends LibsActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        LibsBuilder builder = new LibsBuilder()
                .withSearchEnabled(true)
                .withAboutMinimalDesign(true)
                .withActivityTitle(getString(R.string.title_activity_licenses));
        setIntent(builder.intent(this));

        Preferences _prefs = EarlyEntryPoints.get(getApplicationContext(), PrefEntryPoint.class).getPreferences();
        ThemeHelper themeHelper = new ThemeHelper(this, _prefs);
        themeHelper.setTheme(ThemeMap.DEFAULT);

        super.onCreate(savedInstanceState);
    }

    @EarlyEntryPoint
    @InstallIn(SingletonComponent.class)
    public interface PrefEntryPoint {
        Preferences getPreferences();
    }
}
