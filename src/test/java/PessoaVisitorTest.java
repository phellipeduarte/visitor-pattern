import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaVisitorTest  {

    @Test
    void deveExibirHospede(){
        Hospede hospede = new Hospede("Phellipe", "123", "30/10/2001", "14/06/2023", new Quarto(505));
        PessoaVisitor pessoaVisitor = new PessoaVisitor();
        String respostaEsperada =
                "{\n" +
                "   Hospede: {\n" +
                "       nome: Phellipe,\n" +
                "       cpf: 123,\n" +
                "       dataNascimento: 30/10/2001,\n" +
                "       dataEntrada: 14/06/2023,\n" +
                "       quarto: 505\n" +
                "   }\n" +
                "}";

        assertEquals(respostaEsperada, pessoaVisitor.exibir(hospede));
    }

    @Test
    void deveExibirFuncionario(){
        Funcionario funcionario = new Funcionario("Junior", "Cozinheiro", new Setor("Cozinha"));
        PessoaVisitor pessoaVisitor = new PessoaVisitor();
        String respostaEsperada =
                "{\n" +
                "   Funcionario: {\n" +
                "       nome: Junior,\n" +
                "       posicao: Cozinheiro,\n" +
                "       setor: Cozinha,\n" +
                "   }\n" +
                "}" ;

        assertEquals(respostaEsperada, pessoaVisitor.exibir(funcionario));
    }
}
