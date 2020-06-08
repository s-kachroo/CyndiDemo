package com.example.cyndidemo.model;

public class StudentSubjectResourceModel {
    String fileName, fileSize, fileFormat, tempFileDate;
    Long fileDate;

    public StudentSubjectResourceModel(String fileName, String fileSize, String fileFormat, String tempFileDate, Long fileDate) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
        this.tempFileDate = tempFileDate;
        this.fileDate = fileDate;
    }

    public String getTempFileDate() {
        return tempFileDate;
    }

    public void setTempFileDate(String tempFileDate) {
        this.tempFileDate = tempFileDate;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public Long getFileDate() {
        return fileDate;
    }

    public void setFileDate(Long fileDate) {
        this.fileDate = fileDate;
    }
}
