package org.troparo.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LOAN")
public class Loan {

    // member variables
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private int Id;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "PLANNED_END_DATE")
    private Date plannedEndDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Book book;


    // getters & setters


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getPlannedEndDate() {
        return plannedEndDate;
    }

    public void setPlannedEndDate(Date plannedEndDate) {
        this.plannedEndDate = plannedEndDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "Id=" + Id +
                ", startDate=" + startDate +
                ", plannedEndDate=" + plannedEndDate +
                ", endDate=" + endDate +
                ", member=" + member +
                ", book=" + book +
                '}';
    }

    public void setBook(Book book) {
        this.book = book;


    }
}