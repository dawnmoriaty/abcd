package service;

import dao.AdminDAO;
import entity.Admin;

public class AdminService {
    private AdminDAO adminDAO;

    public AdminService(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }

    public boolean login(String username, String password) {
        try {
            Admin admin = adminDAO.authenticate(username, password);
            return admin != null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
