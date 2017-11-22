
package Clases;

import Clases.Mysql;
import FeatherStore.Registro;
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
