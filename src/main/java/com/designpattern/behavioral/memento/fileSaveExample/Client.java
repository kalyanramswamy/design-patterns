package com.designpattern.behavioral.memento.fileSaveExample;

public class Client {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");

        fileWriter.write("hi\n");
        // we save is called caretaker saves memento. hence it can't be undone
        caretaker.save(fileWriter);

        System.out.println(fileWriter);


        fileWriter.write("hii\n");
        System.out.println(fileWriter);

        caretaker.undo(fileWriter);

        System.out.println(fileWriter);
    }
}
