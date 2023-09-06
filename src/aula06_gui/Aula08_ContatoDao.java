package aula06_gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Aula08_ContatoDao {
	//dao -> data access object
	//classe q usa conexao p/ inserir a entidade no banco
	
	private Connection con;
	
	public Aula08_ContatoDao() {
		con = new Aula08_connectionFactory().getConnection();
	}
	
	//metodo p/salvar objeto dentro do banco
	public void salvarContato(Aula08_Contato contato) {
		String sql = "insert into contato(nome,sobrenome,telefone) values(?,?,?)";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getSobrenome());
			ps.setString(3, contato.getTelefone());
			
			ps.execute();
			ps.close();
			
			System.out.println("contato salvo");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateContato(Aula08_Contato contato) {
		String sql = "update contato set nome=? ,sobrenome=?, telefone=? where id=?";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getSobrenome());
			ps.setString(3, contato.getTelefone());
			ps.setLong(4, contato.getId());
			
			ps.execute();
			ps.close();
			
			System.out.println("contato atualizado");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteContato(Long id) {
		String sql = "delete from contato where id=?";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setLong(1, id);
			
			ps.execute();
			ps.close();
			
			System.out.println("contato deletado");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Aula08_Contato> listarContatos(){
		
		List<Aula08_Contato> lista = new ArrayList<>();
		
		String sql = "select * from contato";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Aula08_Contato contato = new Aula08_Contato();
				
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setSobrenome(rs.getString("sobrenome"));
				contato.setTelefone(rs.getString("telefone"));
				
				lista.add(contato);
			}
			
			rs.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public Aula08_Contato buscarContatoPorId(long id) {
		
		Aula08_Contato contato = new Aula08_Contato();
		
		String sql = "select * from contato where id=?";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setLong(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setSobrenome(rs.getString("sobrenome"));
				contato.setTelefone(rs.getString("telefone"));
				
			}
			
			rs.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return contato;
	}
}