package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: MultimapBuilder.class */
public abstract class MultimapBuilder {

    /* loaded from: MultimapBuilder$ArrayListSupplier.class */
    private static final class ArrayListSupplier implements Supplier, Serializable {
        private final int expectedValuesPerKey;

        ArrayListSupplier(int i) {
            this.expectedValuesPerKey = CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public List get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    /* loaded from: MultimapBuilder$ListMultimapBuilder.class */
    public static abstract class ListMultimapBuilder extends MultimapBuilder {
        ListMultimapBuilder() {
            super();
        }

        public abstract ListMultimap build();
    }

    /* loaded from: MultimapBuilder$MultimapBuilderWithKeys.class */
    public static abstract class MultimapBuilderWithKeys {
        MultimapBuilderWithKeys() {
        }

        public ListMultimapBuilder arrayListValues() {
            return arrayListValues(2);
        }

        public ListMultimapBuilder arrayListValues(int i) {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            return new ListMultimapBuilder(this, i) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.1
                final MultimapBuilderWithKeys this$0;
                final int val$expectedValuesPerKey;

                {
                    this.this$0 = this;
                    this.val$expectedValuesPerKey = i;
                }

                @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder
                public ListMultimap build() {
                    return Multimaps.newListMultimap(this.this$0.createMap(), new ArrayListSupplier(this.val$expectedValuesPerKey));
                }
            };
        }

        abstract Map createMap();
    }

    private MultimapBuilder() {
    }

    public static MultimapBuilderWithKeys hashKeys() {
        return hashKeys(8);
    }

    public static MultimapBuilderWithKeys hashKeys(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new MultimapBuilderWithKeys(i) { // from class: com.google.common.collect.MultimapBuilder.1
            final int val$expectedKeys;

            {
                this.val$expectedKeys = i;
            }

            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            Map createMap() {
                return Platform.newHashMapWithExpectedSize(this.val$expectedKeys);
            }
        };
    }

    public static MultimapBuilderWithKeys treeKeys() {
        return treeKeys(Ordering.natural());
    }

    public static MultimapBuilderWithKeys treeKeys(Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        return new MultimapBuilderWithKeys(comparator) { // from class: com.google.common.collect.MultimapBuilder.3
            final Comparator val$comparator;

            {
                this.val$comparator = comparator;
            }

            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            Map createMap() {
                return new TreeMap(this.val$comparator);
            }
        };
    }
}
