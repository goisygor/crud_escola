package webapp.crud_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.crud_escola.Model.VerificaCadastroAdm;

public interface VerificaCadastroAdmRepository extends CrudRepository<VerificaCadastroAdm, String> {

    VerificaCadastroAdm findByCpf (String cpf);

    VerificaCadastroAdm findBynome (String nome);
    
}
