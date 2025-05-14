/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.aryantue.javafxgithubtest;

import javafx.scene.text.Font;

/**
 *
 * @author Aryan Shinde
 */
public class Fonts {
    private static final String DEFAULT_FONT_TITLE = "Banschrift";
    private static final int TITLE_FONT_SIZE = 36; 
    private static final String DEFAULT_FONT = "Arial";
    
    public static Font getTitleFont() {
        return Font.font(DEFAULT_FONT_TITLE, TITLE_FONT_SIZE);
    } 
    
    public static Font getFont(int size) {
        return Font.font(DEFAULT_FONT, size);
    } 
}
