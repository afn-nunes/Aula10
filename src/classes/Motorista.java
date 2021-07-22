package classes;

import exceptions.MatriculaInvalidaException;
import exceptions.HabilitacaoInvalidaException;

public class Motorista{
    private String nome;
    private String matricula;
    private String habilitacao;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) throws MatriculaInvalidaException {
        if (matricula.matches("[0-9]*")) {
            throw new MatriculaInvalidaException(" A matricula deve ser um numero");
    
        } else if (matricula.length() != 4){
            throw new MatriculaInvalidaException(" A matricula deve conter 4 digitos");

        } else{
            setMatricula(matricula);
        }
    }
    public String getHabilitacao() {
        return habilitacao;
    }
    public void setHabilitacao(String habilitacao) throws HabilitacaoInvalidaException {
        if (habilitacao.matches("[a-d]*")){
            throw new HabilitacaoInvalidaException("A Habilitação deve ser uma letra");
        } else{
            setHabilitacao(habilitacao);
        }
    }
    public Motorista(String nome) {
        this.nome = nome;
    }

    

}