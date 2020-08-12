package com.codies.quizapp.Models.RoomModels;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "exam_data_table")
public class ExamData {

    @PrimaryKey(autoGenerate = false)
    private Integer examId;

    private String examTitle;
    private Integer examinerId;
    private String examinerName;
    private String createDate;
    private String startDate;
    private String endDate;
    private String duration;
    private Integer totalMarks;
    private String examStatus;
    private Integer selectedSubjectId;
    private String selectedSubjectName;
    @Embedded(prefix = "subjects_")
    private Subjects subjects;
    @Embedded(prefix = "examClasses_")
    private ExamClasses examClasses;
    @Embedded(prefix = "examConfigs")
    private ExamConfigs examConfigs;

    public ExamData(Integer examId, String examTitle, Integer examinerId, String examinerName, String createDate, String startDate, String endDate, String duration, Integer totalMarks, String examStatus, Integer selectedSubjectId, String selectedSubjectName, Subjects subjects, ExamClasses examClasses, ExamConfigs examConfigs) {
        this.examId = examId;
        this.examTitle = examTitle;
        this.examinerId = examinerId;
        this.examinerName = examinerName;
        this.createDate = createDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.duration = duration;
        this.totalMarks = totalMarks;
        this.examStatus = examStatus;
        this.selectedSubjectId = selectedSubjectId;
        this.selectedSubjectName = selectedSubjectName;
        this.subjects = subjects;
        this.examClasses = examClasses;
        this.examConfigs = examConfigs;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    public Integer getExaminerId() {
        return examinerId;
    }

    public void setExaminerId(Integer examinerId) {
        this.examinerId = examinerId;
    }

    public String getExaminerName() {
        return examinerName;
    }

    public void setExaminerName(String examinerName) {
        this.examinerName = examinerName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getExamStatus() {
        return examStatus;
    }

    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus;
    }

    public Integer getSelectedSubjectId() {
        return selectedSubjectId;
    }

    public void setSelectedSubjectId(Integer selectedSubjectId) {
        this.selectedSubjectId = selectedSubjectId;
    }

    public String getSelectedSubjectName() {
        return selectedSubjectName;
    }

    public void setSelectedSubjectName(String selectedSubjectName) {
        this.selectedSubjectName = selectedSubjectName;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public ExamClasses getExamClasses() {
        return examClasses;
    }

    public void setExamClasses(ExamClasses examClasses) {
        this.examClasses = examClasses;
    }

    public ExamConfigs getExamConfigs() {
        return examConfigs;
    }

    public void setExamConfigs(ExamConfigs examConfigs) {
        this.examConfigs = examConfigs;
    }
}
