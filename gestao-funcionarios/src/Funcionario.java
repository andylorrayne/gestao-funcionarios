
public class Funcionario {
    private Integer id;
    private String nome;
    private String cargo;
    private double salario;
    private String telefone;
    private String endereco;

    
    public Funcionario(Integer id, String nome, String cargo, 
    double salario, String telefone, String endereco){
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    

}
