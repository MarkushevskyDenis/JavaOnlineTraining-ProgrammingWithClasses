package by.jonline.grow.programmingwithclass.exercise11;

public class Text {
	private String text;
	private String title;
	private Sentence[] sentence;

	private Text() {

	}

	public Text(Text text) {
		this.title = text.title;
		this.text = text.text;
		this.sentence = text.sentence;
	}

	public Text(String text, String title) {
		this.title = title;
		this.text = text;
		sentence = Sentence.getObject(text);
	}

	/*
	 * 
	 * public String[] getSentence() {
	 * 
	 * String[] str = new String[sentence.length]; for (int i = 0; i < str.length;
	 * i++) { str[i] = sentence[i].getSentence(); }
	 * 
	 * return str; }
	 * 
	 * public String[][] getWord() {
	 * 
	 * String[][] str = new String[sentence.length][];
	 * 
	 * for (int i = 0; i < str.length; i++) { str[i] = sentence[i].getWord(); }
	 * 
	 * return str; }
	 */

	public void add(String str) {

		Sentence[] copy = sentence;

		sentence = new Sentence[copy.length + 1];

		for (int i = 0; i < copy.length; i++) {
			sentence[i] = new Sentence(copy[i]);
		}

		sentence[sentence.length - 1] = new Sentence(str);
		text += " " + str;

	}

	public void outText() {
		System.out.println(text);
	}

	public void outTitle() {
		System.out.println(title);
	}
}
