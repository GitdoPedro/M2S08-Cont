package org.example;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@RequiredArgsConstructor

public class Pessoa {
    private Long id;
    private String nome;

}
