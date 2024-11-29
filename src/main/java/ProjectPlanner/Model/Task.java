package ProjectPlanner.Model;

public class Task {
    private int projectId;
    private int subprojectId;
    private int taskId;
    private String taskName;
    private int assignedEmployees;
    private double estimatedCost;
    private String startDate;
    private String endDate;
    private boolean isComplete;
    private String taskDescription;

    public Task(int projectId, int subprojectId, int taskId, String taskName, int assignedEmployees, double estimatedCost, String startDate, String endDate, boolean isComplete, String taskDescription) {
        this.projectId = projectId;
        this.subprojectId = subprojectId;
        this.taskId = taskId;
        this.taskName = taskName;
        this.assignedEmployees = assignedEmployees;
        this.estimatedCost = estimatedCost;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isComplete = isComplete;
        this.taskDescription = taskDescription;
    }
    public int getProjectId() {
        return projectId;
    }
    public int getSubprojectId() {
        return subprojectId;
    }
    public int getTaskId() {
        return taskId;
    }
    public String getTaskName() {
        return taskName;
    }
    public int getAssignedEmployees() {
        return assignedEmployees;
    }
    public double getEstimatedCost() {
        return estimatedCost;
    }
    public String getStartDate() {
        return startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public boolean getIsComplete() {
        return isComplete;
    }
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    public void setSubprojectId(int subprojectId) {
        this.subprojectId = subprojectId;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public void setAssignedEmployees(int assignedEmployees) {
        this.assignedEmployees = assignedEmployees;
    }
    public void setEstimatedCost(double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
