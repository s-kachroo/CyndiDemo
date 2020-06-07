package com.example.cyndidemo.model;

import java.util.ArrayList;

public class StudentSubjectModel {
    private String subjectName, subjectCode, teacherName;
    private Boolean isThereNewNotification;
    private Long lastActivity;

    public StudentSubjectModel(String subjectName, String subjectCode, String teacherName, Boolean isThereNewNotification, Long lastActivity) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.teacherName = teacherName;
        this.isThereNewNotification = isThereNewNotification;
        this.lastActivity = lastActivity;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Boolean getThereNewNotification() {
        return isThereNewNotification;
    }

    public void setThereNewNotification(Boolean thereNewNotification) {
        isThereNewNotification = thereNewNotification;
    }

    public Long getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(Long lastActivity) {
        this.lastActivity = lastActivity;
    }
}
