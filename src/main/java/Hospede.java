import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Hospede implements Pessoa{

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private LocalDate dataEntrada;
    private Quarto quarto;

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Hospede(String nome, String cpf, String dataNascimento, String dataEntrada, Quarto quarto) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
        this.dataEntrada = LocalDate.parse(dataEntrada, formatter);
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento.format(formatter);
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataEntrada() {
        return dataEntrada.format(formatter);
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirHospede(this);
    }
}
