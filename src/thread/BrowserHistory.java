package thread;

import java.util.ArrayList;

public class BrowserHistory {
	public ArrayList<String> historyArrayList = new ArrayList<>();
	
	public synchronized void read(String url) {
		ReadHistoryThread read = new ReadHistoryThread(historyArrayList, url);
		read.start();
	}
	
	public synchronized void delete(String url) {
		DeleteHistoryThread delete = new DeleteHistoryThread(historyArrayList, url);
		delete.start();
	}
	
	public void display() {
		System.out.println("BrowserHistory");
		System.out.println("-----------");
		for(String url: historyArrayList) {
			System.out.println(url);
		}
	}
}
