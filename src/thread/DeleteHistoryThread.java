package thread;

import java.util.List;

public class DeleteHistoryThread extends Thread {
	private List<String> historyArrayList;
	private String url;
	
	public DeleteHistoryThread(List<String> history, String url) {
		historyArrayList = history;
		
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;++i) {
			try {
				Thread.sleep(1000);
				System.out.println(i+ "delete" + Thread.currentThread().getId());
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		int index = historyArrayList.lastIndexOf(url); 
		if(index > -1) {
			historyArrayList.remove(index);
		}
		
	}
}
