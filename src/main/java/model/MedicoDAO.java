/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ftana
 */
public class MedicoDAO {
    
    public void connectar (MedicoBean medico){
        try {
            Connection conn = Conexao.conectar();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<MedicoBean> listarMedicos(){
        List<MedicoBean> lista = new ArrayList<>();
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement("Select nome, especializacao FROM medicos");
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                MedicoBean md = new MedicoBean();
                md.setNome(rs.getString("nome"));
                md.setEspecializacao(rs.getString("especializacao"));
                lista.add(md);
            }
            
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public List<MedicoBean> listar(){
            List<MedicoBean> medicos = new ArrayList<>();
            try {
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = null;
                ResultSet rs = null;

                stmt =conn.prepareStatement(
                    "SELECT * FROM medicos");

                rs = stmt.executeQuery();
                while (rs.next()){
                    MedicoBean medico = new MedicoBean();
                    medico.setId(rs.getInt("id"));
                    medico.setNome(rs.getString("nome"));
                    medico.setEspecializacao(rs.getString("especializacao"));
                    medico.add(medico);
                } rs.close(); stmt.close(); conn.close();
            } catch (SQLException e) {e.printStackTrace(); }
            return medicos;
        }
}
