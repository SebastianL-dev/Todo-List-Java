package todolist.model;

import java.time.LocalDate;

public class Task {
  private String name;
  private String description;
  private LocalDate date;
  private String author;
  private boolean done;
  
  public Task() {
  }
  
  public Task(String name, String description, LocalDate date, String author, boolean done) {
    this.name = name;
    this.description = description;
    this.date = date;
    this.author = author;
    this.done = done;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public LocalDate getDate() {
    return date;
  }
  
  public void setDate(LocalDate date) {
    this.date = date;
  }
  
  public String getAuthor() {
    return author;
  }
  
  public void setAuthor(String author) {
    this.author = author;
  }
  
  public boolean isDone() {
    return done;
  }
  
  public void setDone(boolean done) {
    this.done = done;
  }
}
