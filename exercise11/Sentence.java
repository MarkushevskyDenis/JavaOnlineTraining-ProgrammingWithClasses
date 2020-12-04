package by.jonline.grow.programmingwithclass.exercise11;

public class Sentence {

	private String sentence;
	private Word[] word;

	public Sentence(Sentence sentence) {
		this.sentence = sentence.sentence;
		this.word = sentence.word;
	}

	public Sentence(String sentence) {

		this.sentence = sentence;
		word = Word.getObject(sentence);

	}

	public static Sentence[] getObject(String text) {

		String[] sentenceArr;
		sentenceArr = getSentence(text);

		Sentence[] sentence = new Sentence[sentenceArr.length];

		for (int i = 0; i < sentence.length; i++) {
			sentence[i] = new Sentence(sentenceArr[i]);
		}

		return sentence;
	}

	public static String[] getSentence(String text) {

		String[] sentenceArr = text.split("\\!\\s|\\.\\s|\\?\\s");
		String[] punctuationMark = getPunctuationMark(text, sentenceArr.length);

		for (int i = 0; i < sentenceArr.length; i++) {
			sentenceArr[i] = sentenceArr[i].replaceAll("[!?.\t\n]", "") + punctuationMark[i];
		}

		return sentenceArr;
	}
	
	private static String[] getPunctuationMark(String text, int size) {
		String[] punctuationMark = new String[size];

		for (int i = 0; i < punctuationMark.length; i++) {
			punctuationMark[i] = "";
		}

		for (int i = 0, j = 0; i < text.length(); i++) {

			if (text.charAt(i) == '!' || text.charAt(i) == '.' || text.charAt(i) == '?') {
				while (i != text.length() && text.charAt(i) != ' ' && text.charAt(i) != '\n') {
					punctuationMark[j] += text.charAt(i);
					i++;
				}
				j++;
			}

		}

		return punctuationMark;
	}

	

	/*
	 * public String getSentence() { return sentence; }
	 * 
	 * public String[] getWord() {
	 * 
	 * String[] str = new String[word.length];
	 * 
	 * for (int i = 0; i < str.length; i++) { str[i] = word[i].getWord(); }
	 * 
	 * return str; }
	 */

}
