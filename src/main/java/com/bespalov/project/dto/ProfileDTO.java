package com.bespalov.project.dto;



import java.io.Serializable;
import java.time.LocalDate;


public class ProfileDTO implements Serializable {

    private Long id;


    private String firstName;


    private String lastName;


    private String patronymic;


    private LocalDate dateOfBirthday;


    private String inn;


    private String passportSeries;


    private String passportNumber;


    private String passportIssuer;


    private LocalDate passportIssueDate;


    private Integer familyMembersAmount;


    private String controlQuestionValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportIssuer() {
        return passportIssuer;
    }

    public void setPassportIssuer(String passportIssuer) {
        this.passportIssuer = passportIssuer;
    }

    public LocalDate getPassportIssueDate() {
        return passportIssueDate;
    }

    public void setPassportIssueDate(LocalDate passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }

    public Integer getFamilyMembersAmount() {
        return familyMembersAmount;
    }

    public void setFamilyMembersAmount(Integer familyMembersAmount) {
        this.familyMembersAmount = familyMembersAmount;
    }

    public String getControlQuestionValue() {
        return controlQuestionValue;
    }

    public void setControlQuestionValue(String controlQuestionValue) {
        this.controlQuestionValue = controlQuestionValue;
    }

    @Override
    public String toString() {
        return "ProfileDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                ", inn='" + inn + '\'' +
                ", passportSeries='" + passportSeries + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", passportIssuer='" + passportIssuer + '\'' +
                ", passportIssueDate=" + passportIssueDate +
                ", familyMembersAmount=" + familyMembersAmount +
                ", controlQuestionValue='" + controlQuestionValue + '\'' +
                '}';
    }
}
