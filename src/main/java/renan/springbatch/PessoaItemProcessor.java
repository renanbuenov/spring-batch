package renan.springbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PessoaItemProcessor implements ItemProcessor<Pessoa, Pessoa> {

    private static final Logger log = LoggerFactory.getLogger(PessoaItemProcessor.class);

    @Override
    public Pessoa process(Pessoa pessoa) throws Exception {
        String nome = pessoa.getNome();
        String sobrenome = pessoa.getSobrenome();

        Pessoa pessoaAlterada = new Pessoa(nome, sobrenome);

        log.info("...convertendo " + pessoa.toString() + " para " + pessoaAlterada.toString());

        return pessoaAlterada;
    }
}
