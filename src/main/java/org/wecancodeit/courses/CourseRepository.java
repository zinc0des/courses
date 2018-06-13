package org.wecancodeit.courses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	private Map<Long, Course> courseList = new HashMap<>();
	
	public CourseRepository() {
		Course java = new Course(1L, "Java", "Java Description");
		Course javascript = new Course(2L, "Javascript", "Javascript Description");
		Course spring = new Course(3L, "Spring", "Spring Description");
		
		courseList.put(java.getId(), java);
		courseList.put(javascript.getId(), javascript);
		courseList.put(spring.getId(), spring);	
	}
	
	//constructor for testing purposes
	public CourseRepository(Course... courses) {
		for(Course course: courses) {
			courseList.put(course.getId(), course);
		}
	}
	public Course findOne(long id) {
		return courseList.get(id);
	}

	public Collection<Course> findAll() {
		return courseList.values();
	}

}
