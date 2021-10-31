package com.leogen.hibernate.chapter03.pojo;


import javax.persistence.*;

@Entity
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Person subject;
    @ManyToOne
    private Person observer;
    @ManyToOne
    private Skill skill;
    @Column
    private Integer ranking;

    public Person getSubject() {
        return subject;
    }

    public Ranking setSubject(Person subject) {
        this.subject = subject;
        return this;
    }

    public Person getObserver() {
        return observer;
    }

    public Ranking setObserver(Person observer) {
        this.observer = observer;
        return this;
    }

    public Skill getSkill() {
        return skill;
    }

    public Ranking setSkill(Skill skill) {
        this.skill = skill;
        return this;
    }

    public Integer getRanking() {
        return ranking;
    }

    public Ranking setRanking(Integer ranking) {
        this.ranking = ranking;
        return this;
    }

    @Override
    public String toString() {
        return "Ranking{" +
                "subject=" + subject +
                ", observer=" + observer +
                ", skill=" + skill +
                ", ranking=" + ranking +
                '}';
    }
}
