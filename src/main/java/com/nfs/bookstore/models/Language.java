package com.nfs.bookstore.models;

public enum Language {
    FR("Français"), EN("English"), DE("Deutsch"), IT("Italian");
    public final String label;
    private Language(String label) {
        this.label = label;
    }

}