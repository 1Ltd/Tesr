package com.beemdevelopment.Tesser.helpers.comparators;

import com.beemdevelopment.Tesser.vault.VaultEntry;

import java.util.Comparator;

public class UsageCountComparator implements Comparator<VaultEntry> {
    @Override
    public int compare(VaultEntry a, VaultEntry b) {
        return Integer.compare(a.getUsageCount(), b.getUsageCount());
    }
}