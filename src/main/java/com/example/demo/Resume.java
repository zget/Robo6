package com.example.demo;

public class Resume {

    private String name;
    private String email;
    private String education;
    private String experience;
    private String skill;
    private int skill_rating;

    public Resume() {
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
        this.skill_rating = skill_rating;
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
        return skill_rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
