package be.vdab.mail;

import jakarta.persistence.*;

@Entity
@Table(name="leden")
public class Lid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String voornaam;
    private String familienaam;
    private String emailAdres;

    public Lid(String voornaam, String familienaam, String emailAdres) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.emailAdres = emailAdres;
    }
    protected Lid () {}

    public long getId() {
        return id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public String getEmailAdres() {
        return emailAdres;
    }
}
