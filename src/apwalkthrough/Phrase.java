package apwalkthrough;

public class Phrase {
	private String currentPhrase;

	/** Constructs a new Phrase object. */
	public Phrase(String p) {
		currentPhrase = p;
	}

	/**
	 * Returns the index of the nth occurrence of str in the current phrase; *
	 * returns -1 if the nth occurrence does not exist. * Precondition: str.length()
	 * > 0 and n > 0 * Postcondition: the current phrase is not modified.
	 */
	public int findNthOccurrence(String str, int n) {
		int count = n;
		String phrase = currentPhrase;
		int startingIndex = phrase.indexOf(str);
		while (count > 0 && phrase.indexOf(str) != -1) {
			startingIndex = phrase.indexOf(str);
			phrase = phrase.substring(phrase.indexOf(str) + 1);
			count--;
		}
		if (count > 0) {
			return -1;
		} else {
			return startingIndex;
		}

	}

	/**
	 * Modifies the current phrase by replacing the nth occurrence of str with repl.
	 * * If the nth occurrence does not exist, the current phrase is unchanged. *
	 * Precondition: str.length() > 0 and n > 0
	 */
	public void replaceNthOccurrence(String str, int n, String repl) {
		/* to be implemented in part (a) */
	}

	/**
	 * Returns the index of the last occurrence of str in the current phrase; *
	 * returns -1 if str is not found. * Precondition: str.length() > 0 *
	 * Postcondition: the current phrase is not modified.
	 */
	public int findLastOccurrence(String str) {
		/* to be implemented in part (b) */
		return 0;
	}

	/** Returns a string containing the current phrase. */
	public String toString() {
		return currentPhrase;
	}

	public static void main(String[] args) {
		Phrase myPhrase = new Phrase("testing testing, I'm just suggesting");
		System.out.println(myPhrase.findNthOccurrence("ing", 2));
	}
}
