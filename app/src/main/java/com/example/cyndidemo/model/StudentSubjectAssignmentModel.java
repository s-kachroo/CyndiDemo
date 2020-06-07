package com.example.cyndidemo.model;

public class StudentSubjectAssignmentModel {
    String assignmentName, assignmentSubmissionTime;
    long assignmentPostedTime;
    Boolean isAssignmentCompleted;

    public StudentSubjectAssignmentModel(String assignmentName, String assignmentSubmissionTime, long assignmentPostedTime, Boolean isAssignmentCompleted) {
        this.assignmentName = assignmentName;
        this.assignmentSubmissionTime = assignmentSubmissionTime;
        this.assignmentPostedTime = assignmentPostedTime;
        this.isAssignmentCompleted = isAssignmentCompleted;
    }

    public Boolean getAssignmentCompleted() {
        return isAssignmentCompleted;
    }

    public void setAssignmentCompleted(Boolean assignmentCompleted) {
        isAssignmentCompleted = assignmentCompleted;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getAssignmentSubmissionTime() {
        return assignmentSubmissionTime;
    }

    public void setAssignmentSubmissionTime(String assignmentSubmissionTime) {
        this.assignmentSubmissionTime = assignmentSubmissionTime;
    }

    public long getAssignmentPostedTime() {
        return assignmentPostedTime;
    }

    public void setAssignmentPostedTime(long assignmentPostedTime) {
        this.assignmentPostedTime = assignmentPostedTime;
    }
}
