package com.braze.storage;

/* loaded from: ICardStorageProvider.class */
public interface ICardStorageProvider<T> {
    void markCardAsClicked(String str);

    void markCardAsDismissed(String str);

    void markCardAsViewed(String str);

    void markCardAsVisuallyRead(String str);
}
