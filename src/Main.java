
public class Main {
    public static void main(String[] args) {
        SuperHero heroe1 = new SuperHero("Superman", "Vision calorifica", 100, 50);
        SuperHero heroe2 = new SuperHero("Spider-Man", "Telaranas", 90, 40);

        System.out.println(heroe1.nombre + ": Salud = " + heroe1.salud + ", Energia = " + heroe1.energia);
        System.out.println(heroe2.nombre + ": Salud = " + heroe2.salud + ", Energia = " + heroe2.energia);

        heroe1.usarManos();
        heroe1.moverse();
        heroe1.saltar();
        heroe1.activarSuperPoder(0);
        heroe1.atacar(heroe2);
        heroe1.volar();

        System.out.println(heroe1.nombre + ": Salud = " + heroe1.salud + ", Energia = " + heroe1.energia);
        System.out.println(heroe2.nombre + ": Salud = " + heroe2.salud + ", Energia = " + heroe2.energia);

    }
}