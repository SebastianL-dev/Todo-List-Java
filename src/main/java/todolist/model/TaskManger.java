package todolist.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManger {
  private List<Task> tasks;
  private List<Report> reports;
  
  public TaskManger() {
    tasks = new ArrayList<Task>();
  }

  public List<Task> getTasks() {
    return tasks;
  }

  public Task getTaskById(int id) {
    // TODO: Implement logic to get task by id with comparator
    return null;
  }

  public List<Task> getTasksByName(String name) {
    // TODO: Implement logic to get task by name with comparator
    return null;
  }

  public List<Task> getTaskByDate(LocalDate date) {
    // TODO: Implement logic to get task by date with comparator
    return null;
  }

  public List<Task> getTaskByAuthor(String author) {
    // TODO: Implement logic to get task by author with comparator
    return null;
  }

  public List<Task> getDoneTasks() {
    // TODO: Implement logic to get done tasks with comparator
    return null;
  }

  public List<Task> getUndoneTasks() {
    // TODO: Implement logic to get undone tasks with comparator
    return null;
  }

  public boolean addTask(Task task) {
    // TODO: Implement logic to create task
    return false;
  }

  public boolean updateTask(Task task) {
    // TODO: Implement logic to update task
    return false;
  }

  public boolean deleteTask(Task task) {
    // TODO: Implement logic to delete task
    return false;
  }

  public List<Report> getReports() {
    return reports;
  }

  public Report getCurrentReport(Report report) {
    // TODO: Implement logic to get current report
    return null;
  }
}
