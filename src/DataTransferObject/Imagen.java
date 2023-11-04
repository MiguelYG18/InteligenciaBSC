package DataTransferObject;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;

public class Imagen {
    public static void descargarYAbrirImagen() {
        try {
            // Configura la conexión a tu base de datos
            String jdbcURL = "jdbc:mysql://localhost:3306/alicorp";
            String username = "root";
            String password = "123456";

            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Llama al procedimiento almacenado
            CallableStatement callableStatement = connection.prepareCall("{call sp_imagen()}");
            ResultSet resultSet = callableStatement.executeQuery();

            if (resultSet.next()) {
                // Obtiene el flujo de entrada de la imagen desde la base de datos
                InputStream imageInputStream = resultSet.getBinaryStream("imagen");

                // Obtiene la ubicación del escritorio del usuario
                String desktopPath = System.getProperty("user.home") + "/Desktop/";

                // Crea un archivo local en el escritorio y guarda la imagen
                String imagePath = desktopPath + "ME-D-DESCARGA.png";
                FileOutputStream fileOutputStream = new FileOutputStream(imagePath);
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = imageInputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, bytesRead);
                }

                fileOutputStream.close();
                imageInputStream.close();

                // Abre la imagen en el visor predeterminado
                File imageFile = new File(imagePath);
                Desktop.getDesktop().open(imageFile);

                System.out.println("Imagen descargada y abierta en el visor predeterminado.");
            } else {
                System.out.println("No se encontró ninguna imagen en la base de datos.");
            }

            // Cierra la conexión
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
