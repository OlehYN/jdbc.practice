package jdbc.practice.dao;

import jdbc.practice.entity.Teacher;

public interface TeachersDao {
	void addTeacher(Teacher teacher);

	Teacher getTeacherById(int id);

	void saveTacher(Teacher teacher);
}
