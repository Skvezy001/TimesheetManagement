package app.entities;

import java.util.LinkedList;
import java.util.List;

public class Employee {

    private final int id;
    private final String name;
    private final String photo;
    private final String email;

    private List<Project> projects = new LinkedList<>();

    public Employee(int id, String name, String photo, String email) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.email = email;
    }

    public void assignToProject(Project project) {
        projects.add(project);
    }
}
