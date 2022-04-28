package br.com.bruno.zup.treinamento.dto.request;

import br.com.bruno.zup.treinamento.model.Cliente;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.validation.constraints.*;

public class SalvarClienteRequest {

    @Length(max = 25, min = 3, message = "O campo de nome deve ter no mínimo 3 e no máximo 40 digitos")
    @NotBlank(message = "Campo nome não pode ser em branco.")
    private String nome;

    @Length(max = 40, min = 3, message = "O campo de sobrenome deve ter no mínimo 3 e no máximo 25 digitos")
    @NotBlank(message = "Campo sobrenome não pode ser em branco.")
    private String sobrenome;

    @CPF(message = "CPF invalido")
    @NotBlank(message = "Campo cpf não pode ser em branco.")
    private String cpf;

    @Email(message = "Email invalido")
    @NotBlank(message = "Campo email não pode ser em branco.")
    private String email;

    @Positive
    @NotBlank
    private int rg;

    @Length(max = 100, min = 10, message = "O campo de endereço deve ter no mínimo 10 e no máximo 100 digitos")
    @NotBlank(message = "Campo endereco não pode ser em branco.")
    private String endereco;

    @Length(max = 14, min = 13, message = "O número de telefone deve ter 13 ou 14 digitos")
    @NotBlank(message = "Campo telefone não pode ser em branco.")
    @Pattern(regexp = "\\([1-9]\\d\\)\\s?9?\\d{4}-\\d{4}",  message = "Formato de telefone invalido! Ex (21)98745-1234 ou (21)8745-1234")
    private String telefone;

    @Deprecated
    public SalvarClienteRequest() {
    }

    public SalvarClienteRequest(String nome,
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

    public Cliente toModel(){
        return new Cliente(nome, sobrenome,cpf,email,rg, endereco,telefone);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public int getRg() {
        return rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}
