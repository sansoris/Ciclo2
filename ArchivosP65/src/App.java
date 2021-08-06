import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        // System.getProperty("java.classpath");

        String jdbcUrl = "jdbc:sqlite:C:\\Basesdatos\\hr.db";
        try {
            Connection conexion = DriverManager.getConnection(jdbcUrl);
            String sql = "Select * from departments";
            Statement stm = conexion.createStatement();
            ResultSet resultado =stm.executeQuery(sql);
		while (resultado.next()){
		Integer dId = resultado.getInt("department_id");
		String dName = resultado.getString("department_name");
            	Integer lId = resultado.getInt("location_id");
		
        System.out.println(dId +"" +dName+"" +lId);
            }
        } catch (Exception e) {
            System.out.println("Error conectando a la base de datos");
	    System.out.println(e.getMessage());

        }
        //insert
        Connection conexioni = DriverManager.getConnection(jdbcUrl);
        String sqli = "insert into locations (location_id,city, street_address, country_id) values (6100, 'Bucaramanga','Avenida Libertadores', 57)";
        Statement stmi = conexioni.createStatement();
        int rows = stmi.executeUpdate(sqli);
        if (rows>0){
            System.out.println("Registro creado con éxito");
        }
        conexioni.close();


        //update
        try{
        Connection conexionu = DriverManager.getConnection(jdbcUrl);
        String sqlu = "update locations set city ='Florencia', street_address = 'Cl 45 20 20' where location_id = 6100";
        Statement stmu = conexionu.createStatement();
        rows = stmu.executeUpdate(sqlu);
        if(rows>0){
            System.out.println("Registro actualizado!");
        }
        conexionu.close();
        
        } catch (Exception e) {
        System.out.println("No se pudo actualizar el registro");
        System.out.println(e.getMessage());
    }
    // delete
    try {
        Connection conexiond = DriverManager.getConnection(jdbcUrl);
        String sqld = "delete from locations where location_id between 4550 and 4551";
        Statement stmd = conexiond.createStatement();
        rows = stmd.executeUpdate(sqld);
        if (rows > 0){
            System.out.println("Se han borrado " + rows + " registros");
        }
    } catch (Exception e) {
        
            System.out.println("No se pudo borrar el registro");
	        System.out.println(e.getMessage());
    }
}
}
