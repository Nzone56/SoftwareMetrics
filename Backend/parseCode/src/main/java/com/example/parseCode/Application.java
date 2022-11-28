package com.example.parseCode;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Application.class, args);
        try{

            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            JavaScriptLexer lexer;
            if (args.length>0)
                lexer = new JavaScriptLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new JavaScriptLexer(CharStreams.fromStream(System.in));
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
            JavaScriptParser parser = new JavaScriptParser(tokens);
            ParseTree tree = parser.program(); // Iniciar el analisis sintáctico en la regla inicial: r
            System.out.println(tree.toStringTree(parser)); // imprime el arbol al estilo LISP
            MyVisitor v = new MyVisitor();
            v.visit(tree);

        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }

}
