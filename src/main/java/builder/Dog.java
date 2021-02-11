package builder;

import java.util.List;

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    private Dog(String name, String type, Integer age, List<String> toys) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.toys = toys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getToys() {
        return toys;
    }

    public void setToys(List<String> toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", toys=" + toys +
                '}';
    }

    static class Builder{
                private String name;
                private String type;
                private Integer age;
                private List<String> toys;

                public Builder withName(String name) {
                    this.name = name;
                    return this;
                }
                public Builder withType(String type) {
                    this.type = type;
                    return this;
                }
                public Builder withAge(Integer age) {
                    this.age = age;
                    return this;
                }
                public Builder withToys(List<String> toys) {
                    this.toys = toys;
                    return this;
                }
                public Dog build() {
                    return new Dog(name, type, age,toys);
                }
            }
        }
