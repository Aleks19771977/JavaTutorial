package chapter1;

import javax.swing.*;
import java.util.Scanner;

public class WhatIsYourName {

    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Добрый день! Как Вас зовут?");
        JOptionPane.showMessageDialog(null, "Приятно познакомиться,\n"+name+"!");

    }

}
