/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.Date;
import model.*;
import utils.dbBean;

/**
 *
 * @author ricardoavila
 */
public class DetalleActoresDAO {
    
    public int crearDetalleActores( DetalleActores da)
    {
         
       int resultado=0;
       String sql="INSERT INTO pelicula VALUES ()";
            
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
