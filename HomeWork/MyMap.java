package com.app;

import java.util.ArrayList;

public class MyMap {

    ArrayList<Item> items = new ArrayList<>();

    public void put ( Integer key, Person p ){
        for (Item i: items
             ) {
            if (i.m_key == key){
                i.m_data = p;
                break;
            }
        }
        items.add(new Item(key, p));
    }

    public Item get (Integer key){
        for (Item i: items
        ) {
            if (i.m_key == key){
                return i;
            }
        }
        return null;
    }

    public boolean containsKey (Integer key){
        for (Item i: items
        ) {
            if (i.m_key == key){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> getKeys(){
        ArrayList<Integer> keys = new ArrayList<>();
        for (Item i: items
        ) {
            keys.add(i.m_key);
        }
        return keys;
    }

    public ArrayList<Person> getValues (){
        ArrayList<Person> persons = new ArrayList<>();
        for (Item i: items
        ) {
            persons.add(i.m_data);
        }
        return persons;
    }

    public void clear(){
        items.clear();
    }

    public int count(){
        return (int)items.stream().count();
    }

    @Override
    public String toString() {
        return "MyMap{" +
                "items=" + items +
                '}';
    }
}
