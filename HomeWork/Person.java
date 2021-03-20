package com.app;

import java.time.LocalDateTime;

public class Person {

    protected String m_name;
    protected LocalDateTime m_birthdate;
    protected int m_age;

    public Person(String m_name, LocalDateTime m_birthdate, int m_age) {
        this.m_name = m_name;
        this.m_birthdate = m_birthdate;
        this.m_age = m_age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "m_name='" + m_name + '\'' +
                ", m_birthdate=" + m_birthdate +
                ", m_age=" + m_age +
                '}';
    }
}
