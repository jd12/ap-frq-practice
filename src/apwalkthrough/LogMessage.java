package apwalkthrough;

public class LogMessage {
	private String machineId;
	private String description;

	/** Precondition: message is a valid log message. */
	public LogMessage(String message) {
		/* to be implemented in part (a) */
	}

	/**
	 * Returns true if the description in this log message properly contains
	 * keyword; * false otherwise.
	 */
	public boolean containsWord(String keyword) {
		/* to be implemented in part (b) */
		return false;
	}

	public String getMachineId() {
		return machineId;
	}

	public String getDescription() {
		return description;
	}
// There may be instance variables, constructors, and methods that are not
// shown. 
	
	public static void main(String[] args) {
		LogMessage message1 = new LogMessage("CLIENT3:security alert – repeated login failures");
		LogMessage message2 = new LogMessage("Webserver:disk offline");
		LogMessage message3 = new LogMessage("SERVER1:file not found");
		LogMessage message4 = new LogMessage("SERVER2:read error on disk DSK1");
		LogMessage message5 = new LogMessage("SERVER1:write error on disk DSK2");
		LogMessage message6 = new LogMessage("Webserver:error on /dev/disk");
		
	}
}
