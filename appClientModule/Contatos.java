import java.util.ArrayList;
import java.util.Scanner;


public class Contatos {
 ArrayList<Cliente> clientes = new ArrayList();

    // variaveis
    protected int codi=0;
    protected String nome;
    protected String cpf;
    protected String Dia_Nascimento_Clie;
    protected String Mes_Nascimento_Clie;
    protected String Ano_Nascimento_Clie;
    protected String Nome_Filme;
    protected String Ano_Lancamento;



    public void Cadastrar_Cliente(){
        Scanner ler = new Scanner(System.in); 
        Cliente Cliente_cad = new Cliente();
        codi=codi + 1;
        Cliente_cad.setCod_Clie(codi);
        System.out.println("Digite o nome do Cliente");
        nome=ler.nextLine();
        Cliente_cad.setNome_Clie(nome);
        System.out.println("Digite o CPF do Cliente");
        cpf=ler.nextLine();
        Cliente_cad.setCPF_Clie(cpf);
        System.out.println("Digite o dia de Nascimento do Cliente");
        Dia_Nascimento_Clie=ler.nextLine();
        Cliente_cad.setDia_Nascimento_Clie(Dia_Nascimento_Clie);
        System.out.println("Digite o mes de Nascimento do Cliente");
        Mes_Nascimento_Clie=ler.nextLine();
        Cliente_cad.setMes_Nascimento_Clie(Mes_Nascimento_Clie);
        System.out.println("Digite o ano de Nascimento do Cliente"); 
        Ano_Nascimento_Clie=ler.nextLine();
        Cliente_cad.setAno_Nascimento_Clie(Ano_Nascimento_Clie);
        System.out.println("Digite a Nome do Filme");
        Nome_Filme=ler.nextLine();
        Cliente_cad.setNome_Clie(Nome_Filme);
        System.out.println("Digite o nome Ano Lancamento");  
        Ano_Lancamento=ler.nextLine();
        Cliente_cad.setAno_Lancamento ("Ano_Lancamento");
        clientes.add(Cliente_cad);
    }

    public void mostraCliente(){
       System.out.println("Teste");
       System.out.println("Numero de clientes: " +clientes.size() );
       for(int i=0;i<clientes.size();i++){
       System.out.println("\nCodigo do Cliente:" + clientes.get(i));
       System.out.println("\nNome:" + clientes.get(i));  
       System.out.println("\nCPF:" + clientes.get(i)); 
       System.out.println("\nDia de Nascimento:" + clientes.get(i));  
       System.out.println("\nMes de Nascimento:" + clientes.get(i)); 
       System.out.println("\nAno de Nascimento:" + clientes.get(i));
       System.out.println("\nNome_Filme:" + clientes.get(i));
       System.out.println("\nAno_Lancamento:" + clientes.get(i));
     }
   }
}