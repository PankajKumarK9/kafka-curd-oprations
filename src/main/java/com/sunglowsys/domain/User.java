package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name= "Pankaj")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String age;
    private String number;

    public User() {
    }

    public User(Long id, String name, String age, String number) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(age, user.age) && Objects.equals(number, user.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, number);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

