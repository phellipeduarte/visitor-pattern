public class PessoaVisitor implements Visitor{

    public String exibir(Pessoa pessoa){ return pessoa.aceitar(this); }

    @Override
    public String exibirHospede(Hospede hospede) {
        return "{\n" +
                "   Hospede: {\n" +
                "       nome: " + hospede.getNome() + ",\n" +
                "       cpf: " + hospede.getCpf() + ",\n" +
                "       dataNascimento: " + hospede.getDataNascimento() + ",\n" +
                "       dataEntrada: " + hospede.getDataEntrada() + ",\n" +
                "       quarto: " + hospede.getQuarto().getNumero() + "\n" +
                "   }\n" +
                "}" ;
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "{\n" +
                "   Funcionario: {\n" +
                "       nome: " + funcionario.getNome() + ",\n" +
                "       posicao: " + funcionario.getPosicao() + ",\n" +
                "       setor: " + funcionario.getSetor().getNome() + ",\n" +
                "   }\n" +
                "}" ;
    }
}
