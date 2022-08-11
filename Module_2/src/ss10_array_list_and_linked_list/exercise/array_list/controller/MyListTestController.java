package ss10_array_list_and_linked_list.exercise.array_list.controller;

import ss10_array_list_and_linked_list.exercise.array_list.model.MyList;

public class MyListTestController {
        public static class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static void main(String[] args) {
            Student student1 = new Student(1, "vinh");
            Student student2 = new Student(4, "sơn");
            Student student3 = new Student(5, "giang");
            Student student4 = new Student(6, "trường");
            Student student5 = new Student(7, "danh");
            MyList<Student> studentMyList = new MyList<>();




        }
    }

