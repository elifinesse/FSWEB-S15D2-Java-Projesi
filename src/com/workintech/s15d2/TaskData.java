package com.workintech.s15d2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }


    public Set<Task> getTasks(String assignee){
        if(assignee.equals("ann")){
            return annsTasks;
        } else if(assignee.equals("bob")){
            return bobsTasks;
        } else if(assignee.equals("carol")){
            return carolsTasks;
        } else if(assignee.equals("all")){
            Set<Task> allTasks = new HashSet<>(annsTasks);
            allTasks.addAll(bobsTasks);
            allTasks.addAll(carolsTasks);
            return allTasks;
        } else{
            System.out.println("This method only accepts 'ann', 'bob', 'carol' and 'all' as arguments");
            return null;
        }
    }

    public Set<Task> getUnion(List<HashSet> taskList){
        Set<Task> tasksUnion = new HashSet<>();
        for(HashSet task: taskList){
            tasksUnion.addAll(task);
        }
        return tasksUnion;
    }

    public Set<Task> getIntersect(Set<Task> taskSet1, Set<Task> taskSet2){
        Set<Task> taskSetCopy = new HashSet<>(taskSet1);
        taskSetCopy.retainAll(taskSet2);
        return taskSetCopy;
    }

    public Set<Task> getDifference(Set<Task> taskSet1, Set<Task> taskSet2){
        Set<Task> taskSetCopy = new HashSet<>(taskSet1);
        taskSetCopy.removeAll(taskSet2);
        return taskSetCopy;
    }
}
