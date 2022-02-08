package com.aypc.builder3;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JPanel;

public class GridLayout_Builder implements Builder {
    private JPanel m_panel = new JPanel();

    public void set_width_and_height(int width, int height) {
        m_panel.setLayout(new GridLayout(height, width));
        m_panel.setBackground(Color.white);
    }

    public void start_row() {
    }

    public void build_cell(String value) {
        m_panel.add(new Label(value));
    }

    public Component get_result() {
        return m_panel;
    }
}
