package com.kokakiwi.mclauncher.ui.simple.components;

import java.awt.Color;

import javax.swing.JLabel;

public class TransparentLabel extends JLabel
{
    private static final long serialVersionUID = 7937007704371977399L;
    
    public TransparentLabel(String string, int center, Color color0)
    {
        super(string, center);
        setForeground(color0);
    }
    
    public TransparentLabel(String string)
    {
        super(string);
        setForeground(Color.WHITE);
    }
    
    
    public boolean isOpaque()
    {
        return false;
    }
}