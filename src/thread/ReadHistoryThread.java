package thread;

import java.util.List;

public class ReadHistoryThread extends Thread{
	private List<String> historyArrayList;
	private String url;
	
	public ReadHistoryThread(List<String> history, String url) {
		historyArrayList = history;
		
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;++i) {
			try {
				Thread.sleep(1000);
				System.out.println(i+ "read" + Thread.currentThread().getId());
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	historyArrayList.add(url);
	}
}
