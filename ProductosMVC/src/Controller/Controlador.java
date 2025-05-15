package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import View.ViewBD;
import Model.Modelo;
import Model.User;

public class Controlador {

    private Modelo model;
    private ViewBD view;

    public Controlador(Modelo model, ViewBD view) {
    	
        this.model = model;
        this.view = view;
        loadData();

        view.getBtnRefresh().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadData();
            }
        });
    }

    private void loadData() {
        ArrayList<User> users = Modelo.getUsers();
        Object[][] data = new Object[users.size()][5];

        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            data[i][0] = u.getId();
            data[i][1] = u.getNombre();
            data[i][2] = u.getCorreo();
            data[i][3] = u.getRol();
            data[i][4] = u.getTel();
        }

        view.setUserData(data);
    }
}
