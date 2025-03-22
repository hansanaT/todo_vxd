package com.example.todo.service;

import com.example.todo.model.Task;
import com.example.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public Optional<Task> markTaskAsCompleted(Long id) {
        Optional<Task> task = taskRepository.findById(id);
        task.ifPresent(t -> {
            t.setCompleted(true);
            taskRepository.save(t);
        });
        return task;
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}