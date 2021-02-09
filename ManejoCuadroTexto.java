/*package atienzar.crispin.Swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ManejoCuadroTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCuadroTexto mimarco=new MarcoCuadroTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCuadroTexto extends JFrame{
	
	public MarcoCuadroTexto() {
		
		setBounds (600,300,600,400);
		
		add(new LaminaCuadroTexto());
		setVisible(true);
		
		
	}
}

class LaminaCuadroTexto extends JPanel{
	
	public LaminaCuadroTexto () {
		
		JTextField cuadroTexto=new JTextField (20);
		JTextField cuadroTexto2=new JTextField (20);
		add (cuadroTexto);
		JButton boton1=new JButton("Obtener texto");
		boton1.addActionListener(new ObtenerTexto());
		add(boton1);
		add(cuadroTexto2);
	}
	private class ObtenerTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(cuadroTexto.getText());
			cuadroTexto2.setText(cuadroTexto.getText());
		}
		
		
	}
	
	
	
	JTextField cuadroTexto,cuadroTexto2;
	
	
}*/