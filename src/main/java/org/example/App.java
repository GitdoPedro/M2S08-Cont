package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pessoa pessoa = Pessoa.builder()
                        .id(1l)
                        .nome("Nome")
                        .build();
        pessoa.setId(1l);
        pessoa.setNome("Nome");

        System.out.println(pessoa.getId());
        System.out.println(pessoa.getNome());


        System.out.println( "Hello World!" );

        System.out.println(pessoa);
    }
}
