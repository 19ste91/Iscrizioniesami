package IT.unipv.ingsw.esami.iscrizioniesami.gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/*Login
 * @autor Stefano
 * @version 1
 */



public class LoginGui extends JFrame {
	
	private JLabel tipoutentelabel;
	private JLabel cflabel;
	private JLabel passlabel;
	private JComboBox tipoutentecombobox;
	private JTextField cftextfield;
	private JPasswordField passfield;
	private JPanel pan1;
	private JPanel pan2;
	private JPanel pan3;
	private JButton butt;
	
	/* costruttore
	 * @version 1
	 */
	
	
public	LoginGui() {
	
	pan3=new JPanel();
	pan3.setLayout(new GridLayout(1,2));
	tipoutentelabel=new JLabel();
	tipoutentelabel.setText("tipo utente");
	String[] scelte = new String[]{"Studente","Docente","Segretaria"};
	tipoutentecombobox=new JComboBox<String>(scelte);
	pan3.add(tipoutentelabel);
	pan3.add(tipoutentecombobox);
	
	pan1=new JPanel();
	pan1.setLayout(new GridLayout(1,2));
	cflabel=new JLabel();
	cflabel.setText("cf");
	cftextfield=new JTextField();
	pan1.add(cflabel);
	pan1.add(cftextfield);
	
	pan2=new JPanel();
	pan2.setLayout(new GridLayout(1,2));
	passlabel=new JLabel();
	passlabel.setText("Password");
	passfield=new JPasswordField();
	pan2.add(passlabel);
	pan2.add(passfield);
	
	butt=new JButton("Conferma");
	
	
	Container c=getContentPane();
	setLayout(new GridLayout(4,1));
	c.add(pan3);
	c.add(pan1);
	c.add(pan2);
	c.add(butt);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(600,300);
	setVisible(true);
}
    /* getcf
     * @return ritorna la JTextFiled in cui viene inserito il codice fiscale
     */
    

	public JTextField getcf() {
	    return cftextfield;
    }

	/* getPassfield
     * @return ritorna la JPasswordField in cui viene inserito la password
     */

    public JPasswordField getPassfield() {
	    return passfield;
    }

    /* getButt
     * @return il pulsante di conferma
     */

    public JButton getButt() {
	    return butt;
    }




}
