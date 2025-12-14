package com.beemdevelopment.Tesser.ui.fragments.preferences;

import android.os.Bundle;

import com.beemdevelopment.Tesser.R;

public class MainPreferencesFragment extends PreferencesFragment {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences);
    }
}
