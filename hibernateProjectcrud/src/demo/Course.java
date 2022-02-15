package demo;

import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Course 
{
	private long courseid;
	private String coursename;
	@Embedded
	private Subject subject;
	public long getCourseid() {
		return courseid;
	}
	public void setCourseid(long courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseid, coursename, subject);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseid == other.courseid && Objects.equals(coursename, other.coursename)
				&& Objects.equals(subject, other.subject);
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", subject=" + subject + "]";
	}
	public Course(long courseid, String coursename, Subject subject) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.subject = subject;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
