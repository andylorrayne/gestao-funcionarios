import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Servico {
    
    private HashMap<Integer, Funcionario> bancoDados;

    public Servico(){

        bancoDados = new HashMap<>();

    }

    public void inserirFuncionario (Funcionario funcionario){
        
        bancoDados.put(funcionario.getId(), funcionario);

    }

    public Funcionario pesquisaFuncionario(Integer id){
        Funcionario f = bancoDados.get(id);
        if(f != null){
            return f;
        }else{
            System.err.println("Funcionario não existe");
            return null;
        }

    }

    public List<Funcionario> listarFuncionarios(){
        return new ArrayList<>(bancoDados.values());
    } 

    public void excluirFuncionario (Integer id){

        if(bancoDados.get(id)!= null){
            bancoDados.remove(id);
        }else{
            System.err.println("Funcionario não existe");
        }
        
    }

    public void alterarFuncionario(Funcionario funcionario){

        if(bancoDados.get(funcionario.getId()) != null){
            bancoDados.put(funcionario.getId(), funcionario);
        }else{
            System.err.println("Funcionario não existe");
        }
        

    }

}
