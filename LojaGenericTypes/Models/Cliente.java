package Models;

public class Cliente extends Pessoa{
    public Cliente(Long id, String nome, String telefone){
        super(id, nome, telefone);
    };

    public Cliente (String nome, String telefone){
        super(null, nome, telefone);
    }
}
