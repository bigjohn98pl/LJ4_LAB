class Witaj2 {
    String powitanie = "Witamy";

    void powitaj() {
        System.out.println(powitanie);
    }
}

class Witaj {
    public static void main(String[] args) {
        System.out.println("Witaj");

        Witaj2 mojePowitanie = new Witaj2();
        mojePowitanie.powitaj();
    }
}