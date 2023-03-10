package proyectoestructuradatos.Menus;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class misFuentes{
    
    public Font Roboto() {
        Font font = null;
        try {
            InputStream is = getClass().getResourceAsStream("/fuentesTexto/Roboto-Regular.ttf");
            font = Font.createFont(Font.TRUETYPE_FONT, is);
            is.close();
        } catch (IOException | FontFormatException ex) {
            ex.printStackTrace();
        }
        return font;
    }
    
    public Font RobotoBold(){
        Font Roboto = null;
        try {
            InputStream is = getClass().getResourceAsStream("/fuentesTexto/Roboto-Bold.ttf");
            Roboto = Font.createFont(Font.TRUETYPE_FONT, is);
            is.close();
        } catch (IOException | FontFormatException ex){
            ex.printStackTrace();
        }
        return Roboto;
    }  
}
