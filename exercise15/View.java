package by.jonline.grow.programmingwithclass.exercise15;

public class View {

    public void out(Company company) {
        Tour[] tours;
        boolean q = true;

        tours = company.getTour();
        for (int i = 0; i < tours.length; i++) {
            System.out.println(tours[i].toString());
            q = false;
        }

        if (q){
            System.out.println("ничего");
        }

    }

    public void out(Tour[] tours) {

        boolean q = true;

        for (int i = 0; tours[i] != null && i < tours.length; i++) {
            System.out.println(tours[i].toString());
            q = false;
        }

        if (q){
            System.out.println("ничего");
        }

    }

}
