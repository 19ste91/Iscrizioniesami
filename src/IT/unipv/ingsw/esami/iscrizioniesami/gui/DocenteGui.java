package IT.unipv.ingsw.esami.iscrizioniesami.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @autor Stefano
 * @version 1.0
 */


public class DocenteGui extends JFrame{

    private JTabbedPane pant;
    private JPanel pan;
    private JPanel pan1;
    private JLabel codicelabel;
    private JTextField codicetext;

    private JPanel pan2;
    private JLabel modalitalabel;
    private JComboBox modalitacombo;

    private JPanel pan3;
    private JLabel datalabel;
    private JTextField datafield;

    private JPanel pan4;
    private JButton butt;

    /**
     * costruttore
     */

 public DocenteGui(){

     pan1=new JPanel();
     pan1.setLayout(new GridLayout(1,2));
     codicelabel=new JLabel("codicecorso");
     codicetext=new JTextField();
     pan1.add(codicelabel);
     pan1.add(codicetext);




     pan2=new JPanel();
     pan2.setLayout(new GridLayout(1,2));
     codicelabel=new JLabel("modalità");
     modalitacombo=new JComboBox<String>(new String[]{"Orale", "Scritto", "OraleScritto"});
     pan2.add(codicelabel);
     pan2.add(modalitacombo);



     pan3=new JPanel();
     pan3.setLayout(new GridLayout(1,2));
     datalabel=new JLabel("data della sezione in formato gg/mm/aaaa");
     datafield=new JTextField();
     pan3.add(datalabel);
     pan3.add(datafield);

      pan4=new JPanel();
      butt=new JButton("conferma");
      pan4.add(butt);

      Container c=getContentPane();
      pant=new JTabbedPane();
      pan=new JPanel();
      pan.setLayout(new GridLayout(4,1));
      pan.add(pan1);
      pan.add(pan2);
      pan.add(pan3);
      pan.add(pan4);
      pant.addTab("Richiesta", pan);
      c.add(pant);



     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setSize(600,300);
     setVisible(true);

 }
      /*
      bottone
      @return bottone
       */

    public JButton getButt() {
        return butt;
    }

     /*
      codice esame
      @return campo del codice esame
       */

    public JTextField getCodicetext() {
        return codicetext;
    }

    /*
      data esame
      @return campo del codice esame
       */

    public JTextField getDatafield() {
        return datafield;
    }

    /** modalita
     *
     * @return combobox della modalità
     */


    public JComboBox getModalitacombo() {
        return modalitacombo;
    }
}
