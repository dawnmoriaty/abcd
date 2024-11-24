package controller;

import service.AdminService;

public class AdminController {
    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    public boolean login(String username, String password) {
        return adminService.login(username, password);
    }
}
