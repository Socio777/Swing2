package atienzar.crispin.Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;



public class EventoCuadroTexto {

	public static void main(String[] args) {
		MarcoCuadroEvento mimarco=new MarcoCuadroEvento();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCuadroEvento extends JFrame{
	
	public MarcoCuadroEvento() {
		
		setBounds (600,200,600,400);
		
		add(new LaminaCuadroEvento());
		setVisible(true);
		
		
	}
}

class LaminaCuadroEvento extends JPanel{
	
	public LaminaCuadroEvento () {
		JTextField cuadroTexto=new JTextField(20);
		Document miDocumento=cuadroTexto.getDocument();
		miDocumento.addDocumentListener(new EscuchaTexto());
		add(cuadroTexto);
	
	}
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has introducido texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has borrado texto");
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
