package Automation;

//job,title,year
public class staffInfo {
	public staffInfo(String job, String title, String year) {
		this.job = job;
		this.title = title;
		this.year = year;

	}

	private String job;
	private String title;
	private String year;

	public String getJob() {
		return job;

	}

	public void setJob(String job) {
		this.job = job;

	}

	public String getTitle() {
		return title;

	}

	public void setTitle(String title) {
		this.title = title;

	}

	public String getYear() {
		return year;

	}

	public void setYear(String year) {
		this.year = year;

	}

	public String toString() {
		return job + "/" + title + "/" + year;

	}
}

