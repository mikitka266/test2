package org.example;

public class Animals {
    private String  name;
    private String pride;
    private Integer age;

    private String commands;

    public Animals(String name, String pride, Integer age, String commands) {
        this.name = name;
        this.pride = pride;
        this.age = age;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPride() {
        return pride;
    }

    public void setPride(String pride) {
        this.pride = pride;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", pride='" + pride + '\'' +
                ", age=" + age +
                ", commands='" + commands + '\'' +
                '}';
    }
}


