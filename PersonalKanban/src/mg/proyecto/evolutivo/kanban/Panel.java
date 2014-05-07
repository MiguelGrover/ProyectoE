package mg.proyecto.evolutivo.kanban;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Panel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public Panel() {
		setLayout(null);
		
		JLabel lblTarea = new JLabel("Tarea");
		lblTarea.setBounds(200, 12, 55, 16);
		add(lblTarea);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(29, 74, 55, 16);
		add(lblTtulo);
		
		textField = new JTextField();
		textField.setBounds(112, 72, 445, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Descripci\u00F3n:");
		lblNewLabel.setBounds(29, 115, 71, 16);
		add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 113, 445, 136);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(29, 263, 55, 16);
		add(lblEstado);
		
		JLabel lblCategora = new JLabel("Categor\u00EDa:");
		lblCategora.setBounds(29, 291, 71, 16);
		add(lblCategora);
		
		JLabel lblPrioridad = new JLabel("Prioridad:");
		lblPrioridad.setBounds(29, 319, 71, 16);
		add(lblPrioridad);
		
		JLabel lblPropietario = new JLabel("Propietario:");
		lblPropietario.setBounds(29, 347, 71, 16);
		add(lblPropietario);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(29, 375, 55, 16);
		add(lblFecha);
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 289, 445, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(112, 345, 445, 20);
		add(textField_3);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setBounds(112, 405, 143, 56);
		add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(414, 405, 143, 56);
		add(btnCancelar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BACKLOG", "DO_TO", "IN_PROGRESS", "DONE"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(112, 259, 445, 25);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_1.setBounds(112, 315, 445, 25);
		add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(112, 373, 445, 20);
		add(textField_4);
		textField_4.setColumns(10);

	}
}
