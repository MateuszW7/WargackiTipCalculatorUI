import javax.swing.*;
import java.util.EventListener;

public class TipCalculatorGUI extends JFrame{
    private JPanel Bill;
    private JTextArea billArea;
    private JTextArea tipArea;
    private JButton addTip;
    private JButton subTip;
    private JTextArea peopleArea;
    private JButton addPpl;
    private JButton subPpl;
    private JTextArea tipAmountArea;
    private JTextArea totalArea;

    public TipCalculatorGUI(){
        createComponents();
    }

    private void createComponents(){
        TipCalculator calc = new TipCalculator(0,15,1);
        setContentPane(Bill);
        setSize(750,500);
        setLocation(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        addPpl.addActionListener(e ->{
            calc.setNumberOfPeople(calc.getNumberOfPeople()+1);
            peopleArea.setText(String.valueOf(calc.getNumberOfPeople()));
        });
        subPpl.addActionListener(e ->{
            calc.setNumberOfPeople(calc.getNumberOfPeople()-1);
            peopleArea.setText(String.valueOf(calc.getNumberOfPeople()));
        });
        addTip.addActionListener(e ->{
            calc.setTipPercentage(calc.getTip()+1);
            tipArea.setText(String.valueOf(calc.getTip()));
            tipAmountArea.setText(String.valueOf(calc.calculateTip()));
            totalArea.setText(String.valueOf(calc.totalBill()));
        });
        subTip.addActionListener(e ->{
            calc.setTipPercentage(calc.getTip()-1);
            tipArea.setText(String.valueOf(calc.getTip()));
            tipAmountArea.setText(String.valueOf(calc.calculateTip()));
            totalArea.setText(String.valueOf(calc.totalBill()));
        });
    }
}
