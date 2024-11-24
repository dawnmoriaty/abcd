import controller.AdminController;
import dao.AdminDAO;
import service.AdminService;
import view.LoginView;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalManagement", "root", "123456");
            AdminDAO adminDAO = new AdminDAO(connection);
            AdminService adminService = new AdminService(adminDAO);
            AdminController adminController = new AdminController(adminService);

            new LoginView(adminController).setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}