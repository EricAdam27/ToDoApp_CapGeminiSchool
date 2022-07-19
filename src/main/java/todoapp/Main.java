package todoapp;

import controller.ProjectController;
import model.ProjectModel;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProjectController projectController = new ProjectController();

        // DELETAR PROJETO
        projectController.deleteById(2);
        projectController.deleteById(3);
        projectController.deleteById(4);

    }
}
