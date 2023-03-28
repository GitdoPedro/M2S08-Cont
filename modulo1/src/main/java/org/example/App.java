package org.example;

import lombok.Getter;
import lombok.Setter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        Loja loja =  new Loja("nome","Pedro");

        Loja2 loja2 = LojaMapper.INSTANCE.toLoja2(loja);

    }
}
