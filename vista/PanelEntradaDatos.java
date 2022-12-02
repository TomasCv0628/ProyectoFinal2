package vista;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import java.awt.Color;


public class PanelEntradaDatos extends JPanel
{
    private JLabel titulo;
    public JComboBox cbMunicipios;
    public JList listaMunicipios;
    public JRadioButton geografico;
    public JRadioButton cultural;
    public JRadioButton otros;

    
    public PanelEntradaDatos()
    {
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);

        titulo = new JLabel("JET");
        titulo.setBounds(125,30,50,20);
        this.add(titulo);

        String[] municip= {"Socorro", "San gil", "Bucaramanga"};
        listaMunicipios = new JList(municip);

        cbMunicipios = new JComboBox<>(municip);
        cbMunicipios.setBounds(65,80,150,20);
        this.add(cbMunicipios);

        geografico = new JRadioButton("Datos Geograficos");
        geografico.setBounds(50,120,180,30);
        add(geografico);

        cultural = new JRadioButton("Datos Culturales");
        cultural.setBounds(50,150,180,30);

        add(cultural);

        otros = new JRadioButton("Informacion Relevante");
        otros.setBounds(50,180,180,30);
        add(otros);

        
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

}
