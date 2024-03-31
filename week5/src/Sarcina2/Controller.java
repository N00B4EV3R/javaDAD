package Sarcina2;

import javax.print.Doc;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

public class Controller {
    private Model model;
    private View view;
    DecimalFormat df = new DecimalFormat("#.##");

    Controller(Model c_model, View c_view){
        model=c_model;
        view=c_view;
//        c_view.addL1Listener(new L1Listener());
//        c_view.addU1Listener(new U1Listener());
//        c_view.addE1Listener(new E1Listener());
//        c_view.addL2Listener(new L2Listener());
//        c_view.addU2Listener(new U2Listener());
//        c_view.addE2Listener(new E2Listener());
        //c_view.addTest(new L1Listener());
        view.addL1Listener(new L1Listener());
        view.addU1Listener(new U1Listener());
        view.addE1Listener(new E1Listener());
        view.addL2Listener(new L2Listener());
        view.addU2Listener(new U2Listener());
        view.addE2Listener(new E2Listener());
        view.addNum1Listener(new Num1Listener());
        view.addNum2Listener(new Num2Listener());
    }

    class L1Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String currency = "MDL";
            view.setValutaB(currency);
            setDimensiuni(0);
            String userInput="";
            try{
                userInput = view.getSuma();
                Double amount = Double.parseDouble(view.getSuma());
                String price = model.convert(view.getValutaA(), view.getValutaB(), amount);
                view.setPrice(price+"");
            } catch (NumberFormatException nfex){
                view.showError("Bad input: '"+userInput+"'");
            }
        }
    }

    class U1Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String currency = "USD";
            view.setValutaB(currency);
            setDimensiuni(0);
            String userInput="";
            try{
                userInput = view.getSuma();
                Double amount = Double.parseDouble(view.getSuma());
                String price = model.convert(view.getValutaA(), view.getValutaB(), amount);
                view.setPrice(price+"");
            } catch (NumberFormatException nfex){
                view.showError("Bad input: '"+userInput+"'");
            }
        }
    }

    class E1Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String currency = "EUR";
            view.setValutaB(currency);
            setDimensiuni(0);
            String userInput="";
            try{
                userInput = view.getSuma();
                Double amount = Double.parseDouble(view.getSuma());
                String price = model.convert(view.getValutaA(), view.getValutaB(), amount);
                view.setPrice(price+"");
            } catch (NumberFormatException nfex){
                view.showError("Bad input: '"+userInput+"'");
            }
        }
    }

    class L2Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String currency = "MDL";
            view.setValutaA(currency);
            setDimensiuni(1);
            String userInput="";
            try{
                userInput = view.getSuma();
                Double amount = Double.parseDouble(view.getSuma());
                String price = model.convert(view.getValutaA(), view.getValutaB(), amount);
                view.setPrice(price+"");
            } catch (NumberFormatException nfex){
                view.showError("Bad input: '"+userInput+"'");
            }
        }
    }

    class U2Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String currency = "USD";
            view.setValutaA(currency);
            setDimensiuni(1);
            String userInput="";
            try{
                userInput = view.getSuma();
                Double amount = Double.parseDouble(view.getSuma());
                String price = model.convert(view.getValutaA(), view.getValutaB(), amount);
                view.setPrice(price+"");
            } catch (NumberFormatException nfex){
                view.showError("Bad input: '"+userInput+"'");
            }
        }
    }

    class E2Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String currency = "EUR";
            view.setValutaA(currency);
            setDimensiuni(1);
            String userInput="";
            try{
                userInput = view.getSuma();
                Double amount = Double.parseDouble(view.getSuma());
                String price = model.convert(view.getValutaA(), view.getValutaB(), amount);
                view.setPrice(price+"");
            } catch (NumberFormatException nfex){
                view.showError("Bad input: '"+userInput+"'");
            }
        }
    }

    class Num1Listener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            updateNum(1);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateNum(1);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateNum(1);
        }
    }

    class Num2Listener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            updateNum(2);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateNum(2);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateNum(2);
        }
    }

    public void updateNum(int k){
//        if(k==1){
//            String userInput="";
//            try{
//                userInput = view.getSuma();
//                Double amount = Double.parseDouble(view.getSuma());
//                String price = model.convert(view.getValutaA(), view.getValutaB(), amount);
//                view.setPrice(price+"");
//            } catch (NumberFormatException nfex){
//                view.showError("Bad input: '"+userInput+"'");
//            }
//        } else {
//            String userOutput="";
//            try{
//                userOutput = view.getAmount();
//                Double amount = Double.parseDouble(view.getAmount());
//                String price = model.convert(view.getValutaB(), view.getValutaA(), amount);
//                view.setSuma(price);
//            } catch (NumberFormatException nfex){
//                view.showError("Bad input: '"+userOutput+"'");
//            }
//        }
    }

    public void setDimensiuni(int i) {
        String valute[] = {"MDL", "USD", "EUR"};
        for (int j = 0; j < valute.length; j++) {
            view.setDim(valute[j], i);
        }
    }
}
