
package boletin.pkg28;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Alumno {
    String nome="David";
    int nota=8;
    Enderezo enderezo;
    
    Enderezo obxE=new Enderezo();

    public Alumno() {
    }

    public Alumno(String nome, int nota, Enderezo enderezo) {
        this.nome=nome;
        this.nota=nota;
        this.enderezo=enderezo;
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

    public void cambiarNota(){
        nota=Integer.parseInt(JOptionPane.showInputDialog("Cambiar la nota: "));
        System.out.println("\nNota cambiada: ");
        amosar();
    }
    
    public void amosar(){
        System.out.println("Nome: "+nome+", nota: "+nota+", Enderezo: "+obxE.getRua()+", "+obxE.getNumero());
    }
    
    public void verEnderezo(){ 
        Enderezo en=new Enderezo();
        en.cambiarRua();
    }
    
    private class Enderezo{
        String rua="Garcia Barbón";
        int numero=6;
        
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
 
        public void cambiarRua(){
            rua=JOptionPane.showInputDialog("Cambiar a rua: ");
            System.out.println("\nRua cambiada: ");
            amosar();
        }
        
        public void amosar(){
        System.out.println("Nome: "+nome+", nota: "+nota+", Enderezo: "+rua+", "+numero);
        }
        
    }
    
}
