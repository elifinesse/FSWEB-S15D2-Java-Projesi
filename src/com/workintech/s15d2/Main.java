package com.workintech.s15d2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("pr1", "desc1", "ann", Priority.MED, Status.IN_PROGRESS);
        Task task2 = new Task("pr1", "desc1", "bob", Priority.MED, Status.IN_PROGRESS);
        Task task3 = new Task("pr2", "desc2", "carol", Priority.LOW, Status.ASSIGNED);
        Task task4 = new Task("pr3", "desc3", "carol", Priority.HIGH, Status.IN_QUEUE);
        Task task5 = new Task("pr4", "desc1", "ann", Priority.LOW, Status.IN_PROGRESS);
        Task task6 = new Task("pr5", "desc3", "bob", Priority.MED, Status.ASSIGNED);
        Task task7 = new Task("pr5", "desc3", "carol", Priority.MED, Status.ASSIGNED);

        Set<Task> annsTasks = new HashSet<>();
        annsTasks.add(task1);
        annsTasks.add(task4);
        annsTasks.add(task5);

        Set<Task> bobsTasks = new HashSet<>();
        bobsTasks.add(task2);
        bobsTasks.add(task6);

        Set<Task> carolsTasks = new HashSet<>();
        carolsTasks.add(task3);
        carolsTasks.add(task4);
        carolsTasks.add(task7);


        TaskData october = new TaskData(annsTasks, bobsTasks, carolsTasks);

        List<Set<Task>> taskSetList = new ArrayList<>();
        taskSetList.add(carolsTasks);
        taskSetList.add(annsTasks);
        taskSetList.add(bobsTasks);

        System.out.println(october.getTasks("ALL"));
        october.getTasks("heeey");
        System.out.println("DIFFERENCES: " + october.getDifference(bobsTasks, carolsTasks));
        System.out.println("INTERSECTIONS: " + october.getIntersect(bobsTasks, carolsTasks));
        System.out.println("LIST TO SET, ALL TASKS: " + october.getUnion(taskSetList));


    }
}