package com.example.demo;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Resume {

    @NotNull
    @Size(min = 3,message=("invalid name"))
    private String name;

    @NotNull
    @Size(min = 9,message=("invalid email"))
    private String email;

    @NotNull
    @Size(min = 4,message=("invalid educational achivement"))
    private String education;

    @NotNull
    @Size(min = 3,message=("invalid year"))
    private String grad_year;

    @NotNull
    @Size(min = 3,message=("invalid experience"))
    private String experience;

    @NotNull
    @Size(min = 3,message=("invalid company"))
    private String company;

    @NotNull
    @Size(min = 3, message=("invalid year"))
    private String years_of_service;

    @NotNull
    @Size(min = 3)
    private String skill;

    @NotNull
    @Size(min = 3)
    private String programming;

    @NotNull
    @Size(min = 3)
    private String msOffice;
    @NotNull
    @Min(1)
    private int prating;

    @NotNull
    @Min(1)
    private int mrating;



    public Resume() {

    }

    public int getPrating() {
        return prating;
    }

    public int getMrating() {
        return mrating;
    }

    public void setPrating(int prating) {
        this.prating = prating;
    }

    public void setMrating(int mrating) {
        this.mrating = mrating;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setYears_of_service(String years_of_service) {
        this.years_of_service = years_of_service;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public void setMsOffice(String msOffice) {
        this.msOffice = msOffice;
    }

    public String getYears_of_service() {
        return years_of_service;
    }

    public String getProgramming() {
        return programming;
    }

    public String getMsOffice() {
        return msOffice;
    }

    public String getGrad_year() {
        return grad_year;
    }

    public void setGrad_year(String grad_year) {
        this.grad_year = grad_year;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setSkill_rating(int skill_rating) {
        this.prating = skill_rating;
    }

    public String getEmail() {
        return email;
    }

    public String getEducation() {
        return education;
    }

    public String getExperience() {
        return experience;
    }

    public String getSkill() {
        return skill;
    }

    public int getSkill_rating() {
        return prating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
