package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

/**
 * Attachments type
 */
public enum AttachmentsHistoryType {
    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("audio")
    AUDIO("audio"),

    @SerializedName("doc")
    DOC("doc"),

    @SerializedName("link")
    LINK("link");

    private final String value;

    AttachmentsHistoryType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
