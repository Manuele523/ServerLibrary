package it.library.dao;

import it.library.dto.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {

    @Query(value = "SELECT * FROM admin WHERE username = :username AND password = :password", nativeQuery = true)
    public Admin getvalAdmin(@Param("username") String username,
                             @Param("password") String password);
}
