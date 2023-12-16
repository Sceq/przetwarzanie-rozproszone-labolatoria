package pl.studia.przetwarzanie.rozproszone.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email should be a valid email address")
    @Column(name = "email")
    private String email;

    @Column(name = "favorite_book")
    private String favoriteBook;

    @Column(name = "country")
    private String country;
}