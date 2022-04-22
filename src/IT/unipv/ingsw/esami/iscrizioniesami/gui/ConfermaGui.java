package IT.unipv.ingsw.esami.iscrizioniesami.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author stefano
 * @version 1
 */

public class ConfermaGui extends JFrame {

    private JPanel pan;
    private JLabel lab;

    private JButton butt;


    /**
     * costruttore
     */
    public ConfermaGui(){

         Container c=getContentPane();

         butt=new JButton("OK");
         lab=new JLabel("Prenotazione eseguità", SwingConstants.CENTER);
         pan=new JPanel();
         pan.setLayout(new BorderLayout());
         pan.add(lab, BorderLayout.CENTER);
         pan.add(butt, BorderLayout.SOUTH);
         c.add(pan);

         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setSize(600,300);
         setVisible(true);
     }

     /*getButton() mostra il bottone
     @return butt
      */

    public JButton getButt() {
        return butt;
    }
}
