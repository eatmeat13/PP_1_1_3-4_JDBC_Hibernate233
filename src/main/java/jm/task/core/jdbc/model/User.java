package jm.task.core.jdbc.model;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private Byte age;

    public User() {

    }

    public User(String name, String lastName, Byte age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
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

    public String getLastName() {
        return lastName;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        User other = (User) obj;
        if (obj == null || getClass() != obj.getClass()) {
            return  false;
        }
        return (age == other.age && name.equals(other.name) && lastName.equals(other.lastName));
    }
    @Override
    public  int hashCode() {
        double result = 5;
        result = result * 7 + age + name.hashCode() + lastName.hashCode();
        return (int) result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

}

