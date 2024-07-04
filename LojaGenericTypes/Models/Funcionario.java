package Models;
public class Funcionario extends Pessoa{

    public Funcionario(Long id, String nome, String telefone){
        super(id, nome, telefone);
    };

    public Funcionario(String nome, String telefone){
        super(null, nome, telefone);
    };
}
