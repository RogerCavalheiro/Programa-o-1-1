package aularevisao;

import javax.swing.JOptionPane;

public class AulaRevisao {

    public static void main(String[] args) {

        Emissora emissora = new Emissora();
        
        emissora.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
        emissora.setEndereco(JOptionPane.showInputDialog("Informe seu endereço:"));
        String abertafechada = JOptionPane.showInputDialog("É aberta ou fechada ?(SIM/NAO):");
        if(abertafechada.equals("SIM"))
        {
            emissora.setAberta(true);
        }
       if(abertafechada.equals("NAO")){
           emissora.setAberta(false);
       }
        JOptionPane.showMessageDialog(null, "Informações sobre a Emissora:\n" + emissora.getNome()+"\n" + emissora.getEndereco() + "\n" + emissora.isAberta());
    }
    
}
