package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewBD extends JFrame{
	
    private JTable table;
    private DefaultTableModel model;
    private JButton btnRefresh;

    public ViewBD() {
    	
        setTitle("Usuarios");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        model = new DefaultTableModel(new String[]{"ID", "Nombre", "Correo", "Rol", "Celular"}, 0);
        table = new JTable(model);
        btnRefresh = new JButton("Actualizar");

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(btnRefresh, BorderLayout.SOUTH);
    }

    public void setUserData(Object[][] data) {
        model.setRowCount(0);
        for (Object[] row : data) {
            model.addRow(row);
        }
    }

    public JButton getBtnRefresh() {
        return btnRefresh;
    }
}
