package com.braze.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: CardCategory.class */
public enum CardCategory {
    ADVERTISING,
    ANNOUNCEMENTS,
    NEWS,
    SOCIAL,
    NO_CATEGORY;

    private static final Map<String, CardCategory> CARD_CATEGORY_HASH_MAP = new HashMap();

    static {
        Iterator it = EnumSet.allOf(CardCategory.class).iterator();
        while (it.hasNext()) {
            CardCategory cardCategory = (CardCategory) it.next();
            CARD_CATEGORY_HASH_MAP.put(cardCategory.toString(), cardCategory);
        }
    }

    public static CardCategory get(String str) {
        return CARD_CATEGORY_HASH_MAP.get(str.toUpperCase(Locale.US));
    }

    public static EnumSet<CardCategory> getAllCategories() {
        return EnumSet.allOf(CardCategory.class);
    }
}
