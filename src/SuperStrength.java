class SuperHero extends Hero implements ActionHuman {
    String nombre;
    String poder;
    boolean superpoderActivado;
    String[] superpoderes = {"Volar", "Super fuerza"};
    int numSuperpoderes;

    public SuperHero(String nombre, String poder, int salud, int energia) {
        super(salud, energia);
        this.nombre = nombre;
        this.poder = poder;
        this.superpoderActivado = false;
        this.superpoderes = new String[]{"Volar", "Super fuerza"};
        this.numSuperpoderes = this.superpoderes.length;
    }

    public void activarSuperPoder(int poderIndex) {
        if (energia > 0 && poderIndex >= 0 && poderIndex < numSuperpoderes) {
            superpoderActivado = true;
            energia -= 10;  // Reducir la energía al usar el superpoder
            System.out.println(nombre + " ha activado el superpoder: " + superpoderes[poderIndex]);
        }
    }

    public void atacar(SuperHero objetivo) {
        if (salud > 0 && energia > 0) {
            objetivo.salud -= 10;  // Reducir la salud del objetivo al atacar
            energia -= 5;  // Reducir la energía al atacar
            System.out.println(nombre + " ha atacado a " + objetivo.nombre + ". Salud de " + objetivo.nombre + ": " + objetivo.salud);
        }
    }
    public void volar() {
        if (energia >= 20) {
            System.out.println(nombre + " está volando alto en el cielo.");
            energia -= 20;  // Reducir la energía al volar
        } else {
            System.out.println("No hay suficiente energía para volar.");
        }
    }

    @Override
    public void usarManos() {
        System.out.println(nombre + " esta usando sus manos.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se esta moviendo.");
    }

    @Override
    public void saltar() {
        System.out.println(nombre + " esta saltando.");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " esta atacando.");
    }


}