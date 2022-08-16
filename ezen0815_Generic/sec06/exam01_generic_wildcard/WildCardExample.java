package ezen0815_Generic.sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		// <?> 이므로 무엇이든 다 들어올 수 있지만 예제에서는 Person 타입 넣어줌
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));

		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));

		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));

		registerCourse(personCourse); // <?> 이므로 제한 없음
		registerCourse(workerCourse); // <?> 이므로 제한 없음
		registerCourse(studentCourse); // <?> 이므로 제한 없음
		registerCourse(highStudentCourse); // <?> 이므로 제한 없음
		System.out.println();

		// registerCourseStudent(personCourse); (x)
		// registerCourseStudent(workerCourse); (x)
		registerCourseStudent(studentCourse); // Student 아래로
		registerCourseStudent(highStudentCourse); // Student 아래로
		System.out.println();

		registerCourseWorker(personCourse); // Worker 위로
		registerCourseWorker(workerCourse); // Worker 위로
		// registerCourseWorker(studentCourse); (x)
		// registerCourseWorker(highStudentCourse); (x)
	}
}
