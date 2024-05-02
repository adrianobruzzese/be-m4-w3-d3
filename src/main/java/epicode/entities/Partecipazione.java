package epicode.entities;

import javax.persistence.*;

@Entity
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    private String stato;  // "CONFERMATA" o "DA_CONFERMARE"

    public Partecipazione() {}

    public Partecipazione(Persona persona, Evento evento, String stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public String getStato() {
        return stato;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}
