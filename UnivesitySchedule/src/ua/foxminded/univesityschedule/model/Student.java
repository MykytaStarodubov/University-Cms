package ua.foxminded.univesityschedule.model;

import ua.foxminded.univesitysvhedule.model.Course;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int studentId;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "student_username")
	private String studentUsername;

	@Column(name = "group_id")
	private int groupId;

	@Column(name = "student_email")
	private String studentEmail;

	@Column(name = "student_college_id")
	private int studentCollegeId;

	@Column(name = "student_mobile")
	private String studentMobile;

	@Column(name = "student_password")
	private Integer studentPassword;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "student_address")
	private String studentAddress;

	@ManyToMany(fetch = FetchType.LAZY)

	private List<Course> courses;

	public Student(int studentId, String fullName, String studentName, String studentUsername, int groupId,
			String studentEmail, String studentCollegeId, String studentMobile, Integer studentPassword,String fullName,String studentAddress) {
		this.studentId = studentId;
		this.fullName = fullName;
		this.studentName = studentName;
		this.studentUsername = studentUsername;
		this.groupId = groupId;
		this.studentEmail = studentEmail;
		this.studentCollegeId = studentCollegeId;
		this.studentMobile = studentMobile;
		this.studentPassword = studentPassword;
		this.fullName =fullName;
		this.studentAddress = studentAddress;
	}

}