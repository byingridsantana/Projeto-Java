package br.com.ti0523.patrimonio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.ti0523.patrimonio.pojo.Patrimonio;

public class DAOPatrimonio {
	
	public String cadastrar(Patrimonio patrimonio) {
		
		String resp = null;
		
		
		// Variavel para a conexao com o banco de dados
		Connection con = null;
		
		// Para executar as consultas SQL, utilizaremos o comando PreparedStatement associado a uma variavel
		PreparedStatement pst = null;
		
		try {
			// Carregar o drive de comunicação com o banco de dados
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Passagem da URL de conexao com o banco de dados, nome de usuario, senha, e porta de comunicacao.
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbpatrimonio?useSSL=false", "root", "");
			//Criar uma variavel para utilizar o comando INSERT INTO, e assim cadastrar os dados do patrimonio no banco de dados.
			// Esta consulta utilizará passagem de dados por parametro para evitar SQLInject
			
			String consulta = "INSERT INTO tbl_patrimonio(serie, nomepatrimonio, tipo, descricao, localizacao, datafabricacao, dataaquisicao)VALUES(?,?,?,?,?,?,?)";
			// Preparar a consulta para ser executada.
			pst = con.prepareStatement(consulta);
			// Passagem dos dados aos parametros			
			pst.setString(1, consulta);
			// Passagem dos dados aos parametros
			pst.setString(1, patrimonio.getSerie());
			pst.setString(2, patrimonio.getNomepatrimonio());
			pst.setString(3, patrimonio.getTipo());
			pst.setString(4, patrimonio.getDescricao());
			pst.setString(5, patrimonio.getLocalizacao());
			pst.setString(6, patrimonio.getDatafabricacao());
			pst.setString(7, patrimonio.getDataaquisicao());
			
			//Executa a consulta de inserção. A consulta pode retornar 0 (zero) ou 1. Caso retorne 0, significa que os dados do patrimonio não foram cadastrados.
			// Caso retorne 1, significa que cadastrou.
			
			if (pst.executeUpdate() > 0) {
				resp = "Patrimônio cadastrado com sucesso!";
			}
			else {
				resp = "Não foi possivel cadastrar o patrimônio;";
			}
		}
		catch(Exception ex) {
			resp = "Erro ao tentar cadastrar o patrimônio" +ex.getMessage();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return resp;
	}

}
