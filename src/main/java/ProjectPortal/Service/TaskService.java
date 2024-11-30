package ProjectPortal.Service;

import ProjectPortal.Model.Task;
import ProjectPortal.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /**
     * Find all tasks
     * @return
     */
    public List<Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    /**
     * Find task by ID
     * @param taskId
     * @return
     */
    public Optional<Task> getTaskById(String taskId) {
        return Optional.ofNullable(taskRepository.getTaskById(Integer.parseInt(taskId)));
    }

    /**
     * Save a new task
     * @param task
     * @return
     */
    public Task saveTask(Task task) {
        taskRepository.saveTask(
                task.getTaskName(),
                Integer.parseInt(task.getTaskId()),
                task.getAssignedEmployees(),
                (int) task.getEstimatedCost(),
                Integer.parseInt(task.getStartDate()),
                Integer.parseInt(task.getEndDate()),
                task.getIsComplete(),
                task.getTaskDescription()
        );
        return task;
    }


    /**
     * Updates a task
     * @param taskId
     * @param updatedTask
     */
    public void updateTask(int taskId, Task updatedTask) {
        Optional<Task> existingTask = getTaskById(String.valueOf(taskId));

        if (existingTask.isPresent()) {
            taskRepository.updateTask(
                    updatedTask.getTaskName(),
                    taskId,
                    updatedTask.getAssignedEmployees(),
                    (int) updatedTask.getEstimatedCost(),
                    Integer.parseInt(updatedTask.getStartDate()),
                    Integer.parseInt(updatedTask.getEndDate()),
                    updatedTask.getIsComplete(),
                    updatedTask.getTaskDescription()
            );
        } else {
            throw new IllegalArgumentException("Task with ID " + taskId + " does not exist.");
        }
    }

    /**
     * Delete a task by ID
     * @param taskId
     */
    public void deleteTask(int taskId) {
        taskRepository.deleteTaskById(Integer.parseInt(String.valueOf(taskId)));
    }
}