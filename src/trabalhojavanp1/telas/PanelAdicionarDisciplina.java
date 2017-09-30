package trabalhojavanp1.telas;

import interfaces.PadraoFrame;
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
import trabalhojavanp1.objetos.Disciplina;


public class PanelAdicionarDisciplina extends JPanel implements PadraoPanel{
    public static final String PANEL_ADICIONAR_DISCIPLINA = "PanelAdicionarDisciplina";
    
    private JTextField campoNomeDisciplina;
    private JLabel labelTitulo;
    private JLabel labelNomeDisciplina;
    private JLabel labelCursosDaDisciplina;
    private JLabel labelCursosExistentes;
    private JLabel labelAdicionarCursosDaDisciplina;
    private JButton botaoSalvar;
    private JButton botaoAdicionarCurso;
    private JList listaCursosExistentes; 
    private DefaultListModel modelListaCursosExistentes;

    private Disciplina disciplina;
    
    public PanelAdicionarDisciplina(){
        initViews();
        initObjects();
    }

    @Override
    public void initViews() {
    	
    	this.setLayout(null);
    	
        this.setLabelTitulo(new JLabel("ADICIONAR DISCIPLINA"));
        this.getLabelTitulo().setLocation(230,0);
        this.getLabelTitulo().setSize(200,30);
        this.getLabelTitulo().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelNomeDisciplina(new JLabel("Nome: "));
        this.getLabelNomeDisciplina().setLocation(30,100);
        this.getLabelNomeDisciplina().setSize(200,30);
        this.getLabelNomeDisciplina().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelCursosDaDisciplina(new JLabel("Disciplinas do curso: "));
        this.getLabelCursosDaDisciplina().setLocation(450,255);
        this.getLabelCursosDaDisciplina().setSize(200,30);
        this.getLabelCursosDaDisciplina().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelCursosExistentes(new JLabel("Cursos existentes: "));
        this.getLabelCursosExistentes().setLocation(30,255);
        this.getLabelCursosExistentes().setSize(200,30);
        this.getLabelCursosExistentes().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setLabelAdicionarCursosDaDisciplina(new JLabel("Adicione mais disciplina ao curso: "));
        this.getLabelAdicionarCursosDaDisciplina().setLocation(210,225);
        this.getLabelAdicionarCursosDaDisciplina().setSize(200,30);
        this.getLabelAdicionarCursosDaDisciplina().setFont(new Font("Serif", Font.BOLD, 14));
        
        this.setCampoNomeDisciplina(new JTextField());
        this.getCampoNomeDisciplina().setSize(400,30);
        this.getCampoNomeDisciplina().setLocation(160,100);
        this.getCampoNomeDisciplina().setFont(new Font("Serif", Font.BOLD, 24));
      
        this.setBotaoSalvar(new JButton("Salvar"));
        this.getBotaoSalvar().setSize(150,40);
        this.getBotaoSalvar().setLocation(220,550);
        this.getBotaoSalvar().setBackground(new Color(150,220,255));
        //this.getBotaoSalvar().addActionListener(this);
        this.getBotaoSalvar().setFont(new Font("Times New Roman", Font.BOLD, 16));      

        this.setBotaoAdicionarCurso(new JButton(" Adicionar "));
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
        this.add(getLabelNomeDisciplina());
        this.add(getLabelAdicionarCursosDaDisciplina());
        this.add(getLabelCursosDaDisciplina());
        this.add(getLabelCursosExistentes());
        this.add(getCampoNomeDisciplina());
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
        this.disciplina = new Disciplina();
    }
    
    private boolean disciplinaIsValid(){
        if(false){
            return false;
        }else{
            this.disciplina = new Disciplina();
            //MONTAR DIscIPLINA
            return true;
        }
    }

    
    //GETTERS SETTERS
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

	public JTextField getCampoNomeDisciplina() {
		return campoNomeDisciplina;
	}

	public void setCampoNomeDisciplina(JTextField campoNomeDisciplina) {
		this.campoNomeDisciplina = campoNomeDisciplina;
	}

	public JLabel getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(JLabel labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	public JLabel getLabelNomeDisciplina() {
		return labelNomeDisciplina;
	}

	public void setLabelNomeDisciplina(JLabel labelNomeDisciplina) {
		this.labelNomeDisciplina = labelNomeDisciplina;
	}

	public JLabel getLabelCursosDaDisciplina() {
		return labelCursosDaDisciplina;
	}

	public void setLabelCursosDaDisciplina(JLabel labelCursosDaDisciplina) {
		this.labelCursosDaDisciplina = labelCursosDaDisciplina;
	}

	public JLabel getLabelCursosExistentes() {
		return labelCursosExistentes;
	}

	public void setLabelCursosExistentes(JLabel labelCursosExistentes) {
		this.labelCursosExistentes = labelCursosExistentes;
	}

	public JLabel getLabelAdicionarCursosDaDisciplina() {
		return labelAdicionarCursosDaDisciplina;
	}

	public void setLabelAdicionarCursosDaDisciplina(JLabel labelAdicionarCursosDaDisciplina) {
		this.labelAdicionarCursosDaDisciplina = labelAdicionarCursosDaDisciplina;
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
