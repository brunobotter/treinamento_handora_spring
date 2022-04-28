package br.com.bruno.zup.treinamento.model;

import javax.persistence.*;

@Entity
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(nullable = false, length = 25)
    private String nome;

    @Column(nullable = false, length = 40)
    private String sobrenome;

    @Column( nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false)
    private String email;

    @Column( nullable = false, length = 15)
    private int rg;

    @Column(nullable = false, length = 100)
    private String endereco;

    @Column(nullable = false, length = 11)
    private String telefone;

    @Deprecated
    public Cliente() {
    }

    public Cliente(String nome,
                   String sobrenome,
                   String cpf,
                   String email,
                   int rg,
                   String endereco,
                   String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
    }


    public Long getIdCliente() {
        return idCliente;
    }
}
