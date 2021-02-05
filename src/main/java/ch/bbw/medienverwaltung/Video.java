package ch.bbw.medienverwaltung;

public class Video {

	private String title;
	private String director;
	private int playingTime;
	private boolean gotIt;
	private String comment;

	public Video(String title, String director, int playingTime) {
		this.title = title;
		this.director = director;
		this.playingTime = playingTime;
		this.gotIt = false;
		this.comment = "<no comment>";
	}

	public void print() {
		System.out.print("Video: " + title + " (" + playingTime + " mins)");
		System.out.println(gotIt ? "*" : "");
		System.out.println("    " + director);
		System.out.println("    " + comment);
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getComment() {
		return comment;
	}
	public void setOwn(boolean ownIt) {
		gotIt = ownIt;
	}
	public boolean getOwn() {
		return gotIt;
	}
}
