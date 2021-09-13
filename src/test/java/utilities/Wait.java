package utilities;

public class Wait {
	
	public void syschoManualWaitTime(int waittime) throws Exception{
		
		Object lock = new Object();
		synchronized (lock) {
			lock.wait(waittime);
			
		}
	}

}
