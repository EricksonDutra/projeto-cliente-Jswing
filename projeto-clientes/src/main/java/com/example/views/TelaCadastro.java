package com.example.views;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.example.enums.TipoSexo;

public class TelaCadastro extends JFrame{
    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelSexo;

    private JTextField campoNome;
    private JTextField campoCPF;
    private JComboBox<TipoSexo> campoSexo;

    private JButton boataoSalvar;

    public TelaCadastro(){
        construirTela();
    }

    private void construirTela(){
        setSize(600, 500);
        setTitle("Cadastro de Cliente");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        this.adicionarCampos();
        this.adicionarBotoes();
        this.adicionarFotos();
    }

    private void adicionarCampos(){
        labelNome = new JLabel("Nome:");
        labelNome.setBounds(20,20,200,20);
        getContentPane().add(labelNome);

        campoNome = new JTextField();
        campoNome.setBounds(20, 40, 200, 20);
        getContentPane().add(campoNome);
        
        labelCpf = new JLabel("CPF:");
        labelCpf.setBounds(20,60,200,20);
        getContentPane().add(labelCpf);

        campoCPF = new JTextField();
        campoCPF.setBounds(20, 80, 200, 20);
        getContentPane().add(campoCPF);

        labelSexo = new JLabel("Sexo:");
        labelSexo.setBounds(20,100,200,20);
        getContentPane().add(labelSexo);

        TipoSexo[] tipoSexo = {null, TipoSexo.M, TipoSexo.F};
        campoSexo = new JComboBox<TipoSexo>(tipoSexo);
        campoSexo.setBounds(20, 120, 200, 20);
        getContentPane().add(campoSexo);

    };
    private void adicionarBotoes(){
        boataoSalvar = new JButton("Salvar");
        boataoSalvar.setBounds(20, 160, 200, 20);
        getContentPane().add(boataoSalvar);
        
    };
    private void adicionarFotos(){};
}
