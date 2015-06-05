package u10.tictactoe;

import javax.swing.JButton;

public class JButton_Mine extends javax.swing.JButton {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private boolean isEditable = true;
    private String name;
    
    public JButton_Mine(){
            super();
    }
    
    public boolean isEditable(){
            return isEditable;
    }
    
    public void setEditable(boolean isEditable) {
            this.isEditable = isEditable;
    }
    
    public String getName(){
            return name;
    }
    
    public void setName(String name){
            this.name = name;
    }
}