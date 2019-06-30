/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import model.*;
import utils.dbBean;

/**
 *
 * @author ricardoavila
 */
public class EmpleadoDAO {
    
    public int crearEmpleado(Empleado emp)
    {
       int resultado=0;
       String sql="INSERT INTO empleado VALUES ("+ emp.getId() +", "+ emp.getNombre()+", "+ emp.getSexo()+", "+ emp.getApellidoPaterno() +", "+ emp.getApellidoMaterno()+", "+ emp.getSexo()+", "+ emp.getTelefono()+")";
            
       dbBean con=new dbBean();
       
       try{
          resultado=con.updateSQL(sql);
        }
        catch(java.sql.SQLException e){e.printStackTrace();
        }
        try{
        con.close();
        }
        catch(SQLException e){
        }
        
        return resultado;
    }

}
