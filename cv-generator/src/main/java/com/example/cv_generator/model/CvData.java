package com.example.cv_generator.model;

public class CvData {

    private String name;
    private String professionalTitle;
    private String email;
    private String phone;
    private String address;
    private String profile;

    private String company1;
    private String position1;
    private String dates1;
    private String achievements1;

    private String company2;
    private String position2;
    private String dates2;
    private String achievements2;

    private String university1;
    private String degree1;
    private String year1;
    private String diploma1;

    private String university2;
    private String degree2;
    private String year2;
    private String diploma2;

    private String skills;

    public CvData() {}

    public CvData(String name, String professionalTitle, String email, String phone, String address, String profile) {
        this.name = name;
        this.professionalTitle = professionalTitle;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.profile = profile;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getProfessionalTitle() { return professionalTitle; }
    public void setProfessionalTitle(String professionalTitle) { this.professionalTitle = professionalTitle; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getProfile() { return profile; }
    public void setProfile(String profile) { this.profile = profile; }

    public String getCompany1() { return company1; }
    public void setCompany1(String company1) { this.company1 = company1; }

    public String getPosition1() { return position1; }
    public void setPosition1(String position1) { this.position1 = position1; }

    public String getDates1() { return dates1; }
    public void setDates1(String dates1) { this.dates1 = dates1; }

    public String getAchievements1() { return achievements1; }
    public void setAchievements1(String achievements1) { this.achievements1 = achievements1; }

    public String getCompany2() { return company2; }
    public void setCompany2(String company2) { this.company2 = company2; }

    public String getPosition2() { return position2; }
    public void setPosition2(String position2) { this.position2 = position2; }

    public String getDates2() { return dates2; }
    public void setDates2(String dates2) { this.dates2 = dates2; }

    public String getAchievements2() { return achievements2; }
    public void setAchievements2(String achievements2) { this.achievements2 = achievements2; }

    public String getUniversity1() { return university1; }
    public void setUniversity1(String university1) { this.university1 = university1; }

    public String getDegree1() { return degree1; }
    public void setDegree1(String degree1) { this.degree1 = degree1; }

    public String getYear1() { return year1; }
    public void setYear1(String year1) { this.year1 = year1; }

    public String getDiploma1() { return diploma1; }
    public void setDiploma1(String diploma1) { this.diploma1 = diploma1; }

    public String getUniversity2() { return university2; }
    public void setUniversity2(String university2) { this.university2 = university2; }

    public String getDegree2() { return degree2; }
    public void setDegree2(String degree2) { this.degree2 = degree2; }

    public String getYear2() { return year2; }
    public void setYear2(String year2) { this.year2 = year2; }

    public String getDiploma2() { return diploma2; }
    public void setDiploma2(String diploma2) { this.diploma2 = diploma2; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }
}
