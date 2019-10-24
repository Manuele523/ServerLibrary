package it.library.dao;

import it.library.dto.Type;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeRepository extends CrudRepository<Type, Long> {

    @Query(value = "SELECT * FROM type", nativeQuery = true)
    public List<Type> getTypes();

}
