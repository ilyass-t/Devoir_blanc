package org.example.controlle_blanc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MembreDaoImpl implements MembreDao {
    DatabaseConnection databaseConnection=new DatabaseConnection();
    Connection con=databaseConnection.getConnection();

    @Override
    public boolean inserer(Membre m) {
        String sql="insert into membre values(?,?,?,?)";
        try {
            PreparedStatement preparedStatement=con.prepareStatement(sql);

            preparedStatement.setString(1, m.getNom());
            preparedStatement.setString(2, m.getPrenom());
            preparedStatement.setString(3, m.getEmail());
            preparedStatement.setString(4,m.getPhone());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }

    @Override
    public List<Incident> chargerListIncidents() {
        String sql="select * from incident";
        List<Incident> incidents=new ArrayList<Incident>();
        try {
            PreparedStatement preparedStatement=con.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                Incident incident=new Incident();


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return List.of();
    }

}
