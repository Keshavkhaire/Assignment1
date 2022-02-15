package demo;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Subject 
{
	private long subid;
	private String subjectname;
	public long getSubid() {
		return subid;
	}
	public void setSubid(long subid) {
		this.subid = subid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(subid, subjectname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return subid == other.subid && Objects.equals(subjectname, other.subjectname);
	}
	@Override
	public String toString() {
		return "Subject [subid=" + subid + ", subjectname=" + subjectname + "]";
	}
	public Subject(long subid, String subjectname) {
		super();
		this.subid = subid;
		this.subjectname = subjectname;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
