package br.com.zup.repository;

import br.com.zup.domain.Document;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<Document, Long>{
    
}
