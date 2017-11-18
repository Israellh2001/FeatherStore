
package FeatherStore;

import Clases.Mysql;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class InputKeyEvents extends KeyAdapter{
    public void keyPressed(KeyEvent e){
        //validarnom();
    }
    public void validarnom(Registro x){
        x.cargar();
    }
            
}
