package com.example.cyndidemo.model;

import java.util.ArrayList;

public class StudentSubjectModel {
    private String subjectName, subjectCode, teacherName, tempLastActivity;
    private Boolean isThereNewNotification;
    private Long lastActivity;

    public StudentSubjectModel(String subjectName, String subjectCode, String teacherName, String tempLastActivity, Boolean isThereNewNotification, Long lastActivity) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.teacherName = teacherName;
        this.tempLastActivity = tempLastActivity;
        this.isThereNewNotification = isThereNewNotification;
        this.lastActivity = lastActivity;
    }

    public String getTempLastActivity() {
        return tempLastActivity;
    }

    public void setTempLastActivity(String tempLastActivity) {
        this.tempLastActivity = tempLastActivity;
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
