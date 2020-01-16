package com.bespalov.project.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "profile")
public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    /**
     * Фамилия
     */
    @NotNull
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /**
     * Имя
     */
    @NotNull
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /**
     * Отчество
     */
    @NotNull
    @Column(name = "patronymic", nullable = false)
    private String patronymic;

    /**
     * Дата рождения
     */
    @NotNull
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    /**
     * ИНН
     */
    @Column(name = "inn")
    private String inn;

    /**
     * Серия паспорта
     */
    @Column(name = "passport_series")
    private String passportSeries;

    /**
     * Номер паспорта
     */
    @Column(name = "passport_number")
    private String passportNumber;

    /**
     * Организация, выдавшая паспорт
     */
    @Column(name = "passport_issuer")
    private String passportIssuer;

    /**
     * Дата выдачи паспорта
     */
    @Column(name = "passport_issue_date")
    private LocalDate passportIssueDate;

    /**
     * Количество членов семьи, включая заемщика
     */
    @Column(name = "family_members_amount")
    private Integer familyMembersAmount;


    /**
     * Значение контрольного вопроса на момент заполнения ответа
     */
    @NotNull
    @Column(name = "control_question_value", nullable = false)
    private String controlQuestionValue;

    /**
     * Ответ на контрольный вопрос
     */
    @NotNull
    @Column(name = "control_question_answer", nullable = false)
    private String controlQuestionAnswer;

    @Column(name = "users_note")
    private String usersNote;


    @Column(name = "record_number")
    private String recordNumber;

    @Column(name = "passport_expiration_date")
    private LocalDate passportExpirationDate;

    @OneToOne(optional = false)
    @NotNull
    @JoinColumn(unique = true)
    private User user;

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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

    public String getControlQuestionAnswer() {
        return controlQuestionAnswer;
    }

    public void setControlQuestionAnswer(String controlQuestionAnswer) {
        this.controlQuestionAnswer = controlQuestionAnswer;
    }

    public String getUsersNote() {
        return usersNote;
    }

    public void setUsersNote(String usersNote) {
        this.usersNote = usersNote;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public LocalDate getPassportExpirationDate() {
        return passportExpirationDate;
    }

    public void setPassportExpirationDate(LocalDate passportExpirationDate) {
        this.passportExpirationDate = passportExpirationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", patronymic='" + getPatronymic() + "'" +
                ", birthDate='" + getBirthDate() + "'" +
                ", inn='" + getInn() + "'" +
                ", passportSeries='" + getPassportSeries() + "'" +
                ", passportNumber='" + getPassportNumber() + "'" +
                ", passportIssuer='" + getPassportIssuer() + "'" +
                ", passportIssueDate='" + getPassportIssueDate() + "'" +
                ", familyMembersAmount=" + getFamilyMembersAmount() +
                ", controlQuestionValue='" + getControlQuestionValue() + "'" +
                ", controlQuestionAnswer='" + getControlQuestionAnswer() + "'" +
                ", usersNote='" + getUsersNote() + "'" +
                ", passportExpirationDate='" + getPassportExpirationDate() + "'" +
                "}";
    }
}
