package com.hyz.tesser.helpers.comparators;

import com.hyz.tesser.vault.VaultEntry;

import java.util.Comparator;

public class UsageCountComparator implements Comparator<VaultEntry> {
    @Override
    public int compare(VaultEntry a, VaultEntry b) {
        return Integer.compare(a.getUsageCount(), b.getUsageCount());
    }
}