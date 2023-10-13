package be.vdab.mail;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record NieuwLid(@NotBlank String voornaam, @NotBlank String familienaam, @NotNull @Email String emailAdres) {
}
