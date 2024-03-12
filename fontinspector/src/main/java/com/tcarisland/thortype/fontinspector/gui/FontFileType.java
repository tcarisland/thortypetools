package com.tcarisland.thortype.fontinspector.gui;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum FontFileType {
    TRUETYPE("ttf"),
    WEBFONT("woff"),
    OPENTYPE("otf");

    private final String extension;

    FontFileType(String ext) {
        extension = ext;
    }

    public static String[] extensions() {
        List<String> extensionList = Arrays
                .stream(values())
                .map(FontFileType::getExtension)
                .toList();
        String[] extensions = new String[extensionList.size()];
        return extensionList.toArray(extensions);
    }
}