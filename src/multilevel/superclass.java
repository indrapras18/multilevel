/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilevel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class superclass {

    private JFrame frame;

    public void Exit() {
        frame = new JFrame("Exit");

        if (JOptionPane.showConfirmDialog(frame, "Konfirmasi Jika Anda Ingin Keluar Dari Aplikasi", "Aplikasi MbakNis",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }

}
