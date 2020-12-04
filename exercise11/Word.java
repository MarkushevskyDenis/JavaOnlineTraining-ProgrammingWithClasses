package by.jonline.grow.programmingwithclass.exercise11;

public class Word {

	private String word;

	public Word(String word) {
		this.word = word;
	}

	public static Word[] getObject(String sentence) {

		String[] wordArr;
		wordArr = getWord(sentence);

		Word[] word = new Word[wordArr.length];

		for (int i = 0; i < word.length; i++) {
			word[i] = new Word(wordArr[i]);
		}

		return word;
	}

	public static String[] getWord(String sentence) {
		return sentence.replaceAll("[\n\t!\"#$%&'()*+,.:;<=>?@\\[\\]\\\\^_`{|}~]", "").split(" ");
	}

	/*
	 * public String getWord() { return word; }
	 */
}
