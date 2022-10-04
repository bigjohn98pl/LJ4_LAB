class Witaj2 {
    String powitanie = "Witamy";

    void powitaj(int ile) {
        for (int i = ile-1; i >= 0 ; i--){
            System.out.println(powitanie);
        }
    }
}

class Witaj {
    public static void main(String[] args) {
        System.out.println("Witaj");

        Witaj2 mojePowitanie = new Witaj2();
        mojePowitanie.powitaj(3);
    }
}