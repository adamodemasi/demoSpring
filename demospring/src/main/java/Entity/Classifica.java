package Entity;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@Table(appliesTo = "classifica")
public class Classifica implements Serializable {

    public Classifica() {
    }

    @Id
    private int posizione;
    private String squadra;
    private int punti;
    private int giocate;
    private int vinte;
    private int pareggi;
    private int perse;
    private int fatti;
    private int subiti;



    public Classifica(int posizione, String squadra, int punti, int giocate, int vinte, int pareggi, int perse, int fatti, int subiti) {
        this.posizione = posizione;
        this.squadra = squadra;
        this.punti = punti;
        this.giocate = giocate;
        this.vinte = vinte;
        this.pareggi = pareggi;
        this.perse = perse;
        this.fatti = fatti;
        this.subiti = subiti;
    }
}
