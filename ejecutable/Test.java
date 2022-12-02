package ejecutable;

import controlador.Controlador;
import modelo.Reader;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentanaPrincipal);
        
        Reader a = new Reader();

        System.out.println(a.leerTxt("/home/freudtm/Escritorio/SegundoSemestre/POO/ProyectoFInal/avances-2/municipios/Socorro/1.txt"));
        System.out.println(a.leerTxt("/home/freudtm/Escritorio/SegundoSemestre/POO/ProyectoFInal/avances-2/municipios/"+miVentanaPrincipal.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"/1.txt"));
        System.out.println("/home/freudtm/Escritorio/SegundoSemestre/POO/ProyectoFInal/avances-2/municipios/"+miVentanaPrincipal.miPanelEntradaDatos.cbMunicipios.getSelectedItem()+"/1.txt");
        
    }    
}
