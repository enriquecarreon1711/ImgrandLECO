package mx.edu.tesoem.isc.imgrandleco;

public class Aleatorio {
    int imagen;
    String aleatorio;
    int sonido;

    public Aleatorio(int imagen, String aleatorio, int sonido){
        this.imagen = imagen;
        this.aleatorio = aleatorio;
        this.sonido = sonido;
    }

    public int getImagen() {
        return imagen;
    }

    public String getAleatorio() {
        return aleatorio;
    }

    public int getSonido() {
        return sonido;
    }
}
