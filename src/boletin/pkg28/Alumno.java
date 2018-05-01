
package boletin.pkg28;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Alumno {
    private String nome;
    private int nota;
    private Enderezo enderezo;
    

    public Alumno() {
    }

    public Alumno(String nome, int nota, String rua, int num) {
        this.nome=nome;
        this.nota=nota;
        enderezo=new Enderezo(rua,num);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota=nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo=enderezo;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+", nota: "+nota;
    }
    
    public void cambiarNota(){
        nota=Integer.parseInt(JOptionPane.showInputDialog("Cambiar la nota: "));
        System.out.println("\nNota cambiada: ");
        amosar();
    }
    
    public void cambiarRua(){
        enderezo.rua=JOptionPane.showInputDialog("Cambiar a rua: ");
        System.out.println("\nRua cambiada: ");
        amosar();
    }
    
    public void amosar(){
        System.out.println("Nome: "+nome+", nota: "+nota+", Enderezo: "+enderezo.getRua()+", "+enderezo.getNumero());
    }
    
    
    private class Enderezo{
        private String rua="Garcia Barbón";
        private int numero=6;

        private Enderezo(String rua, int num) {
            rua=rua;
            numero=num;
        }
        
        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua=rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero=numero;
        }
        
    }
    
}
