package Entity;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@Table(appliesTo = "classifica")
public class Classifica implements Serializable {

    public Classifica() {
    }

    @Id
    private Integer posizione;
    private String squadra;
    private int punti;
    private int partite_giocate;
    private int vinte;
    private int pareggiate;
    private int perse;
    private int gol_fatti;
    private int gol_subiti;

    public Classifica(int posizione, String squadra, int punti, int partite_giocate, int vinte, int pareggiate, int perse, int gol_fatti, int gol_subiti) {
        this.posizione = posizione;
        this.squadra = squadra;
        this.punti = punti;
        this.partite_giocate = partite_giocate;
        this.vinte = vinte;
        this.pareggiate = pareggiate;
        this.perse = perse;
        this.gol_fatti = gol_fatti;
        this.gol_subiti = gol_subiti;
    }
}
