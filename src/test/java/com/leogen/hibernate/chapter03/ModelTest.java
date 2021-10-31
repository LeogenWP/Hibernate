package com.leogen.hibernate.chapter03;

import com.leogen.hibernate.chapter03.pojo.Person;
import com.leogen.hibernate.chapter03.pojo.Ranking;
import com.leogen.hibernate.chapter03.pojo.Skill;
import org.testng.annotations.Test;

public class ModelTest {

    @Test
    public void testModelCreation() {
        Person subject = new Person();
        subject.setName("Boris");
        Person observer = new Person();
        observer.setName("Drew Lombardo");
        Skill skill = new Skill();
        skill.setName("Java");
        Ranking ranking = new Ranking();
        ranking.setSubject(subject);
        ranking.setObserver(observer);
        ranking.setSkill(skill);
        ranking.setRanking(8);
        System.out.println(ranking);
    }
}
