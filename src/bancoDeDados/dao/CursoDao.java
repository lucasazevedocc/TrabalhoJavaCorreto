package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import trabalhojavanp1.objetos.Aluno;
import trabalhojavanp1.objetos.Curso;

public class CursoDao {

	public void inserirCurso(Curso curso) throws SQLException {

		PreparedStatement query = new ConnectionFactory().getConnection()
				.prepareStatement("INSERT INTO cursos(id, nome) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);

		query.setInt(1, curso.getCodCurso());
		query.setString(2, curso.getNomeDoCurso());

		query.executeUpdate();
		ResultSet id = query.getGeneratedKeys();

		curso.setCodCurso(id.getInt(1));
		System.out.println("curso inserido com sucesso");

		query.close();
	}

	public void deletarCurso(Curso curso) throws SQLException {

		new AlunoCursoDao().deletaCurso(curso);
		new CursoDisciplinaProfessorDao().deletaCurso(curso);

		PreparedStatement query = new ConnectionFactory().getConnection()
				.prepareStatement("DELETE FROM cursos WHERE id = ?");

		query.setInt(1, curso.getCodCurso());

		query.execute();
		query.close();

		new AlunoCursoDao().deletaCurso(curso);
	}

	public void alteraNomeCurso(Curso curso) throws SQLException {

		PreparedStatement query = new ConnectionFactory().getConnection()
				.prepareStatement("UPDATE cursos SET nome = ? WHERE id = ?");

		query.setString(1, curso.getNomeDoCurso());
		query.setInt(2, curso.getCodCurso());

		query.execute();
		query.close();
	}

	public ArrayList<Curso> mostraCursos() throws SQLException {

		ArrayList<Curso> listaCursos = new ArrayList<Curso>();

		PreparedStatement query = new ConnectionFactory().getConnection().prepareStatement("SELECT * FROM cursos");

		ResultSet resposta = query.executeQuery();

		while (resposta.next()) {
			Curso a = new Curso();
			a.setCodCurso(resposta.getInt(1));
			a.setNomeDoCurso(resposta.getString(2));
			listaCursos.add(a);
		}

		query.close();

		return listaCursos;
	}

	public Curso buscaPorId(Curso curso) throws SQLException {

		PreparedStatement query = new ConnectionFactory().getConnection()
				.prepareStatement("SELECT * FROM cursos WHERE id = ?");

		query.setInt(1, curso.getCodCurso());

		ResultSet resposta = query.executeQuery();

		Curso c = new Curso();

		while (resposta.next()) {

			c.setCodCurso(resposta.getInt(1));
			c.setNomeDoCurso(resposta.getString(2));
		}

		query.close();

		return c;
	}
}
