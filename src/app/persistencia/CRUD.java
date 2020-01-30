package app.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import app.modelo.Contacto;


public class CRUD extends Conexion {
	public ArrayList<Contacto> obtenerTodos() throws ClassNotFoundException, SQLException{
	        //Declarar variables
	        String sql="select * from contactos;";
	        PreparedStatement comando;
	        ResultSet rs;
	        ArrayList<Contacto> agenda=new ArrayList<Contacto>();
	        //Abrir conexion
	        abrirConexion();
	        //Obtener el comando
	        comando=miConexion.prepareCall(sql);
	        //Ejecutar el comando 
	        rs=comando.executeQuery();
	        //Rellenar la colección
	        while (rs.next()) {
	            Contacto c1=new Contacto(rs.getInt("id"), rs.getString("nombre"), rs.getString("email"), rs.getString("telefono"));
	            agenda.add(c1);
	        }
	        //Cerrar la conexión
	        cerrarConexion();
	        //Devolver la coleccion de empleados 
	        return agenda;
	        
    }
    public Contacto obtenerUnContacto(int id) throws ClassNotFoundException, SQLException{
            //DEfinir variables
            String sql="select id, nombre, email, telefono from contactos where id=?";
            PreparedStatement comando;
            ResultSet rs;
            Contacto c1=new Contacto();
            //Abrir la conexxión
            abrirConexion();
            //Obtener el comando de la conexión
            comando=miConexion.prepareCall(sql);
            //Asignar valor a los parametros
            comando.setInt(1, id);
            //Ejecutar el comando
            rs=comando.executeQuery();
            //iNSTANCIAR EL EMPLEADO
                if (rs.next()) {
                    c1=new Contacto(rs.getInt("id"), rs.getString("nombre"), rs.getString("email"), rs.getString("telefono"));
                }
             //Cerrar Conexion
             cerrarConexion();
             //Devolver el empleado
             return c1;
            
        }
    public boolean insertarContacto(Contacto c1) throws ClassNotFoundException, SQLException{
	        //Definir variables
	        String sql="insert into contactos values (?,?,?,?)";
	        PreparedStatement comando;
	        int numInsertados=0;
	        //Abrir conexion
	        abrirConexion();
	        //Obtener el comando de la conexión
	        comando =miConexion.prepareCall(sql);
	        //Asigno valores de parametros 
	        comando.setInt(1, c1.getId());
	        comando.setString(2, c1.getNombre());
	        comando.setString(3, c1.getEmail());
	        comando.setString(4, c1.getTelefono());
	        //Ejecutar el comando
	        numInsertados=comando.executeUpdate();
	        //Cerrar conexión
	        cerrarConexion();
	        
	        return numInsertados>=1;
	    }
	    
    public boolean modificarContacto (Contacto c1) throws ClassNotFoundException, SQLException{
	        //Definir variables
	        String sql="update contactos set nombre=?, email=?, telefono=? where id=?";
	        PreparedStatement comando;
	        int numInsertados=0;
	        //Abrir conexion
	        abrirConexion();
	        //Obtener el comando de la conexión
	        comando =miConexion.prepareCall(sql);
	        //Asigno valores de parametros 
	        comando.setString(1, c1.getNombre());
	        comando.setString(2, c1.getEmail());
	        comando.setString(3, c1.getTelefono());
	        comando.setInt(4, c1.getId());
	        //Ejecutar el comando
	        numInsertados=comando.executeUpdate();
	        //Cerrar conexión
	        cerrarConexion();  
	        return numInsertados>=1;
	    }
    
    public boolean borrarContacto(int id) throws ClassNotFoundException, SQLException{
	        //Definir variables
	        String sql="delete from contactos where id=?";
	        PreparedStatement comando;
	        int numInsertados=0;
	        //Abrir conexion
	        abrirConexion();
	        //Obtener el comando de la conexión
	        comando =miConexion.prepareCall(sql);
	        //Asigno valores de parametros 
	        comando.setInt(1, id);
	        //Ejecutar el comando
	        numInsertados=comando.executeUpdate();
	        //Cerrar conexión
	        cerrarConexion();
	        return numInsertados>=1;
	    }
}
