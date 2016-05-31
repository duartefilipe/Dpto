package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conectabd.ConectBancoDeDados;
import modelo.Professor;

public class ProfessorDAO {

	
	
	//Cadastrar e alterar
	public boolean cadastrar(Professor prof){
		
		Connection con = ConectBancoDeDados.getConexao();

		boolean retorno = false;
		
		try{
			
			//caso seja novo
			if(prof.getId() <= 0)
			{
				System.out.println("Cadastro de novo professor");
				String nome = prof.getNome();
				long siape = prof.getSiape();
				int ramal = prof.getRamal();
				int celular = prof.getCelular();
				String sala = prof.getSala();	
				int cpf = prof.getCpf();
				int identidade = prof.getIdentidade();
				String email = prof.getEmail();
				
				
				String sql ="INSERT INTO professor (nome,siape,ramal,celular,sala) values(?,?,?,?,?)";
				PreparedStatement stmt  = con.prepareStatement(sql);
				stmt.setString(1, nome);
				stmt.setLong(2, siape);
				stmt.setInt(3, ramal);
				stmt.setInt(4, celular);
				stmt.setString(5, sala);
				stmt.setInt(6, cpf);
				stmt.setInt(7, identidade);
				stmt.setString(8, email);
				
				stmt.executeUpdate();
				retorno=true;

			//caso seja update
			}else{
				System.out.println("Update de professor");
				String nome = prof.getNome();
				long siape = prof.getSiape();
				int ramal = prof.getRamal();
				int celular = prof.getCelular();
				String sala = prof.getSala();
				int cpf = prof.getCpf();
				int identidade = prof.getIdentidade();
				String email = prof.getEmail();
				
				String sql ="UPDATE professor SET nome=?, siape=?, ramal=?, celular=?, sala=?, cpf=?, identidade=?, email=? WHERE id=?";
				PreparedStatement stmt  = con.prepareStatement(sql);
				stmt.setString(1, prof.getNome());
				stmt.setLong(2, prof.getSiape());
				stmt.setInt(3, prof.getRamal());
				stmt.setInt(4, prof.getCelular());
				stmt.setString(5, prof.getSala());
				stmt.setInt(6, prof.getCpf());
				stmt.setInt(7, prof.getIdentidade());
				stmt.setString(8, prof.getEmail());
				stmt.setInt(6, prof.getId());
				
				stmt.executeUpdate();
				retorno=true;
			}
			
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}
		return retorno;
	}
	
	public long buscacodigo() throws SQLException {
		Connection c = null;
		PreparedStatement stmt = null;

		c = ConectBancoDeDados.getConexao();
		String sql = "";

		sql = "select MAX(id) as id from professor";
		stmt = c.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		rs.next();
		long codigo = rs.getInt("id");
		rs.close();
		stmt.close();
		return codigo;

	}
	
	
	public ArrayList<Professor> getProfessores(){
		
		ArrayList<Professor> log = new ArrayList<>();
		Connection con = ConectBancoDeDados.getConexao();
		Professor prof;
		
		try{
			String sql = "select * from professor";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				prof = new Professor();
				prof.setId(rs.getInt("id"));
				prof.setNome(rs.getString("nome"));
				prof.setSiape(rs.getLong("siape"));
				prof.setRamal(rs.getInt("ramal"));
				prof.setCelular(rs.getInt("celular"));
				prof.setSala(rs.getString("sala"));
				prof.setCpf(rs.getInt("cpf"));
				prof.setIdentidade(rs.getInt("identidade"));
				prof.setEmail(rs.getString("email"));
				log.add(prof);
				System.out.println("Adicionado no Array");
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}

		return log;
		
	}
	
	public Professor getProfessor(int id){	
		
		Connection con = ConectBancoDeDados.getConexao();
		Professor prof = new Professor();;
		try{
			String sql="SELECT * FROM professor WHERE id = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				prof.setId(rs.getInt("id"));
				prof.setNome(rs.getString("nome"));
				prof.setSiape(rs.getLong("siape"));
				prof.setRamal(rs.getInt("ramal"));
				prof.setCelular(rs.getInt("celular"));
				prof.setSala(rs.getString("sala"));
				prof.setCpf(rs.getInt("cpf"));
				prof.setIdentidade(rs.getInt("identidade"));
				prof.setEmail(rs.getString("email"));
				
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return prof;
		
	}
	
	public void removerUsuario(int id){
		
		Connection con = ConectBancoDeDados.getConexao();
		
		System.out.println("Deletar professor");
		try{
			
			String sql = "DELETE FROM professor WHERE id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
				
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
}
