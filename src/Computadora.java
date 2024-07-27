public class Computadora extends DispositivoElectronico {
    @Override
    public void metodo1() {
        System.out.println("Método 1 en Computadora");
    }

    @Override
    public void metodo21() {
        System.out.println("Método 21 en Computadora");
    }
}

class DispositivoMovil extends DispositivoElectronico {
    @Override
    public void metodo1() {
        System.out.println("Método 1 en DispositivoMovil");
    }

    @Override
    public void metodo21() {
        System.out.println("Método 21 en DispositivoMovil");
    }
}

class Electrodomestico extends DispositivoElectronico {
    @Override
    public void metodo1() {
        System.out.println("Método 1 en Electrodomestico");
    }

    @Override
    public void metodo21() {
        System.out.println("Método 21 en Electrodomestico");
    }
}
