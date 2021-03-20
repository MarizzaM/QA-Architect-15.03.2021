package com.app;

public class Item {

    protected Integer m_key;
    protected Person m_data;

    public Item(Integer m_key, Person m_data) {
        this.m_key = m_key;
        this.m_data = m_data;
    }

    @Override
    public String toString() {
        return "Item{" +
                "m_key=" + m_key +
                ", m_data=" + m_data +
                '}';
    }
}
