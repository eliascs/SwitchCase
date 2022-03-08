import groovyjarjarantlr4.v4.runtime.ParserInterpreter;
import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {

        int media;
        media = Integer.parseInt(JOptionPane.showInputDialog(null, "Apresente uma nota"));


        switch (media){

            case 1,2,3,4: JOptionPane.showInternalMessageDialog(null, "Voce está Reprovado");break;
            case 5,6: JOptionPane.showInternalMessageDialog(null , "Voce está de Recuperação");break;
            case 7,8,9,10: JOptionPane.showInternalMessageDialog(null, "Voce está Aprovado");break;

            default:
                JOptionPane.showInternalMessageDialog(null, "Nota não identificada");break;
        }
    }
}
