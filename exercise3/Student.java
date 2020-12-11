package by.jonline.grow.programmingwithclass.exercise3;

public class Student {
    String lastName;
    String initial;
    String group;
    int[] rating;

    {
        rating = new int[5];
    }

    public Student() {
    }

    public Student(String lastName, String initial, String group, int[] rating) {

        if (rating.length == 5) {
            this.rating = rating;
        }else{
			System.out.println("неверное число оценок. все оценки выставлены по нулям");
		}

        this.lastName = lastName;
        this.initial = initial;
        this.group = group;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

	public String getInitial() {
		return initial;
	}

	public int[] getRating() {
		return rating;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setRating(int[] rating) {
    	if (rating.length != 5){
			System.out.println("неверное количество оценок");
			return;
		}
		this.rating = rating;
	}

	public boolean excellentStudent() {

        for (int i = 0; i < rating.length; i++) {
            if (rating[i] != 9) {
                if (rating[i] != 10) {
                    return false;
                }
            }
        }

        return true;

    }

}
