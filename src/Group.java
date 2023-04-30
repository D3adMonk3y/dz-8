import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    private Student groupLeader;
    private final List<Student> students = new ArrayList<>();

    //Boolean attribute in inner map stands for task completeness
    private final Map<Student, Map<String, Boolean>> tasks = new HashMap<>();

    public Group(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
        tasks.put(student, new HashMap<>());
    }

    public void removeStudent(Student student){
        students.remove(student);
        tasks.remove(student);
    }

    public void renameStudent(Student student, String firstName, String lastName){
        int index = students.indexOf(student);
        students.get(index).setFirstName(firstName);
        students.get(index).setLastName(lastName);
        Map<String, Boolean> temp = tasks.get(student);
        tasks.put(students.get(index), temp);
    }

    public void addTask(String task) {
        for(Map.Entry<Student, Map<String, Boolean>> entry : tasks.entrySet()){
           entry.getValue().put(task, false);
        }
    }

    public void markTaskAsDone(Student student, String task){
        tasks.get(student).put(task, true);
    }
}
