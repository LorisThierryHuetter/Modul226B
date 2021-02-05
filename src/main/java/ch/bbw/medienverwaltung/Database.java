package ch.bbw.medienverwaltung;

import java.util.ArrayList;

public class Database {
	
	// TODO: Diese Klasse ist wirklich schlecht programmiert
	// In dieser Übung wird sie ja zum Glück verbessert
	
	private ArrayList<CD> cds;
	private ArrayList<Video> videos;

	public Database() {
		cds = new ArrayList<>();
		videos = new ArrayList<>();
	}

	public void addCD(CD cd) {
		cds.add(cd);
	}

	public void addVideo(Video video) {
		videos.add(video);
	}
	
	public void printList() {
		
		// print list of CDs
		for (CD cd : cds) {
			cd.print();
		}

		// print list of videos
		for (Video video : videos) {
			video.print();
		}

	}
}
