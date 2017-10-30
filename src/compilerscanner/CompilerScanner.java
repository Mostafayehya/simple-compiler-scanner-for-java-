/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerscanner;

import java.util.ArrayList;

/**
 *
 * @author mostafayehya
 */
public class CompilerScanner {

    /**
     * @param args the command line arguments
     */
    
  String[] javaKeywords = {
      
"abstract"	,"continue",	"for",	"new",	"switch",
"assert",	"default",	"goto",	"package",	"synchronized",
"boolean",	"do",	"if",	"private",	"this",
"break",	"double",	"implements",	"protected",	"throw",
"byte",	"else"	,"import",	"public",	"throws",
"case",	"enum",	"instanceof",	"return",	"transient",
"catch",	"extends", 	"int",	"short",	"try",
"char",	"final",	"interface",	"static",	"void",
"class",	"finally"	,"long"	,"strictfp"	 ,"volatile",
"const",	"float"	,"native",	"super",	"while"
  };
  
  char[] javaSingleCharOperators ={
      '>', '<', '=',
            '+', '-', '&', '|', '*', '!', '/', '%'
  };
  
  String[] javaMultiCharOperators={
       "+="           ," -="            ," *=",
      "/="             ,"%="            ,"&="
     ,"^="           ,"|="              , "<<"
     ,"=>"           ,">=", ">>"   ,">="
  };
  
    
   char[] javaCharacters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q','r',  's', 't', 'u',
            'v', 'w', 'x', 'y', 'z',
             'A', 'B','C', 'D', 'E', 'F', 'G', 
            'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'O', 'P', 'Q',
            'R',  'S', 'T', 'U', 'V' ,'X','Y','Z'};
    public static void main(String[] args) {
      
        
    }
    
}
