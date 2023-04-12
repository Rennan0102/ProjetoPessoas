package projetopessoas;

public class ProjetoPessoas{
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Nanner");
        p2.setNome("João");
        p3.setNome("Maria");
        p4.setNome("Cláudio");
        
        p1.setSexo("Masculino");
        p3.setSexo("Feminino");
        
        p2.setIdade(25);
        p4.setIdade(19);
        
        p2.setCurso("Medicina");
        p3.setSalario(1725.40f);
        p4.setSetor("Caixa");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    } 
}
