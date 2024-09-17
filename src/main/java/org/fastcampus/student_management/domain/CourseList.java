package org.fastcampus.student_management.domain;

import java.util.List;

public class CourseList {
    private final List<Course> courses;

    public CourseList(List<Course> courses){
        this.courses = courses;
    }

    public void changeAllCoursesFee(int fee) {
        //for(타입 변수명 : 배열 혹은 컬렉션)
        for(Course course: courses) {
            if (course.isSameDay(DayOfWeek.SATURDAY) || course.isSameDay(DayOfWeek.SUNDAY)) {
                course.changeFee((int)(fee * 1.5));
            }
            course.changeFee(fee);
        }
    }
}
