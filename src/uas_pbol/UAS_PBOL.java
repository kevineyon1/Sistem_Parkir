/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pbol;
import javax.swing.UIManager;

/**
 *
 * @author Kevin Eyon
 */
public class UAS_PBOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        koneksi konek = new koneksi();
        konek.koneksi();
        try 
        {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel");
        } 
        catch (Exception e) 
        {
          e.printStackTrace();
        }
        new utama().setVisible(true);
    }
    
}
