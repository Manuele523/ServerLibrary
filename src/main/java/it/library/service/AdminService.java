package it.library.service;

import it.library.dao.AdminRepository;
import it.library.dto.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;


    public Admin getValidateAdmin(Admin admin) {
        return adminRepository.getvalAdmin(admin.getUsername(), admin.getPassword());
    }
}
