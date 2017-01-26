package prjava01martinezgomez17;

import java.io.*;
public class Prjava01MartinezGomez17 {

    public static void main(String[] args) throws IOException {
        File f = new File("fitxer01MartinezGomez17.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
            bw.write("<html>"); bw.newLine();
            bw.write("    <head>"); bw.newLine();
            bw.write("        <title>"); bw.newLine();
            bw.write("            Nova p&agrave;gina web de MartinezGomez17"); bw.newLine();
            bw.write("        <title>"); bw.newLine();
            bw.write("    </head>"); bw.newLine();
            bw.write("    <body>"); bw.newLine();
            bw.write("        <p>Nova p&agrave;gina web de MartinezGomez17</p>"); bw.newLine();
            bw.write("    </body>"); bw.newLine();
            bw.write("</html>"); bw.newLine();
            bw.close();
        }
    }
    
}
