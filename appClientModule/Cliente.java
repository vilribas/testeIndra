import java.util.Date;

public class Cliente {

     public int Cod_Clie;
     public String Nome_Clie;
     public String CPF_Clie;
     public  String Dia_Nascimento_Clie;
     public  String Mes_Nascimento_Clie;
     public  String Ano_Nascimento_Clie;
     public  String Nome_Filme;
     public  String Ano_Lancamento;


    public String getNome_Clie() {
        return Nome_Clie;
    }
    public void setNome_Clie(String Nome_Clie) {    
        this.Nome_Clie = Nome_Clie;
    }

    public int getCod_Clie() {
        return Cod_Clie;
    }

    public void setCod_Clie(int Cod_Clie) {
        this.Cod_Clie = Cod_Clie;
    }

    public String getCPF_Clie() {
        return CPF_Clie;
    }

    public void setCPF_Clie(String CPF_Clie) {
        this.CPF_Clie = CPF_Clie;
    }

    public String getDia_Nascimento_Clie() {
        return Dia_Nascimento_Clie;
    }

    public void setDia_Nascimento_Clie(String Dia_Nascimento_Clie) {
        this.Dia_Nascimento_Clie = Dia_Nascimento_Clie;
    }

    public String getMes_Nascimento_Clie() {
        return Mes_Nascimento_Clie;
    }

    public void setMes_Nascimento_Clie(String Mes_Nascimento_Clie) {
        this.Mes_Nascimento_Clie = Mes_Nascimento_Clie;
    }

    public String getAno_Nascimento_Clie() {
        return Ano_Nascimento_Clie;
    }

    public void setAno_Nascimento_Clie(String Ano_Nascimento_Clie) {
        this.Ano_Nascimento_Clie = Ano_Nascimento_Clie;
    }

    public String getNome_Filme() {
        return Nome_Filme;
    }

    public void setNome_Filme(String Nome_Filme) {
        this.Nome_Filme = Nome_Filme;
    }

    public String getAno_Lancamento() {
        return Ano_Lancamento;
    }

    public void setAno_Lancamento(String Ano_Lancamento) {
        this.Ano_Lancamento = Ano_Lancamento;
    }

}
