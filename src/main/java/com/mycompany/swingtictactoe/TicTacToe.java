package com.mycompany.swingtictactoe;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public class TicTacToe {
    private String playerX;
    private String playerO;
    private String winner = "";
    private int turn = 0;
    private final Main mainClass;
    private JButton[] positions;
    
    public void inputNames() {
        boolean finnisdNameX = false;
        boolean finnisdNameO = false;
        
        while (!finnisdNameX) {
           String playerX = JOptionPane.showInputDialog(null,"Enter the playerX's name: ");
           if (playerX == null) {
               System.exit(0);
           } else {
               if (playerX.length() < 1) {
                   int warning1 = JOptionPane.showConfirmDialog(null,"Please, enter the name","",JOptionPane.DEFAULT_OPTION);
                   if (warning1 == JOptionPane.CLOSED_OPTION) {
                       System.exit(0);
                   } else {
                       continue;
                   }
               } else {
                   finnisdNameX = true;
                   this.setPlayerX(playerX);
               }
           }       
        }
        
        while (!finnisdNameO) {
            String playerO = JOptionPane.showInputDialog(null,"Enter the playerO's name: ");
            if (playerO == null) {
               System.exit(0);
           } else {
               if (playerO.length() < 1) {
                   int warning1 = JOptionPane.showConfirmDialog(null,"Please, enter the name","",JOptionPane.DEFAULT_OPTION);
                   if (warning1 == JOptionPane.CLOSED_OPTION) {
                       System.exit(0);
                   } else {
                       continue;
                   }
               } else {
                   finnisdNameO = true;
                   this.setPlayerO(playerO);
               }
           } 
        }
    }
 
    public void play() {
        int[][] combinations = {
            //Line
            {0,1,2},
            {3,4,5},
            {6,7,8},
            //Column
            {0,3,6},
            {1,4,7},
            {2,5,8},
            //Diagonal
            {0,4,8},
            {2,4,6}
        };
        for (int[] winnerCombinations: combinations) {
            String part1 = this.positions[winnerCombinations[0]].getText();
            String part2 = this.positions[winnerCombinations[1]].getText();
            String part3 = this.positions[winnerCombinations[2]].getText();
            
            if ((part1.equals("X")) && (part2.equals("X")) && (part3.equals("X"))) {
                this.result(this.getPlayerX());
                return;
            } else if ((part1.equals("O")) && (part2.equals("O")) && (part3.equals("O"))) {
                this.result(this.getPlayerO());
                return;
            }
        }
        
        if (this.checkDraw()) {
            int draw = JOptionPane.showConfirmDialog(null, "Draw :(", "", JOptionPane.DEFAULT_OPTION);
            if (draw == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
            } else {
                this.reset();
            }
        }
    }
     
    public void showMessage(JTextField message,int pos,JButton button) {
        Timer timer;
        if (button.getText().equals("X")) {
            message.setForeground(Color.RED);
            message.setText(String.format("X: %s played in the position %d", this.getPlayerX(),
                    this.showPosition(pos)));
            timer = new Timer(2000, event -> {
               message.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        } else if (button.getText().equals("O")) {
            message.setForeground(Color.BLUE);
            message.setText(String.format("O: %s played in the position %d", this.getPlayerO(),
                    this.showPosition(pos)));
            timer = new Timer(2000, event -> {
               message.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        }
    }
    
    public int showPosition(int pos) {
        int location = pos;
        return location;
    }
    
    public void result(String winner) {
        this.setWinner(winner);
        int results = JOptionPane.showConfirmDialog(null,String.format("%s's victory!", this.getWinner()),"Victory",JOptionPane.DEFAULT_OPTION);
        if (results == JOptionPane.CLOSED_OPTION) {
            System.exit(0);
        } else {
            this.reset();
        }
    }
    
    public void reset() {
        int again = JOptionPane.showConfirmDialog(null,"Do you want to play again?","",JOptionPane.YES_NO_OPTION);
        if ((again == JOptionPane.CLOSED_OPTION) || again == 1) {
            System.exit(0);
        } else if (again == 0) {
            this.setPlayerO("");
            this.setPlayerX("");
            this.setWinner("");
            mainClass.clear();
            mainClass.setVisible(false);
            this.inputNames();
            mainClass.setVisible(true);
            mainClass.enableNames();
        }
    }
    
    public boolean checkDraw() {
        for (JButton btn: this.positions) {
            if ((btn.getText().isEmpty())) {
                return false;
            }
        }
        return true;
    }
    
    public int playerTurn() {
        this.setTurn(this.getTurn()+1);
        return this.getTurn();
    }
     
    public String getPlayerX() {
        return this.playerX;
    }

    public void setPlayerX(String playerX) {
        this.playerX = playerX;
    }

    public String getPlayerO() {
        return this.playerO;
    }

    public void setPlayerO(String playerO) {
        this.playerO = playerO;
    }

    public String getWinner() {
        return this.winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    private void setTurn(int turn) {
        this.turn = turn;
    }
    
    private int getTurn() {
        return this.turn;
    }
    
    public void setPositions(JButton[] buttons) {
        this.positions = buttons;
    }
    
    public JButton[] getPositions() {
        return this.positions;
    }
    
    public TicTacToe (Main m,JButton[] columns) {
        this.positions = columns;
        this.mainClass = m;
    }
}
