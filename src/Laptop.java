public class Laptop extends Computadora {
    @Override
    public void metodo1() {
        System.out.println("Método 1 en Laptop");
    }

    @Override
    public void metodo21() {
        System.out.println("Método 21 en Laptop");
    }
}

class Desktop extends Computadora {
    @Override
    public void metodo1() {
        System.out.println("Método 1 en Desktop");
    }

    @Override
    public void metodo21() {
        System.out.println("Método 21 en Desktop");
    }
}

class Smartphone extends DispositivoMovil {
    @Override
    public void metodo1() {
        System.out.println("Método 1 en Smartphone");
    }

    @Override
    public void metodo21() {
        System.out.println("Método 21 en Smartphone");
    }
}

class Tablet extends DispositivoMovil {
    @Override
    public void metodo1() {
        System.out.println("Método 1 en Tablet");
    }

    @Override
    public void metodo21() {
        System.out.println("Método 21 en Tablet");
    }
}

class Refrigerador extends Electrodomestico {
    @Override
    public void metodo1() {
        System.out.println("Método 1 en Refrigerador");
    }

    @Override
    public void metodo21() {
        System.out.println("Método 21 en Refrigerador");
    }
}

