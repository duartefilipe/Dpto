package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conectabd.ConectBancoDeDados;
import modelo.Noticia;

public class NoticiaDAO {

	
	
	//Cadastrar e alterar
	public boolean cadastrar(Noticia not){
		
		Connection con = ConectBancoDeDados.getConexao();

		boolean retorno = false;
		
		try{
			
			//caso seja novo
			if(not.getId() <= 0)
			{
				System.out.println("Cadastro de nova noticia");
				String titulo = not.getTitulo();
				String texto = not.getTexto();
				
				String sql ="INSERT INTO noticia (titulo,texto) values(?,?)";
				PreparedStatement stmt  = con.prepareStatement(sql);
				stmt.setString(1, titulo);
				stmt.setString(2, texto);
				stmt.executeUpdate();
				retorno=true;
				
				
				//caso seja update
			}else{
				System.out.println("Update de noticia");
				String titulo = not.getTitulo();
				String texto = not.getTexto();
				
				String sql ="UPDATE noticia SET titulo=?, texto=? WHERE id=?";
				PreparedStatement stmt  = con.prepareStatement(sql);
				stmt.setString(1, not.getTitulo());
				stmt.setString(2, not.getTexto());
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

		sql = "select MAX(id) as id from noticia";
		stmt = c.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		rs.next();
		long codigo = rs.getInt("id");
		rs.close();
		stmt.close();
		return codigo;
	}
	
	
	public ArrayList<Noticia> getNoticias(){
		
		ArrayList<Noticia> log = new ArrayList<>();
		Connection con = ConectBancoDeDados.getConexao();
		Noticia not;
		
		try{
			String sql = "select * from noticia";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				not = new Noticia();
				not.setId(rs.getInt("id"));
				not.setTitulo(rs.getString("titulo"));
				not.setTexto(rs.getString("texto"));
				log.add(not);
				System.out.println("Adicionado no Array");
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return log;
	}
	
	public Noticia getnoticia(int id){	
		Connection con = ConectBancoDeDados.getConexao();
		Noticia not = new Noticia();;
		try{
			String sql="SELECT * FROM noticia WHERE id = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				not.setId(rs.getInt("id"));
				not.setTitulo(rs.getString("titulo"));
				not.setTexto(rs.getString("texto"));
				
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return not;
	}
	
	public void removernoticia(int id){
		Connection con = ConectBancoDeDados.getConexao();
		System.out.println("Deletar noticia");
		
		try{
			
			String sql = "DELETE FROM noticia WHERE id = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
				
		}catch(SQLException e){
			e.printStackTrace();
		}
	}	
}
