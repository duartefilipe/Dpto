package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conectabd.ConectBancoDeDados;
import modelo.Funcionario;

public class FuncionarioDAO {

	
	
	//Cadastrar e alterar
	public boolean cadastrar(Funcionario func){
		
		Connection con = ConectBancoDeDados.getConexao();

		boolean retorno = false;
		
		try{
			
			//caso seja novo
			if(func.getId() <= 0)
			{
				System.out.println("Cadastro de novo funcionario");
				String nome = func.getNome();
				int siape = func.getSiape();
				int ramal = func.getRamal();
				int celular = func.getCelular();
				String sala = func.getSala();	
				int cpf = func.getCpf();
				int identidade = func.getIdentidade();
				String email = func.getEmail();
				
				String sql ="INSERT INTO funcionario (nome,siape,ramal,celular,sala,cpf,identidade,email) values(?,?,?,?,?,?,?,?)";
				PreparedStatement stmt  = con.prepareStatement(sql);
				stmt.setString(1, nome);
				stmt.setInt(2, siape);
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
				System.out.println("Update de funcionario");
				String nome = func.getNome();
				int siape = func.getSiape();
				int ramal = func.getRamal();
				int celular = func.getCelular();
				String sala = func.getSala();
				int cpf = func.getCpf();
				int identidade = func.getIdentidade();
				String email = func.getEmail();
				
				String sql ="UPDATE funcionario SET nome=?, siape=?, ramal=?, celular=?, sala=?, cpf=?, identidade=?, email=? WHERE id=?";
				PreparedStatement stmt  = con.prepareStatement(sql);
				stmt.setString(1, func.getNome());
				stmt.setInt(2, func.getSiape());
				stmt.setInt(3, func.getRamal());
				stmt.setInt(4, func.getCelular());
				stmt.setString(5, func.getSala());
				stmt.setInt(6, func.getCpf());
				stmt.setInt(7, func.getIdentidade());
				stmt.setString(8, func.getEmail());
				stmt.setInt(6, func.getId());
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

		sql = "select MAX(id) as id from funcionario";
		stmt = c.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		rs.next();
		long codigo = rs.getInt("id");
		rs.close();
		stmt.close();
		return codigo;
	}
	
	
	public ArrayList<Funcionario> getFuncionarios(){
		
		ArrayList<Funcionario> log = new ArrayList<>();
		Connection con = ConectBancoDeDados.getConexao();
		Funcionario func;
		
		try{
			String sql = "select * from funcionarios";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				func = new Funcionario();
				func.setId(rs.getInt("id"));
				func.setNome(rs.getString("nome"));
				func.setSiape(rs.getInt("siape"));
				func.setRamal(rs.getInt("ramal"));
				func.setCelular(rs.getInt("celular"));
				func.setSala(rs.getString("sala"));
				func.setCpf(rs.getInt("cpf"));
				func.setIdentidade(rs.getInt("identidade"));
				func.setEmail(rs.getString("email"));
				log.add(func);
				System.out.println("Adicionado no Array");
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return log;
	}
	
	public Funcionario getFuncionario(int id){	
		Connection con = ConectBancoDeDados.getConexao();
		Funcionario func = new Funcionario();;
		try{
			String sql="SELECT * FROM funcionario WHERE id = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				func.setId(rs.getInt("id"));
				func.setNome(rs.getString("nome"));
				func.setSiape(rs.getInt("siape"));
				func.setRamal(rs.getInt("ramal"));
				func.setCelular(rs.getInt("celular"));
				func.setSala(rs.getString("sala"));
				func.setCpf(rs.getInt("cpf"));
				func.setIdentidade(rs.getInt("identidade"));
				func.setEmail(rs.getString("email"));
				
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return func;
	}
	
	public void removerFuncionario(int id){
		Connection con = ConectBancoDeDados.getConexao();
		System.out.println("Deletar funcionario");
		
		try{
			
			String sql = "DELETE FROM funcionario WHERE id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
				
		}catch(SQLException e){
			e.printStackTrace();
		}
	}	
}
