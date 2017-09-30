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
import trabalhojavanp1.objetos.Curso;

//TODO verificar se ja existe professores adicionados antes de liberar a adicao dos cursos
public class PanelAdicionarCurso extends JPanel implements PadraoPanel{
    public static final String PANEL_ADICIONAR_CURSO = "PanelAdicionarCurso";
    
    private JTextField campoNomeCurso;
    private JLabel labelTitulo;
    private JLabel labelNomeCurso;
    private JLabel labelCursosExistentes;
    private JLabel labelAdicionarCursos;
    private JButton botaoSalvar;
    private JButton botaoAdicionarCurso;
    private JList listaCursosExistentes; 
    private DefaultListModel modelListaCursosExistentes;

    private Curso curso;
    
    public JTextField getCampoNomeCurso() {
		return campoNomeCurso;
	}

	public void setCampoNomeCurso(JTextField campoNomeCurso) {
		this.campoNomeCurso = campoNomeCurso;
	}

	public JLabel getLabelNomeCurso() {
		return labelNomeCurso;
	}

	public void setLabelNomeCurso(JLabel labelNomeCurso) {
		this.labelNomeCurso = labelNomeCurso;
	}

	public JLabel getLabelAdicionarCursos() {
		return labelAdicionarCursos;
	}

	public void setLabelAdicionarCursos(JLabel labelAdicionarCursos) {
		this.labelAdicionarCursos = labelAdicionarCursos;
	}

	public PanelAdicionarCurso(){
        initViews();
        initObjects();
    }

    @Override
    public void initViews() {
    	
    	this.setLayout(null);
    	
        this.setLabelTitulo(new JLabel("ADICIONAR CURSO	"));
        this.getLabelTitulo().setLocation(230,0);
        this.getLabelTitulo().setSize(200,30);
        this.getLabelTitulo().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelNomeCurso(new JLabel("Nome: "));
        this.getLabelNomeCurso().setLocation(30,100);
        this.getLabelNomeCurso().setSize(200,30);
        this.getLabelNomeCurso().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelCursosExistentes(new JLabel("Cursos existentes: "));
        this.getLabelCursosExistentes().setLocation(30,255);
        this.getLabelCursosExistentes().setSize(200,30);
        this.getLabelCursosExistentes().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelAdicionarCursos(new JLabel("Adicione os cursos: "));
        this.getLabelAdicionarCursos().setLocation(210,225);
        this.getLabelAdicionarCursos().setSize(200,30);
        this.getLabelAdicionarCursos().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setCampoNomeCurso(new JTextField());
        this.getCampoNomeCurso().setSize(400,30);
        this.getCampoNomeCurso().setLocation(160,100);
        this.getCampoNomeCurso().setFont(new Font("Serif", Font.BOLD, 24));
      
        this.setBotaoSalvar(new JButton("Salvar"));
        this.getBotaoSalvar().setSize(150,40);
        this.getBotaoSalvar().setLocation(220,550);
        this.getBotaoSalvar().setBackground(new Color(150,220,255));
        //this.getBotaoSalvar().addActionListener(this);
        this.getBotaoSalvar().setFont(new Font("Times New Roman", Font.BOLD, 16));      

        this.setBotaoAdicionarCurso(new JButton("Adicionar Curso"));
        this.getBotaoAdicionarCurso().setSize(130,30);
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
        this.add(getLabelNomeCurso());
        this.add(getLabelAdicionarCursos());
        this.add(getLabelCursosExistentes());
        this.add(getLabelCursosExistentes());
        this.add(getCampoNomeCurso());
        this.add(getBotaoSalvar());
        this.add(getBotaoAdicionarCurso());
        this.add(getListaCursosExistentes());



        /*this.labelTeste = new JLabel("PanelAdicionarAluno");
        this.labelTeste.setLocation(50,50);
        this.labelTeste.setSize(200,60);
        this.labelTeste.setFont(new Font("Serif", Font.BOLD, 24));
        
        this.add(this.labelTeste);*/
        this.setVisible(true);
    }

    @Override
    public void initObjects() {
        this.curso = new Curso();
    }
    
    private boolean cursoIsValid(){
        if(false){
            return false;
        }else{
            this.curso = new Curso();
            //MONTAR CURSO
            return true;
        }
    }
    
    //GETTERS SETTERS
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

	public JLabel getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(JLabel labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	public JLabel getLabelCursosExistentes() {
		return labelCursosExistentes;
	}

	public void setLabelCursosExistentes(JLabel labelCursosExistentes) {
		this.labelCursosExistentes = labelCursosExistentes;
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
}
