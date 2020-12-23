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

	public void addSentence(String str) {

		Sentence[] copy = sentence;

		sentence = new Sentence[copy.length + 1];

		for (int i = 0; i < copy.length; i++) {
			sentence[i] = new Sentence(copy[i]);
		}

		sentence[sentence.length - 1] = new Sentence(str);
		text += " " + str;

	}


	public String getText() {
		return text;
	}

	public String getTitle() {
		return title;
	}

	public Sentence[] getSentence() {
		return sentence;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSentence(Sentence[] sentence) {
		this.sentence = sentence;
	}

}