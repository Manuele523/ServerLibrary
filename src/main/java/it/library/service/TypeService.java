package it.library.service;

import it.library.dao.TypeRepository;
import it.library.dto.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {

    @Autowired
    private TypeRepository typeRepository;

    public List<Type> getAllTypes() {
        return this.typeRepository.getTypes();
    }
}
