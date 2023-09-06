package aula06_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Screen extends JFrame {

	private JPanel contentPane;
	private JTextField nomeinput;
	private JTextField sobrenomeinput;
	private JTextField telefoneinput;
	private JTable table;
	private Aula08_ContatoDao dao = new Aula08_ContatoDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen frame = new Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGUI = new JLabel("GraficUserInterface");
		lblGUI.setForeground(new Color(255, 0, 255));
		lblGUI.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblGUI.setBounds(10, 11, 214, 45);
		contentPane.add(lblGUI);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(0, 0, 255));
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNome.setBounds(10, 73, 70, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSobrenome.setForeground(new Color(0, 0, 255));
		lblSobrenome.setBounds(10, 110, 94, 14);
		contentPane.add(lblSobrenome);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTelefone.setForeground(new Color(0, 0, 255));
		lblTelefone.setBounds(10, 149, 70, 14);
		contentPane.add(lblTelefone);
		
		nomeinput = new JTextField();
		nomeinput.setBounds(90, 71, 132, 20);
		contentPane.add(nomeinput);
		nomeinput.setColumns(10);
		
		sobrenomeinput = new JTextField();
		sobrenomeinput.setBounds(90, 108, 132, 20);
		contentPane.add(sobrenomeinput);
		sobrenomeinput.setColumns(10);
		
		telefoneinput = new JTextField();
		telefoneinput.setBounds(90, 147, 132, 20);
		contentPane.add(telefoneinput);
		telefoneinput.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = nomeinput.getText();
				String sobrenome = sobrenomeinput.getText();
				String telefone = telefoneinput.getText();
				
				Aula08_Contato contato = new Aula08_Contato();
				
				contato.setNome(nome);
				contato.setSobrenome(sobrenome);
				contato.setTelefone(telefone);
				
				dao.salvarContato(contato);
				
				limpaTela();
				
				JOptionPane.showConfirmDialog(null, "cadastro salvo com sucesso");
				
				listarContatos();
				
			}
		});
		btnAdd.setBounds(10, 192, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num = table.getSelectedRow();
				
				long id = (long) table.getValueAt(num, 0);
				
				String nome = nomeinput.getText();
				String sobrenome = sobrenomeinput.getText();
				String telefone = telefoneinput.getText();
				
				Aula08_Contato contato = new Aula08_Contato();
				
				contato.setId(id);
				contato.setNome(nome);
				contato.setSobrenome(sobrenome);
				contato.setTelefone(telefone);
				
				dao.updateContato(contato);
				
				limpaTela();
				
				JOptionPane.showConfirmDialog(null, "cadastro atualizado com sucesso");
				
				listarContatos();
				
			}
		});
		btnEdit.setBounds(109, 192, 89, 23);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num = table.getSelectedRow();
				
				long id = (long) table.getValueAt(num, 0);
				
				JOptionPane.showConfirmDialog(btnDelete, "tem certeza que quer deletar o contato?");
				
				dao.deleteContato(id);
				
				listarContatos();
				
				JOptionPane.showConfirmDialog(null, "contato deletado com sucesso");
				
				
			}
		});
		btnDelete.setBounds(208, 192, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listarContatos();
				
			}
		});
		btnShow.setBounds(307, 192, 89, 23);
		contentPane.add(btnShow);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Keep me conected");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(10, 222, 138, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(405, 11, 350, 268);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"codigo", "Name", "Surname", "Phone"
			}
		) {
			Class[] columnTypes = new Class[] {
				Long.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num = table.getSelectedRow();
				
				long id = (long) table.getValueAt(num, 0);
				
				Aula08_Contato contato = dao.buscarContatoPorId(id);
				
				nomeinput.setText(contato.getNome());
				sobrenomeinput.setText(contato.getSobrenome());
				telefoneinput.setText(contato.getTelefone());
				
			}
		});
		btnLoad.setBounds(307, 222, 89, 23);
		contentPane.add(btnLoad);
	}
	
	public void limpaTela() {
		nomeinput.setText("");
		sobrenomeinput.setText("");
		telefoneinput.setText("");
	}
	
	public void listarContatos() {
		List<Aula08_Contato> lista = dao.listarContatos();
		
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		
		modelo.setNumRows(0);
		limpaTela();
		
		lista.stream().forEach(contato -> modelo.addRow(new Object[] {
				contato.getId(),
				contato.getNome(),
				contato.getSobrenome(),
				contato.getTelefone()
		}));
	}
}