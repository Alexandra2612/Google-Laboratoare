package Laborator2;


public class SimpleDrawer {
        private int lungime, latime, inaltime, numarSertare, greutate;
        private String culoare;

        public SimpleDrawer(int lungime, int latime,int inaltime, int numarSertare, String culoare){
            this.lungime=lungime;
            this.latime=latime;
            this.inaltime=inaltime;
            this.numarSertare=numarSertare;
            this.greutate=greutate;
            this.culoare=culoare;
        }

        public void deschideDulap(){
            System.out.println("Dulapul a fost deschis");
        }

        public void inchideDulap(){
            System.out.println("Dulapul a fost inchis");
        }

        public void schimbaCuloare(String altaCuloare){
            this.culoare=altaCuloare;
        }

}


