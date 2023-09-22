public class Teste {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1, "Andressa", "Suporte N1", 
        1500.00, "(99)9999999", "RUA 1, 000 - SJC");
        Funcionario funcionario1 = new Funcionario(2, "Matheus", "Suporte N1", 
        1500.00, "(99)9999999", "RUA 1, 000 - SJC");
        Funcionario funcionario2 = new Funcionario(3, "Bruno", "Suporte N1", 
        1500.00, "(99)9999999", "RUA 1, 000 - SJC");
        Funcionario funcionario3 = new Funcionario(4, "Maria", "Suporte N1", 
        1500.00, "(99)9999999", "RUA 1, 000 - SJC");

        Servico servico = new Servico();

        servico.inserirFuncionario(funcionario);
        servico.inserirFuncionario(funcionario1);
        servico.inserirFuncionario(funcionario2);
        servico.inserirFuncionario(funcionario3);

        for (Funcionario f : servico.listarFuncionarios()) {
            System.out.println(f.getNome());
        }

        //servico.excluirFuncionario(1);

        
        
    }
    
}
