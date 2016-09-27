package org.embulk.output.jdbc;

import com.google.common.base.Optional;

import java.util.List;

public class MergeConfig {
    private final List<String> mergeKeys;
    private final Optional<List<String>> mergeRule;
    private final Optional<String> mergeCondition;

    public MergeConfig(List<String> mergeKeys, Optional<List<String>> mergeRule, Optional<String> mergeCondition) {
        this.mergeKeys = mergeKeys;
        this.mergeRule = mergeRule;
        this.mergeCondition = mergeCondition;
    }

    public List<String> getMergeKeys() {
        return mergeKeys;
    }

    public Optional<List<String>> getMergeRule() {
        return mergeRule;
    }

    public Optional<String> getMergeCondition() {
        return mergeCondition;
    }
}
