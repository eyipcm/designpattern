package com.aypc.creational.builder3;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTable_Builder implements Builder {
    private JTable m_table;
    private TableModel m_model;
    private int x = 0, y = 0;

    public void set_width_and_height(int width, int height) {
        m_table = new JTable(height, width);
        m_model = m_table.getModel();
    }

    public void start_row() {
        x = 0;
        ++y;
    }

    public void build_cell(String value) {
        m_model.setValueAt(value, y, x++);
    }

    public Component get_result() {
        return m_table;
    }
}