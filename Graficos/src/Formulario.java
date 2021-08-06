// import javax.swing.ComboBoxEditor;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener, ChangeListener   {
// Ir agregando los elementos que se requieran en el formulario
// ActionListener es un paquete de herramientas de windows para interfaz de usuario

private JLabel etiqueta1, etiqueta2, etiqueta3;
private JTextField textNombre, textApellido;
private JButton botonIngreso, botonLimpiar;
private JComboBox <String> combo1;
private JCheckBox check1, check2, check3;
private JRadioButton radio1, radio2, radio3;
private ButtonGroup grupoboton1;

    public static void main(String[] args) throws Exception {
        // Se puede hacer instanciando un JFrame
        // JFrame ventana = new JFrame();
        // ventana.setBounds(200,40,400,400); //
        // ventana.setVisible(true);
        // ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Se puede extender un Formulario directamente,
        Formulario ventana  = new Formulario();
        ventana.setBounds(200,40,400,400); 
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
    // constructor creando los diferentes elementos al JFrame

    public Formulario(){
        setLayout(null); // componentes en propiedades fijas absoluta
        etiqueta1 = new JLabel("Nombre");// debe llevar nombre interno en parentesis
        etiqueta1.setBounds(30,30, 100, 20);    
        add(etiqueta1);

        etiqueta2 = new JLabel("Apellido");// debe llevar nombre interno en parentesis
        etiqueta2.setBounds(30,60, 100, 20);    
        add(etiqueta2);

        etiqueta3 = new JLabel();// debe llevar nombre interno en parentesis
        etiqueta3.setBounds(30, 90, 300, 20);    
        add(etiqueta3);


        textNombre = new JTextField();
        textNombre.setBounds(100, 30, 100, 20);
        add(textNombre);
        
        textApellido = new JTextField();
        textApellido.setBounds(100, 60, 100, 20);
        add(textApellido);
        
        // guarda en memoria el identificar del objeto que hizo el clic e 
        //invoca el metodo de actionPerformed
        botonIngreso = new JButton("Unir");
        botonIngreso.setBounds(30,300,80,25);
        botonIngreso.addActionListener(this);
        add(botonIngreso);

        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(130,300,80,25);
        botonLimpiar.addActionListener(this);
        add(botonLimpiar);
        // guarda en memoria el identificar del objeto que hizo el clic e 
        //invoca el metodo de actionPerformed
       

        combo1 = new JComboBox <String>();
        // debe saber que tipo de elemento va a parametrizarse en el (String) arriba
        combo1.setBounds(230,30,100,20);
        combo1.addItem("Colombia");
        combo1.addItem("Venezuela");
        combo1.addItem("Ecuador");
        combo1.addItem("Panama");
        combo1.addItem("Brasil");
        combo1.addActionListener(this);
        add(combo1) ;

        
        grupoboton1 = new ButtonGroup();
        radio1 = new JRadioButton("400 X 400");
        radio1.setBounds(30,140,80,20);
        radio1.addChangeListener(this);
        add(radio1);
        grupoboton1.add(radio1);

        radio2 = new JRadioButton("500 X 500");
        radio2.setBounds(30,160,80,20);
        radio2.addChangeListener(this);
        add(radio2);
        grupoboton1.add(radio2);

        radio3 = new JRadioButton("600 X 600");
        radio3.setBounds(30,180,80,20);
        radio3.addChangeListener(this);
        add(radio3);
        grupoboton1.add(radio3); // para escoger una sola opción

        check1 = new JCheckBox(" Español");
        check1.setBounds(160,140,80,20);
        check1.addChangeListener(this);
        add(check1);
        check2 = new JCheckBox(" Inglés");
        check2.setBounds(160,160,80,20);
        check2.addChangeListener(this);
        add(check2);
        check3 = new JCheckBox(" Francés");
        check3.setBounds(160,160,80,20);
        check3.addChangeListener(this);
        add(check3);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //creado al importar el metodo desde ActionEvent
        // Conocer quien fue el que hizo el clic
        if (e.getSource() ==botonIngreso){
            etiqueta3.setText(textNombre.getText()+ " "+textApellido.getText());
        }
        if (e.getSource() ==botonLimpiar){
            textNombre.setText("");
            textApellido.setText("");
        }
        if (e.getSource() ==combo1){
            etiqueta3.setText(textNombre.getText()+ " "+textApellido.getText()+ "-"+combo1.getSelectedItem());
            
        }
        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String idiomas = "";

        if(radio1.isSelected()){
            //setsize 
            setSize(400,400);
        }
        if(radio2.isSelected()){
            setSize(500,500);
        }
        if(radio3.isSelected()){
            setSize(600,600);
        }

        if (check1.isSelected()){
            idiomas = idiomas + "Español";
        }
        if (check2.isSelected()) {
            idiomas = idiomas + " Inglés";
        }
        
        etiqueta3.setText(("La persona habla: "+ idiomas));
        // se debe importar
        // JOptionPane.showMessageDialog(this, "La persona habla: "+ idiomas);
    }
}



