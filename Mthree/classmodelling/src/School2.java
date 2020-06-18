public class School2 {
    private int enrollment;
    private int numberOfTeachers;
    private String[] coursesOffered;
    private String sportNickname;
    private String[] clubsOffered;
    private StudentRoster[] studentRoster;

    public void enrollStudent(Student student){

    }
    public void unenrollStudent(Student student){

    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public void setNumberOfTeachers(int numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
    }

    public String[] getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(String[] coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public String getSportNickname() {
        return sportNickname;
    }

    public void setSportNickname(String sportNickname) {
        this.sportNickname = sportNickname;
    }

    public String[] getClubsOffered() {
        return clubsOffered;
    }

    public void setClubsOffered(String[] clubsOffered) {
        this.clubsOffered = clubsOffered;
    }

    public StudentRoster[] getStudentRoster() {
        return studentRoster;
    }

    public void setStudentRoster(StudentRoster[] studentRoster) {
        this.studentRoster = studentRoster;
    }
}
