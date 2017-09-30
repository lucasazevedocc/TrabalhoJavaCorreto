package trabalhojavanp1.telas;

import interfaces.PadraoPanel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import trabalhojavanp1.objetos.Aluno;
import trabalhojavanp1.objetos.Professor;

//TODO verificar se ja existe disciplinas adicionados antes de liberar a adicao dos professores
public class PanelAdicionarProfessor extends JPanel implements PadraoPanel{
    public static final String PANEL_ADICIONAR_PROFESSOR = "PanelAdicionarProfessor";
    
    private JTextField campoNomeProfessor;
    private JTextField campoEnderecoAluno;
    private JLabel labelTitulo;
    private JLabel labelNomeProfessor;
    private JLabel labelFormacaoProfessor;
    private JLabel labelCursosDoProfessor;
    private JLabel labelCursosExistentes;
    private JLabel labelAdicionarCursosDoProfessor;
    private JButton botaoSalvar;
    private JButton botaoAdicionarCurso;
    private JList listaCursosExistentes; 
    private DefaultListModel modelListaCursosExistentes;
    
    private JLabel labelTeste;
    private Professor professor;
    
    public PanelAdicionarProfessor(){
        initViews();
        initObjects();
    }

    @Override
    public void initViews() {
    	
    	this.setLayout(null);
        this.setLabelTitulo(new JLabel("ADICIONA PROFESSOR"));
        this.getLabelTitulo().setLocation(230,0);
        this.getLabelTitulo().setSize(200,30);
        this.getLabelTitulo().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelNomeProfessor(new JLabel("Nome: "));
        this.getLabelNomeProfessor().setLocation(30,100);
        this.getLabelNomeProfessor().setSize(200,30);
        this.getLabelNomeProfessor().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelFormacaoProfessor(new JLabel("Formação: "));
        this.getLabelFormacaoProfessor().setLocation(30,150);
        this.getLabelFormacaoProfessor().setSize(200,30);
        this.getLabelFormacaoProfessor().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelCursosDoProfessor(new JLabel("Disciplinas: "));
        this.getLabelCursosDoProfessor().setLocation(450,255);
        this.getLabelCursosDoProfessor().setSize(200,30);
        this.getLabelCursosDoProfessor().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelCursosExistentes(new JLabel("Cursos existentes: "));
        this.getLabelCursosExistentes().setLocation(30,255);
        this.getLabelCursosExistentes().setSize(200,30);
        this.getLabelCursosExistentes().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelAdicionarCursosDoProfessor(new JLabel("Adicione curso e disciplina: "));
        this.getLabelAdicionarCursosDoProfessor().setLocation(210,225);
        this.getLabelAdicionarCursosDoProfessor().setSize(200,30);
        this.getLabelAdicionarCursosDoProfessor().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setCampoNomeProfessor(new JTextField());
        this.getCampoNomeProfessor().setSize(400,30);
        this.getCampoNomeProfessor().setLocation(160,100);
        this.getCampoNomeProfessor().setFont(new Font("Serif", Font.BOLD, 24));
      
        this.setCampoEnderecoAluno(new JTextField());
        this.getCampoEnderecoAluno().setSize(400,30);
        this.getCampoEnderecoAluno().setLocation(160,150);
        this.getCampoEnderecoAluno().setFont(new Font("Serif", Font.BOLD, 24));
      
        this.setBotaoSalvar(new JButton("Salvar"));
        this.getBotaoSalvar().setSize(150,40);
        this.getBotaoSalvar().setLocation(220,550);
        this.getBotaoSalvar().setBackground(new Color(150,220,255));
        //this.getBotaoSalvar().addActionListener(this);
        this.getBotaoSalvar().setFont(new Font("Times New Roman", Font.BOLD, 16));      

        this.setBotaoAdicionarCurso(new JButton(" Adicionar "));
        this.getBotaoAdicionarCurso().setSize(100,30);
        this.getBotaoAdicionarCurso().setLocation(230,345);
        this.getBotaoAdicionarCurso().setBackground(new Color(150,220,255));
        //this.getBotaoSalvar().addActionListener(this);
        this.getBotaoSalvar().setFont(new Font("Times New Roman", Font.BOLD, 16));      
        
        this.setModelListaCursosExistentes(new DefaultListModel());
        this.getModelListaCursosExistentes().addElement("Administracao");
        this.getModelListaCursosExistentes().addElement("Ciencias da computacao");
        this.getModelListaCursosExistentes().addElement("Arquitetura");

        this.setListaCursosExistentes(new JList(this.getModelListaCursosExistentes()));
        this.getListaCursosExistentes().setSize(150,180);
        this.getListaCursosExistentes().setLocation(30,300);
        this.getListaCursosExistentes().setBackground(new Color(208,255,255));


        
        this.add(getLabelTitulo());
        this.add(getLabelNomeProfessor());
        this.add(getLabelAdicionarCursosDoProfessor());
        this.add(getLabelCursosDoProfessor());
        this.add(getLabelCursosExistentes());
        this.add(getCampoNomeProfessor());
        this.add(getCampoEnderecoAluno());
        this.add(getBotaoSalvar());
        this.add(getBotaoAdicionarCurso());
        this.add(getListaCursosExistentes());
        this.add(getLabelFormacaoProfessor());



        /*this.labelTeste = new JLabel("PanelAdicionarAluno");
        this.labelTeste.setLocation(50,50);
        this.labelTeste.setSize(200,60);
        this.labelTeste.setFont(new Font("Serif", Font.BOLD, 24));
        
        this.add(this.labelTeste);*/
        this.setVisible(true);
    }

    @Override
    public void initObjects() {
        this.professor = new Professor();
    }
    
    private boolean professorIsValid(){
        if(false){
            return false;
        }else{
            this.professor = new Professor();
            //MONTAR PROFESSOR
            return true;
        }
    }

    
    //GETTERS SETTERS
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

	public JTextField getCampoNomeProfessor() {
		return campoNomeProfessor;
	}

	public void setCampoNomeProfessor(JTextField campoNomeProfessor) {
		this.campoNomeProfessor = campoNomeProfessor;
	}

	public JTextField getCampoEnderecoAluno() {
		return campoEnderecoAluno;
	}

	public void setCampoEnderecoAluno(JTextField campoEnderecoAluno) {
		this.campoEnderecoAluno = campoEnderecoAluno;
	}

	public JLabel getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(JLabel labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	public JLabel getLabelNomeProfessor() {
		return labelNomeProfessor;
	}

	public void setLabelNomeProfessor(JLabel labelNomeProfessor) {
		this.labelNomeProfessor = labelNomeProfessor;
	}

	public JLabel getLabelCursosDoProfessor() {
		return labelCursosDoProfessor;
	}

	public void setLabelCursosDoProfessor(JLabel labelCursosDoProfessor) {
		this.labelCursosDoProfessor = labelCursosDoProfessor;
	}

	public JLabel getLabelCursosExistentes() {
		return labelCursosExistentes;
	}

	public void setLabelCursosExistentes(JLabel labelCursosExistentes) {
		this.labelCursosExistentes = labelCursosExistentes;
	}

	public JLabel getLabelAdicionarCursosDoProfessor() {
		return labelAdicionarCursosDoProfessor;
	}

	public void setLabelAdicionarCursosDoProfessor(JLabel labelAdicionarCursosDoProfessor) {
		this.labelAdicionarCursosDoProfessor = labelAdicionarCursosDoProfessor;
	}

	public JButton getBotaoSalvar() {
		return botaoSalvar;
	}

	public void setBotaoSalvar(JButton botaoSalvar) {
		this.botaoSalvar = botaoSalvar;
	}

	public JButton getBotaoAdicionarCurso() {
		return botaoAdicionarCurso;
	}

	public void setBotaoAdicionarCurso(JButton botaoAdicionarCurso) {
		this.botaoAdicionarCurso = botaoAdicionarCurso;
	}

	public JList getListaCursosExistentes() {
		return listaCursosExistentes;
	}

	public void setListaCursosExistentes(JList listaCursosExistentes) {
		this.listaCursosExistentes = listaCursosExistentes;
	}

	public DefaultListModel getModelListaCursosExistentes() {
		return modelListaCursosExistentes;
	}

	public void setModelListaCursosExistentes(DefaultListModel modelListaCursosExistentes) {
		this.modelListaCursosExistentes = modelListaCursosExistentes;
	}

	public JLabel getLabelTeste() {
		return labelTeste;
	}

	public void setLabelTeste(JLabel labelTeste) {
		this.labelTeste = labelTeste;
	}

	public JLabel getLabelFormacaoProfessor() {
		return labelFormacaoProfessor;
	}

	public void setLabelFormacaoProfessor(JLabel labelFormacaoProfessor) {
		this.labelFormacaoProfessor = labelFormacaoProfessor;
	}
}
