package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {

        File dir = new File(".");  //Создадим объект файл , который соответсует текущему катологу (.) - обозначение для текущего католога.
        dir.list(); //Посмотреть содержимое каталога(Возвращает массив строк)
        String [] names = dir.list();

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        File file = new File("fileT.txt");
        file.length(); //узнать длинну , возврат типа лонг
        System.out.println(file.length());

        FileInputStream fileInputStream = new FileInputStream(file);
        int length = fileInputStream.available();

        System.out.println(length);

        byte[] data = new byte[length];

        fileInputStream.read(data);//ВЫзываем метод read и указываем массив в который нужно прочитать эти данные

        String text = new String(data);//Создать массив строк с этими данными , то есть весь текст приобразуеться в данные
        System.out.println(text);

        FileOutputStream flo = new FileOutputStream(file,true);
        String newText = "\n<!-- Hello World files --> ";
        byte[] newTextBytes = newText.getBytes();//Текст превращает в массив байтов , а массив байтом вы можем записать в файл Z
        flo.write(newTextBytes);
        flo.close();


    }
}
