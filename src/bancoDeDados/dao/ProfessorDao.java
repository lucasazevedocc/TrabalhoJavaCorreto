package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import trabalhojavanp1.objetos.Aluno;
import trabalhojavanp1.objetos.Professor;

public class ProfessorDao {

	public void inserirProfessor(Professor prof) throws SQLException {

		PreparedStatement query = new ConnectionFactory().getConnection().prepareStatement(
				"INSERT INTO professores(id, nome, formacao) VALUES(?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

		query.setInt(1, prof.getRegistro());
		query.setString(2, prof.getNome());
		query.setString(3, prof.getFormacao());

		query.executeUpdate();
		ResultSet id = query.getGeneratedKeys();

		prof.setRegistro(id.getInt(1));
		System.out.println("professor inserido com sucesso");

		query.close();
	}

	public void deletarProfessor(Professor prof) throws SQLException {

		new CursoDisciplinaProfessorDao().deletaProfessor(prof);
		new DisciplinaProfessorDao().deletaProfessor(prof);

		PreparedStatement query = new ConnectionFactory().getConnection()
				.prepareStatement("DELETE FROM professores WHERE id = ?");

		query.setInt(1, prof.getRegistro());

		query.execute();
		query.close();
	}

	public void alteraNomeCurso(Professor prof) throws SQLException {

		PreparedStatement query = new ConnectionFactory().getConnection()
				.prepareStatement("UPDATE professores SET nome = ?, formacao = ? WHERE id = ?");

		query.setString(1, prof.getNome());
		query.setString(2, prof.getFormacao());
		query.setInt(2, prof.getRegistro());

		query.execute();
		query.close();
	}

	public ArrayList<Professor> mostraProfessores() throws SQLException {

		ArrayList<Professor> listaProfessores = new ArrayList<Professor>();

		PreparedStatement query = new ConnectionFactory().getConnection().prepareStatement("SELECT * FROM professores");

		ResultSet resposta = query.executeQuery();

		while (resposta.next()) {
			Professor a = new Professor();
			a.setRegistro(resposta.getInt(1));
			a.setNome(resposta.getString(2));
			a.setFormacao(resposta.getString(3));

			listaProfessores.add(a);
		}

		query.close();

		return listaProfessores;
	}

	public Professor buscaporId(Professor prof) throws SQLException {

		PreparedStatement query = new ConnectionFactory().getConnection()
				.prepareStatement("SELECT * FROM professores WHERE id = ?");

		query.setInt(1, prof.getRegistro());

		ResultSet resposta = query.executeQuery();

		Professor p = new Professor();

		while (resposta.next()) {

			p.setRegistro(resposta.getInt(1));
			p.setNome(resposta.getString(2));
			p.setFormacao(resposta.getString(3));
		}

		query.close();

		return p;
	}
}
