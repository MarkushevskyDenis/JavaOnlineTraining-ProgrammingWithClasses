package by.jonline.grow.programmingwithclass.exercise11;

public class Word {

	private String word;

	public Word(){

	}

	public Word(String word) {
		this.word = word;
	}

	public static Word[] getObject(String sentence) {

		String[] wordArr;
		wordArr = splitSentence(sentence);

		Word[] word = new Word[wordArr.length];

		for (int i = 0; i < word.length; i++) {
			word[i] = new Word(wordArr[i]);
		}

		return word;
	}

	public static String[] splitSentence(String sentence) {
		return sentence.replaceAll("[\n\t!\"#$%&'()*+,.:;<=>?@\\[\\]\\\\^_`{|}~]", "").split(" ");
	}


	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}